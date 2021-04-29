package prendas;

import java.awt.*;

import static java.util.Objects.requireNonNull;

public class Prenda {
  private Material material;

  private final Tipo tipo;
  // En un futuro se podrian agregar mas colores, asi que podria ser interesante
  // Crear una clase Colores, que contenga tanto al primario, secundario, terciario, etc.
  private Color colorPrimario;
  private Color colorSecundario;

  public Prenda( Tipo tipo ) {
    this.tipo = requireNonNull(tipo, "La prenda requiere un tipo");

  }

  public void configurar(Material material, Color colorPrimario, Color colorSecundario){
    this.material = requireNonNull(material, "La prenda requiere un material");
    this.colorPrimario = requireNonNull(colorPrimario, "La prenda requiere un colorPrimario");
    this.colorSecundario = colorSecundario;
  }

  public Categoria categoria() {
    return this.tipo.getCategoria();
  }
}