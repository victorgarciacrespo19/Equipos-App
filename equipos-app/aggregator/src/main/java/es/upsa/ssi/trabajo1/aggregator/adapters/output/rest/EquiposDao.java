package es.upsa.ssi.trabajo1.aggregator.adapters.output.rest;

import es.upsa.ssi.trabajo1.domain.entities.Equipo;
import es.upsa.ssi.trabajo1.domain.exceptions.EquiposAppException;

import java.util.Optional;

public interface EquiposDao {
    Optional<Equipo> findById(String id) throws EquiposAppException;
}
