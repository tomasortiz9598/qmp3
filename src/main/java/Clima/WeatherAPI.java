package Clima;

import java.util.List;

public interface WeatherAPI {
  public List<EstadoClima> obtenerClima(String direccion);
}
