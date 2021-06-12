package usuarios;

import Clima.AlertaMeteorologica;

public class NotificadorGranizo implements Notificador{

  @Override
  public void notificar(AlertaMeteorologica alerta, Usuario usuario) {
    String mensaje = "No salgas en auto";
    if (alerta.getCurrent().contains( "STORM"))
      mensaje = "No salgas en auto";
    this.enviarAUsuario(mensaje);
  }
}
