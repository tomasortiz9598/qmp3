package prendas;

//public class Tipo {
//  Categoria categoria;
//
//  public Tipo(Categoria categoria) {
//    this.categoria = categoria;
//  }
//
//  public Categoria getCategoria() {
//    return categoria;
//  }
//
//
//}

 public enum Tipo {
  PANTALON ,
  CHOMBA,
  ZAPATILLA ,
  CAMISA;

  private Categoria categoria;
  static {
    PANTALON.categoria = Categoria.INFERIOR;
    CHOMBA.categoria = Categoria.SUPERIOR;
    ZAPATILLA.categoria = Categoria.CALZADO;
    CAMISA.categoria = Categoria.SUPERIOR;
  }

   public Categoria getCategoria() {
    return categoria;
   }
 }