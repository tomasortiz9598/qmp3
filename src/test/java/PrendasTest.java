import org.junit.Assert;
import org.junit.Test;
import prendas.*;

import java.awt.*;

public class PrendasTest extends  MainTest{

  //uso assertTrue porque sino me tira un deprecation warning

  @Test
  public void dummy(){
    Assert.assertTrue(true);
  }

  @Test
  public void borradorPantalonNegroConCategoriaInferior(){
    Assert.assertTrue(Categoria.INFERIOR ==  this.pantalonNegro.tipo.getCategoria());
  }

  @Test
  public void borradorPantalonNegroColor(){
    Assert.assertTrue(Color.BLACK ==  this.pantalonNegro.colorPrimario);
  }
  @Test
  public void borradorPantalonNegroColorSecundarioNull(){
    Assert.assertTrue(null ==  this.pantalonNegro.colorSecundario);
  }

  @Test
  public void borradorPantalonNegroTrama(){
    Assert.assertTrue(Trama.LISA ==  this.pantalonNegro.trama);
  }


}