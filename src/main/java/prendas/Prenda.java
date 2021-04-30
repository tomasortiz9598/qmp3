package prendas;

import java.awt.*;

import static java.util.Objects.requireNonNull;

public class Prenda {

  public Tipo tipo;
  private Material material;
  private Color colorPrimario;
  private Color colorSecundario;
  // En un futuro se podrian agregar mas colores, asi que podria ser interesante
  // Crear una clase Colores, que contenga tanto al primario, secundario, terciario, etc.


  public Prenda( Tipo tipo, Material material, Color colorPrimario, Color colorSecundario ) {
    this.tipo = tipo;

    this.material = material;
    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario;
  }

  public Categoria categoria() {
    return this.tipo.getCategoria();
  }
}