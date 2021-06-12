package usuarios;

import Clima.AlertaMeteorologica;

public class NotificadorEmail implements Notificador{
  ApiEmail api;
  @Override
  public void notificar(AlertaMeteorologica alerta, Usuario usuario) {
    this.api.enviarEmail(alerta, usuario);
  }
}
