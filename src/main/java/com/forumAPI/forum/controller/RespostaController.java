package com.forumAPI.forum.controller;

import com.forumAPI.forum.entity.resposta.Resposta;
import com.forumAPI.forum.entity.resposta.RespostaDTO;
import com.forumAPI.forum.entity.resposta.RespostaResponseDTO;
import com.forumAPI.forum.services.RespostaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("resposta")
public class RespostaController {

    @Autowired
    private RespostaService respostaService;
    @PostMapping
    public ResponseEntity<RespostaResponseDTO> cadastraResposta(@RequestBody @Valid RespostaDTO resposta){
        Resposta novaResposta = respostaService.criaResposta(resposta);                 
        return ResponseEntity.ok(new RespostaResponseDTO(novaResposta));
    }
}
