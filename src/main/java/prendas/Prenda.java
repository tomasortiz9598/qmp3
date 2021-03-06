package prendas;

import Clima.EstadoClima;

import java.awt.*;

import static java.util.Objects.requireNonNull;

public class Prenda {

  public Tipo tipo;
  public Material material;
  public Color colorPrimario;
  public Color colorSecundario;
  public Trama trama;
  public Integer temperaturaMaxima;
  // En un futuro se podrian agregar mas colores, asi que podria ser interesante
  // Crear una clase Colores, que contenga tanto al primario, secundario, terciario, etc.


  public Prenda( Tipo tipo, Material material, Color colorPrimario, Color colorSecundario , Trama trama, Integer temperaturaMaxima) {
    this.tipo = tipo;
    this.material = material;
    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario;
    this.trama = trama;
    this.temperaturaMaxima = temperaturaMaxima;
  }

  public Categoria categoria() {
    return this.tipo.getCategoria();
  }


  public boolean aptaParaTemperatura(EstadoClima climaActual){
    return climaActual.temperatura <= this.temperaturaMaxima;
  }
}