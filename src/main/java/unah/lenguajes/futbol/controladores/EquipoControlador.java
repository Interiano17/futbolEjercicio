package unah.lenguajes.futbol.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import unah.lenguajes.futbol.modelos.Equipo;
import unah.lenguajes.futbol.servicios.EquipoServicio;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/equipos")
public class EquipoControlador {
    
    @Autowired
    private EquipoServicio equipoServicio;

    @GetMapping("/obtener/todos")
    public List<Equipo> obtenerTodos() {
        return this.equipoServicio.obtenerTodos();
    }

    @PostMapping("/crear/equipo")
    public Equipo crearEquipo(@RequestBody Equipo nuevoEquipo) {
        return this.equipoServicio.crearEquipo(nuevoEquipo);  
    }

    @GetMapping("/buscar/{codigoEquipo}")
    public Equipo buscarPorCodigo(@PathVariable long codigoEquipo){
        return this.equipoServicio.buscarPorCodigo(codigoEquipo);
    }

    @DeleteMapping("/eliminar/{codigoEquipo}")
    public String eliminarPorCodigo(@PathVariable long codigoEquipo){
        return this.equipoServicio.eliminarPorCodigo(codigoEquipo);
    }
    
    
}
