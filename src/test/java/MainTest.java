import org.junit.Before;
import prendas.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainTest {
  Prenda pantalon = new Prenda( new Tipo( Categoria.INFERIOR));
  @Before
  public void init() {
    pantalon.configurar(Material.TELA,Color.BLUE, null);
  }



}
