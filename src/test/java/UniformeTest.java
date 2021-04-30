import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import prendas.Categoria;
import prendas.Tipo;
import prendas.Trama;
import uniformes.InstitucionJhonson;
import uniformes.InstitucionSanJuan;
import uniformes.Uniforme;

import java.awt.*;

public class UniformeTest extends  MainTest {
  Uniforme uniformeSanJuan;
  Uniforme uniformeJhonson;

  @Before
  public void init() {
    this.uniformeSanJuan = Uniforme.traerUniforme(new InstitucionSanJuan());
    this.uniformeJhonson = Uniforme.traerUniforme(new InstitucionJhonson());
  }
  @Test
  public void dummy(){
    Assert.assertTrue(true);
  }

  @Test
  public void sanJuanChomba(){
    Assert.assertTrue(Tipo.CHOMBA ==  this.uniformeSanJuan.prendaSuperior.tipo);
  }

  @Test
  public void sanJuanPantalon(){
    Assert.assertTrue(Tipo.PANTALON ==  this.uniformeSanJuan.prendaInferior.tipo);
  }
  @Test
  public void sanJuanCalzado(){
    Assert.assertTrue(Tipo.ZAPATILLA ==  this.uniformeSanJuan.calzado.tipo);
  }


  @Test
  public void jhonsonCamisa(){
    Assert.assertTrue(Tipo.CAMISA ==  this.uniformeJhonson.prendaSuperior.tipo);
  }

  @Test
  public void jhonsonPantalon(){
    Assert.assertTrue(Tipo.PANTALON ==  this.uniformeJhonson.prendaInferior.tipo);
  }
  @Test
  public void jhonsonCalzado(){
    Assert.assertTrue(Tipo.ZAPATILLA ==  this.uniformeJhonson.calzado.tipo);
  }

}
