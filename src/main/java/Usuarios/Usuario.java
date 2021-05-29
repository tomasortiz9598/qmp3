package Usuarios;

import guardarropa.Guardarropa;
import prendas.Prenda;

import java.util.List;

public class Usuario {
  List<Guardarropa> guardarropas;
  List<Sugerencia> sugerencias;


  public Usuario(List<Guardarropa> guardarropas) {
    this.guardarropas = guardarropas;
  }

  public void agregarGuardarropas(Guardarropa guardarropa) {
    this.guardarropas.add(guardarropa);
  }


  public boolean tieneGuardarropa(Guardarropa guardarropa) {
    return this.guardarropas.contains(guardarropa);
  }

  public List<Guardarropa> getGuardarropas() {
    return guardarropas;
  }

  public void recibirSugerencia(Sugerencia sugerencia) {
    this.sugerencias.add(sugerencia);
  }

  public List<Sugerencia> getSugerencias() {
    return this.sugerencias;
  }
}
