import org.junit.Before;
import prendas.*;

import java.awt.*;

public class MainConfiguration {
  Borrador borradorPantalonNegro = new Borrador( Tipo.PANTALON);
  Borrador borradorCamisa = new Borrador( Tipo.CAMISA);
  Prenda pantalonNegro;
  Prenda camisaAzul;
  @Before
  public void init() {
    this.borradorPantalonNegro.configurar(Material.TELA, Color.BLACK, null, 10);
    this.pantalonNegro = this.borradorPantalonNegro.setearPrenda();

    this.borradorCamisa.configurar(Material.TELA, Color.BLUE, null, 20);
    this.camisaAzul = this.borradorCamisa.setearPrenda();

  }



}
