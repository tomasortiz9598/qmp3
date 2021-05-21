
package atuendos;

import Clima.EstadoClima;
import prendas.Prenda;

import java.util.List;

public class Atuendo {
  public Prenda prendaSuperior;
  public Prenda prendaInferior;
  public Prenda calzado;

  public Atuendo(Prenda prendaSuperior, Prenda prendaInferior, Prenda calzado) {
    this.prendaSuperior = prendaSuperior;
    this.prendaInferior = prendaInferior;
    this.calzado = calzado;
  }

  public boolean aptoParaTemperatura(EstadoClima climaActual) {
    return this.prendaSuperior.aptaParaTemperatura(climaActual) &&
        this.prendaInferior.aptaParaTemperatura(climaActual) &&
        this.calzado.aptaParaTemperatura(climaActual);
  }
}