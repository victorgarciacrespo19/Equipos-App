package es.upsa.ssi.trabajo1.wsequipos.application.repository.impl;

import es.upsa.ssi.trabajo1.domain.entities.Equipo;
import es.upsa.ssi.trabajo1.domain.exceptions.EquipoNotFoundAppException;
import es.upsa.ssi.trabajo1.domain.exceptions.EquiposAppException;
import es.upsa.ssi.trabajo1.wsequipos.adapters.output.persistence.Dao;
import es.upsa.ssi.trabajo1.wsequipos.application.repository.Repository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;
import java.util.Optional;
@ApplicationScoped
public class RepositoryImpl implements Repository {
    @Inject
    Dao dao;
    @Override
    public List<Equipo> getEquipos() throws EquiposAppException {
        return dao.findEquipos();
    }

    @Override
    public Optional<Equipo> getEquiposById(String id) throws EquiposAppException {
        return dao.findEquipoById(id);

    }

    @Override
    public Equipo saveEquipo(Equipo equipo) throws EquiposAppException {
        return (equipo.getId() == null)? dao.insertEquipo(equipo): dao.updateEquipo(equipo)
                                                                      .orElseThrow(() -> new EquipoNotFoundAppException());
    }

    @Override
    public void removeEquipoById(String id) throws EquiposAppException {
        dao.deleteEquipoById(id);
    }
}
