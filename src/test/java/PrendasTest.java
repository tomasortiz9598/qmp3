import org.junit.Assert;
import org.junit.Test;
import prendas.*;

import java.awt.*;

public class PrendasTest extends  MainConfiguration{

  @Test
  public void borradorPantalonNegroConCategoriaInferior(){
    Assert.assertEquals(Categoria.INFERIOR,  this.pantalonNegro.tipo.getCategoria());
  }

  @Test
  public void borradorPantalonNegroColor(){
    Assert.assertEquals(Color.BLACK,  this.pantalonNegro.colorPrimario);
  }
  @Test
  public void borradorPantalonNegroColorSecundarioNull(){
    Assert.assertNull( this.pantalonNegro.colorSecundario);
  }

  @Test
  public void borradorPantalonNegroTrama(){
    Assert.assertEquals(Trama.LISA,  this.pantalonNegro.trama);
  }


}