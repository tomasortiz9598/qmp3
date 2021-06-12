package Clima;

import java.util.List;

public class AlertaMeteorologica {
  List<String> alerta;
  public AlertaMeteorologica(List<String> alerta) {
    this.alerta = alerta;
  }
  public List<String> getCurrent(){
    return this.alerta;
  }
}
