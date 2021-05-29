package Usuarios;

import guardarropa.Guardarropa;
import prendas.Prenda;

public class SugerenciaAgregar implements Sugerencia {
  Prenda prenda;
  Guardarropa guardarropa;
  Boolean efectuada;


  public SugerenciaAgregar(Prenda prenda, Guardarropa guardarropa) {
    this.prenda = prenda;
    this.guardarropa = guardarropa;
  }

  @Override
  public void efectuarSugerencia() {
    this.guardarropa.agregarPrenda(prenda);
    this.efectuada = true;
  }

  @Override
  public void revertirSugerencia() {
    this.guardarropa.eliminarPrenda(prenda);
    this.efectuada = false;
  }


}
