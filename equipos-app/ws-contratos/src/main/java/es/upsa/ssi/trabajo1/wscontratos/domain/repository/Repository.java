package es.upsa.ssi.trabajo1.wscontratos.domain.repository;

import es.upsa.ssi.trabajo1.domain.entities.Contrato;
import es.upsa.ssi.trabajo1.domain.exceptions.EquiposAppException;

import java.util.List;
import java.util.Optional;

public interface Repository
{
    Optional<Contrato> findById(String id) throws EquiposAppException;
    List<Contrato> findByIdEquipo(String idEquipo) throws EquiposAppException;
    Contrato save(Contrato contrato) throws EquiposAppException;
    void removeById(String id) throws EquiposAppException;
}
