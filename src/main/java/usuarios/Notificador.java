package usuarios;

import Clima.AlertaMeteorologica;

public interface Notificador {
  public void notificar(AlertaMeteorologica alerta, Usuario usuario);
}
