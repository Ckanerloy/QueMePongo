package Dominio.Parte5;

public class RecomendacionInvalidaException extends RuntimeException {
  public RecomendacionInvalidaException(String causa){
    super(causa);
  }
}
