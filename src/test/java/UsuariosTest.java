import Clima.AccuWeatherAPI;
import Clima.ServicioClima;
import usuarios.Propuesta;
import usuarios.PropuestaAgregar;
import usuarios.PropuestaQuitar;
import usuarios.Usuario;
import guardarropa.Guardarropa;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import java.time.Duration;
import java.time.Instant;

public class UsuariosTest extends MainConfiguration {
  Guardarropa ropaDeViaje;
  Guardarropa ropaDeEntreCasa;
  Usuario pepito = new Usuario(new ServicioClima(new AccuWeatherAPI(), Duration.between( Instant.parse("2017-10-03T10:15:30.00Z"), Instant.parse("2017-10-03T10:16:30.00Z")), "Buenos Aires"));
  Usuario jose;

  public void compartirGuardaRopa(Usuario unUsuario, Usuario otroUsuario, Guardarropa guardarropa) {
    unUsuario.agregarGuardarropas(guardarropa);
    otroUsuario.agregarGuardarropas(guardarropa);
  }

  @BeforeAll
  public void init(){
    this.ropaDeViaje = new Guardarropa();
    this.ropaDeEntreCasa = new Guardarropa();
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
    Propuesta propuesta = new PropuestaQuitar(this.pantalonNegro, this.ropaDeViaje);
    this.jose.recibirPropuesta(propuesta);
    this.jose.aceptarPropuestas(propuesta);
    Assert.assertFalse(this.jose.getGuardarropas().get(0).prendas.contains(this.pantalonNegro));
  }


  @Test
  public void hagoSugerenciaDeAgregar() {
    Propuesta propuesta = new PropuestaAgregar(this.pantalonNegro, this.ropaDeViaje);
    this.jose.recibirSugerencia(propuesta);
    this.jose.aceptarSugerencia(propuesta);
    Assert.assertTrue(this.jose.getGuardarropas().get(0).prendas.contains(this.pantalonNegro));
  }

}
