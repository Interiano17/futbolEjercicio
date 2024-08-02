package unah.lenguajes.futbol.modelos;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="posiciones")
@Data
public class Posicion {
    
    @Id
    @Column(name="codigoequipo")
    private long codigoEquipo;

    private long empates;

    private long ganados;

    private long perdidos;

    @Column(name="golesfavor")
    private long golesFavor;

    @Column(name="golescontra")
    private long golesContra;

    private long puntos;

    @OneToOne
    @PrimaryKeyJoinColumn(name="codigoequipo")
    @JsonIgnore
    private Equipo equipo;
}
