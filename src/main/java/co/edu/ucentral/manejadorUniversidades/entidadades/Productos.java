package co.edu.ucentral.manejadorUniversidades.entidadades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table( name = "productos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Productos {
    @Id
    private long codigo;
    private String nombre;
    private String tipoProducto;
    private long precio;
}
