package unah.lenguajes.futbol.modelos;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="equipos")
@Data
public class Equipo {
    
    @Id
    @Column(name="codigoequipo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigoEquipo;

    private String nombre;

    private double ataque;

    private double defensa;

    @OneToOne(mappedBy="equipo", cascade=CascadeType.ALL)
    private Posicion posicion;
}
