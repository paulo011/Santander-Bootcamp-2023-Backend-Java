package com.estudo.cadastro.usuario.serviceImpl;

import com.estudo.cadastro.usuario.DTO.UsuarioDTO;
import com.estudo.cadastro.usuario.model.entity.Endereco;
import com.estudo.cadastro.usuario.model.entity.Usuario;
import com.estudo.cadastro.usuario.model.service.UsuarioService;
import com.estudo.cadastro.usuario.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private EnderecoServiceImpl enderecoService;

    @Override
    public void criarUsuario(UsuarioDTO usuarioDTO) {
        Endereco endereco = enderecoService.adicionarEndereco(usuarioDTO.cep());
        usuarioRepository.save(new Usuario(usuarioDTO.primeiraNome(), usuarioDTO.sobreNome(), usuarioDTO.idade(), endereco));
    }

    @Override
    public void deletarUsuario(Long id) {
        usuarioRepository.delete(buscarUsuario(id));
    }

    @Override
    public void atualisarUsuario(Long id, Map<String, String> listaAtributos) {
        Usuario usuario = buscarUsuario(id);
        listaAtributos.forEach((atributo, valor) -> {
            switch (atributo) {
                case "primeiroNome" -> usuario.setPrimeiroNome(valor);
                case "sobreNome" -> usuario.setSobreNome(valor);
                case "endereco" -> usuario.setEndereco(enderecoService.adicionarEndereco(valor));
                default -> {}
            }
        });
        usuarioRepository.saveAndFlush(usuario);
    }

    @Override
    public Usuario buscarUsuario(Long id) {
        return usuarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("usúario não foi encontrado"));
    }
}
