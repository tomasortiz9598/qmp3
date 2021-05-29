package Clima;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public class ServicioClima {
  private List<EstadoClima> respuesta;
  private LocalDateTime fechaHasta;
  private Duration validez;
  private WeatherAPI api;
  private String locacion;

  public ServicioClima(WeatherAPI api, Duration validez, String locacion) {
    this.api = api;
    this.validez =validez;
    this.locacion = locacion;

  }

  public EstadoClima actual() {
    if(this.respuesta == null || this.expiro()) {

      this.respuesta = this.api.obtenerClima(this.locacion);
      this.fechaHasta = LocalDateTime.now().plus(this.validez);
    }

    return this.respuesta.get(0);
  }

  private boolean expiro(){
    return fechaHasta.isAfter(LocalDateTime.now());
  }

}
