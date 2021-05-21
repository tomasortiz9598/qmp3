import org.junit.Before;
import prendas.*;

import java.awt.*;

public class MainTest {
  Borrador borradorPantalonNegro = new Borrador( Tipo.PANTALON);
  Prenda pantalonNegro;
  @Before
  public void init() {
    this.borradorPantalonNegro.configurar(Material.TELA, Color.BLACK, null, 10);
    this.borradorPantalonNegro.setearPrenda();
    this.pantalonNegro = this.borradorPantalonNegro.prenda;
  }



}
