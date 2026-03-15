package es.upsa.ssi.trabajo1.aggregator.adapters.output.rest;

import es.upsa.ssi.trabajo1.domain.entities.Contrato;
import es.upsa.ssi.trabajo1.domain.exceptions.EquiposAppException;

import java.util.List;

public interface ContratosDao {
    List<Contrato> findByEquipoId(String id) throws EquiposAppException;
}
