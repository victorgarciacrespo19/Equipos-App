package es.upsa.ssi.trabajo1.wsequipos.adapters.output.persistence;

import es.upsa.ssi.trabajo1.domain.entities.Equipo;
import es.upsa.ssi.trabajo1.domain.exceptions.EquiposAppException;

import java.util.List;
import java.util.Optional;

public interface Dao {
    List<Equipo> findEquipos() throws EquiposAppException;
    Optional<Equipo> findEquipoById(String id) throws EquiposAppException;
    Equipo insertEquipo(Equipo equipo) throws EquiposAppException;
    Optional<Equipo> updateEquipo(Equipo equipo) throws EquiposAppException;
    void deleteEquipoById(String id) throws EquiposAppException;
}
