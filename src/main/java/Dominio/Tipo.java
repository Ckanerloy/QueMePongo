package Dominio;

import java.util.List;

public class Tipo {
  private Categoria categoria;
  private List<Material> materialesAdecuados;

  public Tipo(Categoria categoria,List<Material> materialesAdecuados) {
    this.categoria = categoria;
    this.materialesAdecuados=materialesAdecuados;
  }

  public Categoria getCategoria() {
    return categoria;
  }

  public boolean admiteMaterial(Material material){
    return materialesAdecuados.contains(material);
  }
}