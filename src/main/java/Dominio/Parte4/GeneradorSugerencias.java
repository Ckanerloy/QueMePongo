package Dominio.Parte4;

import Dominio.Prenda;

import java.util.List;

public interface GeneradorSugerencias {
  public List<Atuendo> generarSugerenciaDesde(List<Prenda> prendasAptas);
}
