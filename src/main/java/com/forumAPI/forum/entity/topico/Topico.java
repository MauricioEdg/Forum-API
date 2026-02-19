package com.forumAPI.forum.entity.topico;

import com.forumAPI.forum.entity.curso.Curso;
import com.forumAPI.forum.entity.resposta.Resposta;
import com.forumAPI.forum.entity.usuario.Usuario;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Table(name="topico")
@Entity(name="Topico")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String titulo;
    @NotBlank
    private String mensagem;
    private LocalDateTime data_criacao;
    @Enumerated(EnumType.STRING)
    private StatusMensagemEnum status;
    @ManyToOne
    @JoinColumn(name = "autor_id")
    private Usuario autor;
    @ManyToOne
    @JoinColumn(name = "curso_id")
    private Curso curso;
    @OneToMany(mappedBy = "topico", cascade = CascadeType.ALL)
    private List<Resposta> respostas = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public LocalDateTime getData_criacao() {
        return data_criacao;
    }

    public void setData_criacao(LocalDateTime data_criacao) {
        this.data_criacao = data_criacao;
    }

    public StatusMensagemEnum getStatus() {
        return status;
    }

    public void setStatus(StatusMensagemEnum status) {
        this.status = status;
    }

    public Usuario getAutor() {
        return autor;
    }

    public void setAutor(Usuario autor) {
        this.autor = autor;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public List<Resposta> getRespostas() {
        return respostas;
    }

    public void setRespostas(List<Resposta> respostas) {
        this.respostas = respostas;
    }

    public void atualizarDados(TopicoDadosAtualizacao dados) {
        if(dados.titulo() != null){
            this.titulo = dados.titulo();
        }
        if(dados.mensagem() != null){
            this.mensagem = dados.mensagem();
        }
        if(dados.status() != null){
            this.status = dados.status();
        }

    }
}
