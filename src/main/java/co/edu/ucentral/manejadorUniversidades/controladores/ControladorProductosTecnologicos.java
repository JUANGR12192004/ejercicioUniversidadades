package co.edu.ucentral.manejadorUniversidades.controladores;

import co.edu.ucentral.manejadorUniversidades.entidadades.Productos;
import co.edu.ucentral.manejadorUniversidades.servicios.ServicioProductos;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@RestController
@RequestMapping("/productos")
public class ControladorProductosTecnologicos {
    @Autowired
    private ServicioProductos servicioProductos;

    @PostMapping("/")
    public void crear(@RequestBody Productos productos){
        this.servicioProductos.registrar(productos);
    }
    @GetMapping("/")
    public List<Productos> consultar(){
        return this.servicioProductos.consultarTodos();
    }
}
