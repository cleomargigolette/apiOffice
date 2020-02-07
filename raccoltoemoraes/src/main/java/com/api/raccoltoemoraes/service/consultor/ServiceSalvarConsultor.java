package com.api.raccoltoemoraes.service.consultor;

import com.api.raccoltoemoraes.domain.Consultor;
import com.api.raccoltoemoraes.repository.RepositoryConsultor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceSalvarConsultor {

    @Autowired
    private RepositoryConsultor repositoryConsultor;

    public Consultor salvar(Consultor consultor){
        return repositoryConsultor.save(consultor);
    }
}
