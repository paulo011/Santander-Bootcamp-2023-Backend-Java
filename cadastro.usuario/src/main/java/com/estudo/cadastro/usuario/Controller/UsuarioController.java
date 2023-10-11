package com.estudo.cadastro.usuario.Controller;

import com.estudo.cadastro.usuario.DTO.UsuarioDTO;
import com.estudo.cadastro.usuario.model.entity.Usuario;
import com.estudo.cadastro.usuario.serviceImpl.UsuarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping(value = "/usuario")

public class UsuarioController {
    @Autowired
    private UsuarioServiceImpl usuarioService;

    @PostMapping
    public void AdicionarUsuario(@RequestBody UsuarioDTO usuarioDTO){
        usuarioService.criarUsuario(usuarioDTO);
    }

    @GetMapping(value = "/{id}")
    public Usuario buscarUsuario(@PathVariable("id") long id){
        return usuarioService.buscarUsuario(id);
    }

    @DeleteMapping(value = "/{id}")
    public void deletarUsuario(@PathVariable("id") long id){
        usuarioService.deletarUsuario(id);
    }

    @PutMapping(value = "/{id}")
    public void atualizarUsuario(@PathVariable("id") long id,@RequestBody Map<String, String> listaAtributos){
        usuarioService.atualisarUsuario(id, listaAtributos);
    }
}
