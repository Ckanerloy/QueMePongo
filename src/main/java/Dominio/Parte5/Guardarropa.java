package Dominio.Parte5;

import Dominio.Prenda;

import java.util.List;

public class Guardarropa {
  private List<Prenda> prendas;
  private Usuario propietario;

  public void quitarPrenda(Prenda prenda,Usuario usuario){
    this.validarPropietario(usuario);
    prendas.remove(prenda);
  }

  public void agregarPrenda(Prenda prenda,Usuario usuario){
    this.validarPropietario(usuario);
    prendas.add(prenda);
  }

  private void validarPropietario(Usuario usuario) {
    if(!usuario.equals(propietario)){
      throw new GuardarropaException("No es el propietario del guardarropa");
    }
  }

}
