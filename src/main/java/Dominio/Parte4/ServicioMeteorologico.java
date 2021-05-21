package Dominio.Parte4;

import java.util.Map;

public interface ServicioMeteorologico {
  Map<String,Object> obtenerCondicionesClimaticas(String direccion);
}
