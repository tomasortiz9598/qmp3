package uniformes;

import atuendos.Atuendo;
import prendas.Prenda;

public class Uniforme extends Atuendo {

  public static Uniforme traerUniforme(Institucion institucion){
    return new Uniforme(institucion.traerParteSuperior(), institucion.traerParteInferior(), institucion.traerCalzado());
  }

  public Uniforme(Prenda prendaSuperior, Prenda prendaInferior, Prenda calzado) {
    super(prendaSuperior, prendaInferior, calzado);
  }

}
