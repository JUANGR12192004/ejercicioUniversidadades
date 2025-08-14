package co.edu.ucentral.manejadorUniversidades.repositorios;

import co.edu.ucentral.manejadorUniversidades.entidadades.Universidad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioUniversidad extends JpaRepository<Universidad,Long> {
}

