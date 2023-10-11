package com.estudo.cadastro.usuario.serviceImpl;

import com.estudo.cadastro.usuario.apiCliente.ViaCep;
import com.estudo.cadastro.usuario.model.entity.Endereco;
import com.estudo.cadastro.usuario.model.service.EnderecoService;
import com.estudo.cadastro.usuario.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoServiceImpl implements EnderecoService {
    @Autowired
    public ViaCep viaCep;

    @Autowired
    public EnderecoRepository enderecoRepository;

    @Override
    public Endereco adicionarEndereco(String cep){
        Endereco endereco = viaCep.buscaEndereco(cep);
        return enderecoRepository.save(endereco);
    }
}
