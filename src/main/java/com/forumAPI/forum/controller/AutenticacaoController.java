package com.forumAPI.forum.controller;

import com.forumAPI.forum.entity.perfil.DadosAutenticacao;
import com.forumAPI.forum.entity.perfil.Perfil;
import com.forumAPI.forum.security.TokenDadosJWT;
import com.forumAPI.forum.security.TokenService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class AutenticacaoController {

    @Autowired
    private AuthenticationManager manager;

    @Autowired
    private TokenService tokenService;
    @PostMapping
    public ResponseEntity efetuarLogin(@RequestBody  @Valid DadosAutenticacao dados){
        var authenticationToken = new UsernamePasswordAuthenticationToken(dados.nome(),dados.senha());

        var autentication = manager.authenticate(authenticationToken);

        var tokenJWT = tokenService.gerarToken((Perfil) autentication.getPrincipal());
        return ResponseEntity.ok(new TokenDadosJWT(tokenJWT));

    }
}
