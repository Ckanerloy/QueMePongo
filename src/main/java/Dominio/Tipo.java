package Dominio;

public class Tipo {
  public Categoria categoria;

  public Tipo(Categoria categoria) {
    this.categoria = categoria;
  }

  public Categoria getCategoria() {
    return categoria;
  }
}