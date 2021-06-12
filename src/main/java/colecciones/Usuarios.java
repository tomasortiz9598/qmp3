package colecciones;

import java.util.List;
import usuarios.Usuario;

public class Usuarios {
  private List<Usuario> usuarios;

  public List<Usuario> getUsuarios() {
    return this.usuarios;
  }

  public void addUsurio(Usuario usuario) {
    this.usuarios.add(usuario);
  }

  public void generarSugerencias(){
    this.usuarios.forEach(usuario -> usuario.getSugerencia());
  }
}
