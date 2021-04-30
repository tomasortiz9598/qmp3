import org.junit.Assert;
import org.junit.Test;
import prendas.*;

public class PrendasTest extends  MainTest{

  //uso assertTrue porque sino me tira un deprecation warning

  @Test
  public void dummy(){
    Assert.assertTrue(true);
  }

  @Test
  public void borradorPantalonNegro(){
    Assert.assertTrue(Categoria.INFERIOR ==  this.borradorPantalonNegro.prenda.tipo.getCategoria());
  }

//  @Test
//  public void sacoLiquidacion(){
//    Assert.assertTrue(100 == this.saco.calcularPrecio());
//  }
//  @Test
//  public void camisaPromocion(){
//    Assert.assertTrue(85 == this.camisa.calcularPrecio());
//  }

}