package uniformes;

import prendas.Prenda;

public class Uniforme {
  public Prenda prendaSuperior;
  public Prenda prendaInferior;
  public Prenda calzado;

  private static Uniforme traerUniforme(Institucion institucion){
    return new Uniforme(institucion.traerParteSuperior(), institucion.traerParteInferior(), institucion.traerCalzado());
  }

  public Uniforme(Prenda prendaSuperior, Prenda prendaInferior, Prenda calzado) {
    this.prendaSuperior = prendaSuperior;
    this.prendaInferior = prendaInferior;
    this.calzado = calzado;
  }
}
