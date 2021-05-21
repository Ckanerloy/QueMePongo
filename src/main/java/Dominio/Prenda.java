package Dominio;

import Dominio.Parte2.Trama;

public class Prenda {
  private Tipo tipo;
  private Material material;
  private Color colorPrimario;
  private Color colorSecundario;
  private Trama trama;
  double temperatura;

  public Prenda(Tipo tipo, Material material, Color colorPrimario,Color colorSecundario,Trama trama) {
    this.tipo = tipo;
    this.material = material;
    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario;
    this.trama=trama;
  }

  public Categoria categoria(){
    return tipo.getCategoria();
  }

  public boolean aptaTemperatura(double temperatura){
    return this.temperatura<=temperatura;
  }

  public boolean esParteSuperior() {
    return this.categoria()==Categoria.PARTE_SUPERIOR;
  }

  public boolean esParteInferior() {
    return this.categoria()==Categoria.PARTE_INFERIOR;
  }

  public boolean esCalzado() {
    return this.categoria()==Categoria.CALZADO;
  }

  public boolean esAccesorio() {
    return this.categoria()==Categoria.ACCESORIOS;
  }
}