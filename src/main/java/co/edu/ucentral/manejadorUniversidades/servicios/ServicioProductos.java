package co.edu.ucentral.manejadorUniversidades.servicios;

import co.edu.ucentral.manejadorUniversidades.entidadades.Productos;
import co.edu.ucentral.manejadorUniversidades.repositorios.RepositorioProductos;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor


public class ServicioProductos {
    @Autowired
    private RepositorioProductos repositorioProductos;

    public void registrar(Productos producto) {
        this.repositorioProductos.save(producto);
    }
    public void actualizar(Productos producto) {
        this.repositorioProductos.save(producto);
    }

    public List <Productos> consultarTodos(){
        return this.repositorioProductos.findAll();
    }
}
