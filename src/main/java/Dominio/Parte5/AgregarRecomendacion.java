package Dominio.Parte5;

import Dominio.Prenda;

public class AgregarRecomendacion implements RecomendacionDePrenda{
  private Guardarropa guardarropa;
  private Prenda prenda;

  public AgregarRecomendacion(Guardarropa guardarropa, Prenda prenda) {
    this.guardarropa = guardarropa;
    this.prenda = prenda;
  }

  public void aplicarEn(Usuario usuario){
    guardarropa.agregarPrenda(prenda,usuario);
  }

  public void deshacerRecomendacion(Usuario usuario){
    guardarropa.quitarPrenda(prenda,usuario);
  }
}
