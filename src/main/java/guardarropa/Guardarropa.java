package guardarropa;

import Clima.ServicioClima;
import atuendos.Atuendo;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import prendas.Categoria;
import prendas.Prenda;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Guardarropa {
  public List<Prenda> prendas;
  public Atuendo sugerenciaDiaria;

  public List<Prenda> traerPrendasSuperiores() {
    return this.prendas.stream().filter(prenda ->
        prenda.categoria().equals(Categoria.SUPERIOR)).collect(Collectors.toList());
  }

  public List<Prenda> traerPrendasInferiores() {
    return this.prendas.stream().filter(prenda ->
        prenda.categoria().equals(Categoria.SUPERIOR)).collect(Collectors.toList());
  }

  public List<Prenda> traerCalzados() {
    return this.prendas.stream().filter(prenda ->
        prenda.categoria().equals(Categoria.SUPERIOR)).collect(Collectors.toList());
  }

  public void generarSugerencia() {
    this.sugerenciaDiaria =  new Atuendo(
        this.traerPrendasSuperiores().get(new Random().nextInt(this.traerPrendasSuperiores().size())),
        this.traerPrendasInferiores().get(new Random().nextInt(this.traerPrendasInferiores().size())),
        this.traerCalzados().get(new Random().nextInt(this.traerCalzados().size()))
    );
  }

  public List<Atuendo> combinatoria() {
    return  Lists.newArrayList(Sets.cartesianProduct(Sets.newHashSet(this.traerPrendasSuperiores()),
          Sets.newHashSet(this.traerPrendasInferiores()),
          Sets.newHashSet(this.traerCalzados()))).stream()
          .map(unaCombinacion -> new Atuendo(unaCombinacion.get(0), unaCombinacion.get(1), unaCombinacion.get(2))).collect(Collectors.toList())
    ;
  }

  public void eliminarPrenda(Prenda prenda) {
    this.prendas.remove(prenda);
  }

  public void agregarPrenda(Prenda prenda) {
    this.prendas.add(prenda);
  }

}
