package Dominio.Parte4;

public class AtuendoInvalidoException extends RuntimeException {
  public AtuendoInvalidoException(String causa) {
    super("La prenda es invalida ya que" + causa);
  }
}
