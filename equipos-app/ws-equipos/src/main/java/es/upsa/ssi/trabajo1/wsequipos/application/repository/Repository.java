package es.upsa.ssi.trabajo1.wsequipos.application.repository;

import es.upsa.ssi.trabajo1.domain.entities.Equipo;
import es.upsa.ssi.trabajo1.domain.exceptions.EquiposAppException;

import java.util.List;
import java.util.Optional;

public interface Repository
{

    List<Equipo> getEquipos() throws EquiposAppException;
    Optional<Equipo> getEquiposById(String id) throws EquiposAppException;
    Equipo saveEquipo(Equipo equipo) throws EquiposAppException;
    void removeEquipoById(String id) throws EquiposAppException;
}
