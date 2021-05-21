package prendas;

import java.awt.*;

import static java.util.Objects.requireNonNull;

public class Borrador {
  public Prenda prenda;
  private Tipo tipo;
  private Material material;
  private Color colorPrimario;
  private Color colorSecundario;
  private Trama trama = Trama.LISA;
  private Integer temperaturaMaxima;

  public Borrador(Tipo tipo){
    this.tipo = tipo;
  }

  public void configurar(Material material, Color colorPrimario, Color colorSecundario, Integer temperaturaMaxima ){
    this.material = requireNonNull(material, "La prenda requiere un material");
    this.colorPrimario = requireNonNull(colorPrimario, "La prenda requiere un colorPrimario");
    this.colorSecundario = colorSecundario;
    this.temperaturaMaxima = temperaturaMaxima;

  }

  public void configurarTrama(Trama trama){
    this.trama =trama;
  }
  public void setearPrenda(){
    this.prenda = new Prenda(this.tipo, this.material, this.colorPrimario, this.colorSecundario, this.trama, this.temperaturaMaxima);
  }
}
