package Dominio.Parte4;

import Dominio.Prenda;

import java.util.List;
import java.util.stream.Collectors;

public class Asesoramiento {
  private ServicioMeteorologicoAccuWeatherAPI servicioMeteorologicoAccuWeatherAPI;
  private List<Prenda> prendas;

  public Asesoramiento(ServicioMeteorologicoAccuWeatherAPI servicioMeteorologicoAccuWeatherAPI) {
    this.servicioMeteorologicoAccuWeatherAPI = servicioMeteorologicoAccuWeatherAPI;
  }

  public Atuendo sugerirAtuendo(GeneradorSugerencias generador) {
    double temperatura = (double) servicioMeteorologicoAccuWeatherAPI.consultarApi("Temperature").get("value");

    List<Atuendo> todasLasPosiblesPrendas = generador.generarSugerenciaDesde(prendas);

    return todasLasPosiblesPrendas.stream().filter( atuendo-> atuendo.todasAptasParaTemperatura(temperatura)).collect(Collectors.toList()).get(0);
  }
}

