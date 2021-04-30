package Dominio.Parte2;

import Dominio.Prenda;

public class Uniforme {
  public Prenda prendaSuperior;
  public Prenda parteInferior;
  public Prenda calzado;

  public Uniforme(Prenda prendaSuperior, Prenda parteInferior, Prenda calzado) {
    this.prendaSuperior = prendaSuperior;
    this.parteInferior = parteInferior;
    this.calzado = calzado;
  }


}
