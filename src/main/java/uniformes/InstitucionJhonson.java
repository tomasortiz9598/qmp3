package uniformes;

import prendas.Borrador;
import prendas.Material;
import prendas.Prenda;
import prendas.Tipo;

import java.awt.*;

public class InstitucionJhonson implements Institucion {

  public Prenda traerCalzado() {
    Borrador borradorCalzado;
    borradorCalzado = new Borrador(Tipo.ZAPATILLA);
    borradorCalzado.configurar(Material.TELA, Color.BLACK, null, 15);
    borradorCalzado.setearPrenda();
    return borradorCalzado.prenda;
  }

  public Prenda traerParteSuperior() {
    Borrador parteSuperior;
    parteSuperior = new Borrador(Tipo.CAMISA);
    parteSuperior.configurar(Material.TELA, Color.WHITE, null, 35);
    parteSuperior.setearPrenda();
    return parteSuperior.prenda;

  }

  public Prenda traerParteInferior() {
    Borrador parteInferior;
    parteInferior = new Borrador(Tipo.PANTALON);
    parteInferior.configurar(Material.GABARDINA, Color.BLACK, null, 10);
    parteInferior.setearPrenda();
    return parteInferior.prenda;
  }
}
