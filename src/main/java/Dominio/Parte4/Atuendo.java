package Dominio.Parte4;
import Dominio.Prenda;

public class Atuendo {
  Prenda parteSuperior;
  Prenda parteInferior;
  Prenda accesorio;
  Prenda calzado;

  public Atuendo(Prenda parteSuperior, Prenda parteInferior, Prenda accesorio, Prenda calzado) {
    if (!parteSuperior.esParteSuperior())
      throw new AtuendoInvalidoException(parteSuperior + "no es parte superior");

    if (!parteInferior.esParteInferior())
      throw new AtuendoInvalidoException(parteInferior + "no es parte superior");

    if (!calzado.esCalzado())
      throw new AtuendoInvalidoException(calzado + "no es calzado");

    if (!accesorio.esAccesorio())
      throw new AtuendoInvalidoException(accesorio + "no es accesorio");

    this.parteSuperior = parteSuperior;
    this.parteInferior = parteInferior;
    this.accesorio = accesorio;
    this.calzado = calzado;
  }

  public boolean esAtuendoValido() {
    return parteSuperior.esParteSuperior() && parteInferior.esParteInferior()
        && calzado.esCalzado() && accesorio.esAccesorio();
  }

  public void validarAtuendo() {
    if (!esAtuendoValido()) {
      throw new AtuendoInvalidoException("no contiene una parte superior, una parte inferior, un calzado y un accesorio");
    }
  }

  public boolean todasAptasParaTemperatura(double temperatura){
    return parteSuperior.aptaTemperatura(temperatura)&& parteInferior.aptaTemperatura(temperatura)&&accesorio.aptaTemperatura(temperatura)&& calzado.aptaTemperatura(temperatura);
  }
}
