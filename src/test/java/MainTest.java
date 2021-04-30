import org.junit.Before;
import prendas.*;

import java.awt.*;

public class MainTest {
  Borrador borradorPantalonNegro = new Borrador( Tipo.PANTALON);

  @Before
  public void init() {
    this.borradorPantalonNegro.configurar(Material.TELA, Color.BLACK, null);
    this.borradorPantalonNegro.setearPrenda();
  }



}
