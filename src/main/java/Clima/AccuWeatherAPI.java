package Clima;

import java.util.*;
import java.util.stream.Collectors;

public final class AccuWeatherAPI implements WeatherAPI {

  public final List<Map<String, Object>> getWeather(String ciudad) {
    return Arrays.asList(new HashMap<String, Object>() {{
      put("DateTime", "2019-05-03T01:00:00-03:00");
      put("EpochDateTime", 1556856000);
      put("WeatherIcon", 33);
      put("IconPhrase", "Clear");
      put("IsDaylight", false);
      put("PrecipitationProbability", 0);
      put("MobileLink", "http://m.accuweather.com/en/ar/villa-vil/7984/");
      put("Link", "http://www.accuweather.com/en/ar/villa-vil/7984");
      put("Temperature", new HashMap<String, Object>() {{
        put("Value", 57);
        put("Unit", "F");
        put("UnitType", 18);
      }});
    }});
  }


  public List<EstadoClima> obtenerClima(String direccion) {
    return this.getWeather(direccion)
        .stream()
        .map(item -> new EstadoClima((Integer) item.get("Temperature")))
        .collect(Collectors.toList());
  }
}