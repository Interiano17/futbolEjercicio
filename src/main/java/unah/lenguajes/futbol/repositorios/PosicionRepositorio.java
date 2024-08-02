package unah.lenguajes.futbol.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import unah.lenguajes.futbol.modelos.Posicion;

@Repository
public interface PosicionRepositorio extends JpaRepository<Posicion, Long> {
    
}
