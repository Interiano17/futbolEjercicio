package unah.lenguajes.futbol.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import unah.lenguajes.futbol.modelos.Equipo;
import unah.lenguajes.futbol.repositorios.EquipoRepositorio;
import unah.lenguajes.futbol.repositorios.PosicionRepositorio;

@Service
public class EquipoServicio {
    
    @Autowired
    private EquipoRepositorio equipoRepositorio;

    @Autowired
    private PosicionRepositorio posicionRepositorio;

    public List<Equipo> obtenerTodos(){
        return this.equipoRepositorio.findAll();
    }

    public Equipo crearEquipo(Equipo nuevoEquipo){
        return this.equipoRepositorio.save(nuevoEquipo);
    }

    public Equipo buscarPorCodigo(long codigoEquipo){
        return this.equipoRepositorio.findById(codigoEquipo).get();
    }

    public String eliminarPorCodigo(long codigoEquipo){
        if(this.equipoRepositorio.existsById(codigoEquipo)){
            if(!this.posicionRepositorio.existsById(codigoEquipo)){
                this.equipoRepositorio.deleteById(codigoEquipo);
                return "Se ha eliminado el equipo.";
            }        
        }
        if(this.posicionRepositorio.existsById(codigoEquipo)){
            return "El equipo tiene un registro en la tabla Posiciones.";       
        }
        return "No existe el equipo";
    }
}
