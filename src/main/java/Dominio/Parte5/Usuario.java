package Dominio.Parte5;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
  private List<Guardarropa> guardarropas;
  private List<RecomendacionDePrenda> recomendaciones= new ArrayList<RecomendacionDePrenda>();
  private List<RecomendacionDePrenda> recomendacionesRealizadas= new ArrayList<RecomendacionDePrenda>();

  public Usuario(List<Guardarropa> guardarropas, List<RecomendacionDePrenda> recomendaciones, List<RecomendacionDePrenda> recomendacionesRealizadas) {
    this.guardarropas = guardarropas;
    this.recomendaciones = recomendaciones;
    this.recomendacionesRealizadas = recomendacionesRealizadas;
  }

  public void quitarRecomendacion(RecomendacionDePrenda recomendacion) { recomendaciones.remove(recomendacion); }
  public void agregarRecomendacion(RecomendacionDePrenda recomendacion){
    recomendaciones.add(recomendacion);
  }

  public void aceptarRecomendacion(RecomendacionDePrenda recomendacion){
    validacionDeRecomendacion(recomendacion,recomendaciones);
    recomendacion.aplicarEn(this);
    this.quitarRecomendacion(recomendacion);
    this.agregarARecomendacionesAceptadas(recomendacion);
  }

  private void validacionDeRecomendacion(RecomendacionDePrenda recomendacion,List<RecomendacionDePrenda> lista) {
    if(!lista.contains(recomendacion)){
      throw new RecomendacionInvalidaException("La recomendacion no se encuentra en la lista" + lista);
    }
  }

  private void agregarARecomendacionesAceptadas(RecomendacionDePrenda recomendacion) {
    recomendacionesRealizadas.add(recomendacion);
  }

  public void rechazarRecomendacion(RecomendacionDePrenda recomendacion){
    this.quitarRecomendacion(recomendacion);
  }

  public void deshacerRecomedandacion(RecomendacionDePrenda recomendacion){
    this.validacionDeRecomendacion(recomendacion,recomendacionesRealizadas);
    recomendacion.deshacerRecomendacion(this);
  }

}
