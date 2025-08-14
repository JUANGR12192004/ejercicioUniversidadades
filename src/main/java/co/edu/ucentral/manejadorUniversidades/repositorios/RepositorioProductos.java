package co.edu.ucentral.manejadorUniversidades.repositorios;

import co.edu.ucentral.manejadorUniversidades.entidadades.Productos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioProductos extends JpaRepository <Productos,Long> {
}
