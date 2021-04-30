package uniformes;

import prendas.Borrador;
import prendas.Material;
import prendas.Prenda;
import prendas.Tipo;

import java.awt.*;

public class InstitucionSanJuan implements Institucion {

  public Prenda traerCalzado() {
    Borrador borradorCalzado;
    borradorCalzado = new Borrador(Tipo.ZAPATILLA);
    borradorCalzado.configurar(Material.TELA, Color.WHITE, null);
    borradorCalzado.setearPrenda();
    return borradorCalzado.prenda;
  }

  public Prenda traerParteSuperior() {
    Borrador parteSuperior;
    parteSuperior = new Borrador(Tipo.CHOMBA);
    parteSuperior.configurar(Material.PIQUE, Color.GREEN, null);
    parteSuperior.setearPrenda();
    return parteSuperior.prenda;

  }

  public Prenda traerParteInferior() {
    Borrador parteInferior;
    parteInferior = new Borrador(Tipo.PANTALON);
    parteInferior.configurar(Material.ACETATO, Color.GRAY, null);
    parteInferior.setearPrenda();
    return parteInferior.prenda;
  }
}
