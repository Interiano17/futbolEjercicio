package unah.lenguajes.futbol.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import unah.lenguajes.futbol.modelos.Posicion;
import unah.lenguajes.futbol.servicios.PosicionServicio;

@RestController
@RequestMapping("/api/posiciones")
public class PosicionControlador {
    
    @Autowired
    private PosicionServicio posicionServicio;

    @GetMapping("/obtener/todos")
    public List<Posicion> obtenerTodos() {
        return this.posicionServicio.obtenerTodos();
    }

    @GetMapping("/simular/partidos")
    public List<Posicion> simularPartidos() {
        return this.posicionServicio.simularPartidos();
    }
}
