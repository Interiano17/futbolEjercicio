package unah.lenguajes.futbol.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import unah.lenguajes.futbol.modelos.Equipo;

@Repository
public interface EquipoRepositorio extends JpaRepository<Equipo, Long>{
    
}
