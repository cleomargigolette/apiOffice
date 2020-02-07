package com.api.raccoltoemoraes.service.consultor;

import com.api.raccoltoemoraes.domain.Consultor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceDeletarConsultor {
    @Autowired
    private ServiceSalvarConsultor salvarConsultor;

    @Autowired
    private ServiceBuscarConsultorPeloID buscarConsultorPeloID;

    public void deletarConsultor(Long id) {
        Consultor consultor = buscarConsultorPeloID.buscaPeloId(id);

        consultor.setAtivo(false);

        salvarConsultor.salvar(consultor);
    }
}
