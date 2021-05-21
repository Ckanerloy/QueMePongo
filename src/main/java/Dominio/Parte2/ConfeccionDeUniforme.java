package Dominio.Parte2;

import Dominio.*;

import java.util.Arrays;

abstract public class ConfeccionDeUniforme {
  public Uniforme armarUniforme(){
    return new Uniforme(this.hacerParteSuperior(),this.hacerParteInferior(),this.hacerCalzado());
  }

  protected abstract Prenda hacerParteSuperior();
  protected abstract Prenda hacerParteInferior();
  protected abstract Prenda hacerCalzado();
}

//Ejemplo
class InstitutoDonOrione extends ConfeccionDeUniforme{
  @Override
  public Prenda hacerParteSuperior(){
    Borrador borrador=new Borrador();
    borrador.setTipo(new Tipo(Categoria.PARTE_SUPERIOR, Arrays.asList(Material.ALGODON,Material.CUERO)));
    borrador.setMaterial(Material.ALGODON);
    borrador.setColorPrimario(new Color(0,0,100));
    return borrador.crearPrenda();
  }

  @Override
  public Prenda hacerParteInferior(){
    Borrador borrador=new Borrador();
    borrador.setTipo(new Tipo(Categoria.PARTE_INFERIOR,Arrays.asList(Material.JEAN,Material.CUERO)));
    borrador.setMaterial(Material.ALGODON);
    borrador.setColorPrimario(new Color(0,0,100));
    return borrador.crearPrenda();
  }
  @Override
  public Prenda hacerCalzado(){
    Borrador borrador=new Borrador();
    borrador.setTipo(new Tipo(Categoria.CALZADO,Arrays.asList(Material.ALGODON,Material.CUERO)));
    borrador.setMaterial(Material.CUERO);
    borrador.setColorPrimario(new Color(100,100,100));
    return borrador.crearPrenda();
  }
}

