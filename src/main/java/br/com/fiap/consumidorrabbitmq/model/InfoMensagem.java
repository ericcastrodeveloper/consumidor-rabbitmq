package br.com.fiap.consumidorrabbitmq.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class InfoMensagem implements Serializable {

    @JsonProperty("autor_postagem")
    private String autorPostagem;
    @JsonProperty("autor_comentario")
    private String autorComentario;
    private String data;
    private String comentario;
    @JsonProperty("email_notificacao")
    private String emailNotificacao;

    public String getAutorPostagem() {
        return autorPostagem;
    }

    public void setAutorPostagem(String autorPostagem) {
        this.autorPostagem = autorPostagem;
    }

    public String getAutorComentario() {
        return autorComentario;
    }

    public void setAutorComentario(String autorComentario) {
        this.autorComentario = autorComentario;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getEmailNotificacao() {
        return emailNotificacao;
    }

    public void setEmailNotificacao(String emailNotificacao) {
        this.emailNotificacao = emailNotificacao;
    }
}
