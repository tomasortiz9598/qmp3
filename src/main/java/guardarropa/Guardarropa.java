package guardarropa;

import Clima.ServicioClima;
import atuendos.Atuendo;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import prendas.Prenda;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Guardarropa {
  public List<Prenda> prendasSuperiores;
  public List<Prenda> prendasInferiores;
  public List<Prenda> calzados;
  private ServicioClima servicioClima;

  public Guardarropa(ServicioClima servicioClima){
    this.servicioClima = servicioClima;
  }

  public Atuendo generarSugerencia() {
    return new Atuendo(
        prendasSuperiores.get(new Random().nextInt(prendasSuperiores.size())),
        prendasInferiores.get(new Random().nextInt(prendasInferiores.size())),
        calzados.get(new Random().nextInt(calzados.size()))
    );
  }

  public List<Atuendo> combinatoria() {
    return Lists.newArrayList(Sets.cartesianProduct(Sets.newHashSet(this.prendasSuperiores),
        Sets.newHashSet(this.prendasInferiores),
        Sets.newHashSet(this.calzados))).stream()
        .map(unaCombinacion -> new Atuendo(unaCombinacion.get(0), unaCombinacion.get(1), unaCombinacion.get(2))).collect(Collectors.toList());
  }

  public List<Atuendo> aptoTemperatura(){
    return this.combinatoria().stream().filter(atuendo -> atuendo.aptoParaTemperatura(this.servicioClima.actual())).collect(Collectors.toList());
  }

}
