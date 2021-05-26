package Dominio.Parte5;

import Dominio.Prenda;

public class QuitarRecomendacion implements RecomendacionDePrenda{
  private Guardarropa guardarropa;
  private Prenda prenda;

  public QuitarRecomendacion(Guardarropa guardarropa, Prenda prenda) {
    this.guardarropa = guardarropa;
    this.prenda = prenda;
  }

  public void aplicarEn(Usuario usuario){
    guardarropa.quitarPrenda(prenda,usuario);
  }

  public void deshacerRecomendacion(Usuario usuario){
    guardarropa.agregarPrenda(prenda,usuario);
  }
}
