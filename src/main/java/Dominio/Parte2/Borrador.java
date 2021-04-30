package Dominio.Parte2;

import Dominio.*;

public class Borrador {
  public Tipo tipo;
  public Material material;
  public Color colorPrimario;
  public Color colorSecundario;
  public Trama trama;

  public void setTipo(Tipo tipo) {
    this.tipo = tipo;
  }

  public void setMaterial(Material material) {
    this.material = material;
  }

  public void setColorPrimario(Color colorPrimario) {
    this.colorPrimario = colorPrimario;
  }

  public void setColorSecundario(Color colorSecundario) {
    this.colorSecundario = colorSecundario;
  }

  public void setTrama(Trama trama) {
    this.trama = trama;
  }

  public Prenda crearPrenda(){
    if(tipo == null || material == null || colorPrimario == null){
      throw new PrendaInvalidaException("Faltan datos requeridos");
    }
    if(trama == null){
      this.trama=Trama.LISA;
    }
    return new Prenda(tipo,material,colorPrimario,colorSecundario,trama);
  }
}
//Falta validar el tipo con el material
