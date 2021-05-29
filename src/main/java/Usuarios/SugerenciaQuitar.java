package Usuarios;

import guardarropa.Guardarropa;
import prendas.Prenda;

public class SugerenciaQuitar implements Sugerencia{
  Prenda prenda;
  Guardarropa guardarropa;
  Boolean efectuada;

  public SugerenciaQuitar(Prenda prenda, Guardarropa guardarropa) {
    this.prenda = prenda;
    this.guardarropa = guardarropa;
  }

  @Override
  public void efectuarSugerencia() {
    this.guardarropa.eliminarPrenda(prenda);
  }

  @Override
  public void revertirSugerencia() {
    this.guardarropa.agregarPrenda(prenda);
    this.efectuada = false;
  }
}
