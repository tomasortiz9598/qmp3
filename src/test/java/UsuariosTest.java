import Clima.AccuWeatherAPI;
import Clima.ServicioClima;
import Usuarios.Sugerencia;
import Usuarios.SugerenciaAgregar;
import Usuarios.SugerenciaQuitar;
import Usuarios.Usuario;
import guardarropa.Guardarropa;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import java.time.Duration;
import java.time.Instant;

public class UsuariosTest extends MainConfiguration {
  Guardarropa ropaDeViaje;
  Guardarropa ropaDeEntreCasa;
  Usuario pepito;
  Usuario jose;

  public void compartirGuardaRopa(Usuario unUsuario, Usuario otroUsuario, Guardarropa guardarropa) {
    unUsuario.agregarGuardarropas(guardarropa);
    otroUsuario.agregarGuardarropas(guardarropa);
  }

  @BeforeAll
  public void init(){
    Instant start = Instant.parse("2017-10-03T10:15:30.00Z");
    Instant end = Instant.parse("2017-10-03T10:16:30.00Z");
    Duration duration = Duration.between(start, end);
    this.ropaDeViaje = new Guardarropa(new ServicioClima(new AccuWeatherAPI(), duration, "Buenos Aires"));
    this.ropaDeEntreCasa = new Guardarropa(new ServicioClima(new AccuWeatherAPI(), duration, "Buenos Aires"));
    this.ropaDeViaje.agregarPrenda(this.pantalonNegro);
    this.ropaDeViaje.agregarPrenda(this.camisaAzul);
    this.ropaDeEntreCasa.agregarPrenda(this.camisaAzul);
    this.ropaDeEntreCasa.agregarPrenda(this.camisaAzul);

  }

  @Test
  public void compartoUnGuardaRopa() {
    compartirGuardaRopa(this.pepito, this.jose, this.ropaDeViaje);
    Assert.assertTrue(this.jose.tieneGuardarropa(ropaDeViaje));
    Assert.assertTrue(this.pepito.tieneGuardarropa(ropaDeViaje));
  }

  @Test
  public void hagoSugerenciaDeQuitar() {
    this.jose.recibirSugerencia(new SugerenciaQuitar(this.pantalonNegro, this.ropaDeViaje));
    this.jose.getSugerencias().get(0).efectuarSugerencia();
    Assert.assertFalse(this.jose.getGuardarropas().get(0).prendas.contains(this.pantalonNegro));
  }


  @Test
  public void hagoSugerenciaDeAgregar() {
    this.jose.recibirSugerencia(new SugerenciaAgregar(this.pantalonNegro, this.ropaDeViaje));
    this.jose.getSugerencias().get(0).efectuarSugerencia();
    Assert.assertTrue(this.jose.getGuardarropas().get(0).prendas.contains(this.pantalonNegro));
  }

}
