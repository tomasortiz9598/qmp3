package Clima;

import java.util.List;
import java.util.Map;

public interface WeatherAPI {
  public List<EstadoClima> obtenerClima(String direccion);
  public Map<String, List<String>> getAlerts(String city);
}
