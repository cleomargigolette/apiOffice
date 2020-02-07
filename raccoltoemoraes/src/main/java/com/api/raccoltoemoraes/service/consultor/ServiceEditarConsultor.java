package com.api.raccoltoemoraes.service.consultor;

import com.api.raccoltoemoraes.domain.Consultor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceEditarConsultor {
    @Autowired
    private ServiceSalvarConsultor salvarConsultor;

    @Autowired
    private ServiceBuscarConsultorPeloID buscarConsultorPeloID;

    public Consultor editarConsultor(Consultor consultorAlterado) {
        Consultor consultorAtual = buscarConsultorPeloID.buscaPeloId(consultorAlterado.getId());

        if (consultorAlterado.getPassword().isEmpty()) {

            consultorAtual.setEmail(consultorAlterado.getEmail());
            consultorAtual.setPrimeiroNome(consultorAlterado.getPrimeiroNome());
            consultorAtual.setSobreNome(consultorAlterado.getSobreNome());
        } else {
            consultorAtual.setPassword(consultorAlterado.getPassword());
        }

        return consultorAtual;
    }
}
