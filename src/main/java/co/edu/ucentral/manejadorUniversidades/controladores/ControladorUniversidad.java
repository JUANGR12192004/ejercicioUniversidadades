package co.edu.ucentral.manejadorUniversidades.controladores;

import co.edu.ucentral.manejadorUniversidades.entidadades.Universidad;
import co.edu.ucentral.manejadorUniversidades.servicios.ServicioUniversidad;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@RestController
@RequestMapping("/universidades")
public class ControladorUniversidad {
    @Autowired
    private ServicioUniversidad servicioUniversidad;

    @PostMapping("/")
    public void crear(@RequestBody Universidad universidad){
        this.servicioUniversidad.registrar(universidad);
    }
    @GetMapping("/")
    public List<Universidad> consultar(){
        return this.servicioUniversidad.consultarTodos();
    }
}

