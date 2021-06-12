package usuarios;

import guardarropa.Guardarropa;
import prendas.Prenda;

public class PropuestaQuitar implements Propuesta {
  Prenda prenda;
  Guardarropa guardarropa;
  Boolean efectuada;

  public PropuestaQuitar(Prenda prenda, Guardarropa guardarropa) {
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
