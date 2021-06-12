package usuarios;

import Clima.AlertaMeteorologica;
import Clima.ServicioClima;
import atuendos.Atuendo;
import guardarropa.Guardarropa;

import java.util.List;
import java.util.stream.Collectors;

public class Usuario {
  List<Guardarropa> guardarropas;
  List<Propuesta> propuestas;
  AlertaMeteorologica alertaMeteorologica;
  private ServicioClima servicioClima;
  private List<Notificador> notificadores;

  public Usuario(ServicioClima servicioClima) {
    this.servicioClima = servicioClima;
  }

  public void agregarGuardarropas(Guardarropa guardarropa) {
    this.guardarropas.add(guardarropa);
  }


  public boolean tieneGuardarropa(Guardarropa guardarropa) {
    return this.guardarropas.contains(guardarropa);
  }

  public List<Atuendo> aptoTemperatura(Guardarropa guardarropa) {
    return guardarropa.combinatoria().stream().filter(atuendo -> atuendo.aptoParaTemperatura(this.servicioClima.actual())).collect(
        Collectors.toList());
  }

  public List<Guardarropa> getGuardarropas() {
    return guardarropas;
  }

  public void recibirPropuesta(Propuesta propuesta) {
    this.propuestas.add(propuesta);
  }

  public List<Propuesta> getPropuestas() {
    return this.propuestas;
  }

  public void aceptarPropuestas(Propuesta propuesta) {
    propuesta.efectuarSugerencia();
  }

  public void rechazarPropuestas(Propuesta propuesta) {
    this.propuestas.remove(propuesta);
  }

  public void getSugerencia() {
    this.guardarropas.forEach(guardarropa -> guardarropa.generarSugerencia());
  }

  public void getAlerta() {
    this.notificadores.forEach(notificador -> notificador.notificar(this.servicioClima.getAlerta(), this));
    this.alertaMeteorologica = this.servicioClima.getAlerta();

  }

}
