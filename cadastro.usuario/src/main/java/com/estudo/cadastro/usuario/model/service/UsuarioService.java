package com.estudo.cadastro.usuario.model.service;

import com.estudo.cadastro.usuario.DTO.UsuarioDTO;
import com.estudo.cadastro.usuario.model.entity.Usuario;

import java.util.Map;
public interface UsuarioService {
    public void criarUsuario(UsuarioDTO usuarioDTO);
    public void deletarUsuario(Long id);
    public void atualisarUsuario(Long id, Map<String, String> listaAtributos);
    public Usuario buscarUsuario(Long id);
}
