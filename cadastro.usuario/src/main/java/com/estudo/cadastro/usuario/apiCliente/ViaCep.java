package com.estudo.cadastro.usuario.apiCliente;

import com.estudo.cadastro.usuario.model.entity.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "viacep", url = "http://viacep.com.br/ws/")
public interface ViaCep {
    @RequestMapping(method = RequestMethod.GET, value = "{cep}/json/")
    Endereco buscaEndereco(@PathVariable("cep") String cep);
}
