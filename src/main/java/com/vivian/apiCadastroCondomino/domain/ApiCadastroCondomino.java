package com.vivian.apiCadastroCondomino.domain;

import org.bson.types.ObjectId;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class ApiCadastroCondomino {
    @Id
    private ObjectId _id;

    @NotNull(message = "Nome não pode ser nulo")
    @NotEmpty(message = "Nome não pode ser vazio")
    private String nome;

    @NotNull(message = " CPF não pode ser nulo")
    @NotEmpty(message = "CPF não pode ser vazio")
    @CPF
    private String cpf;

    @NotNull(message = "A identificação da unidade não pode ser nula")
    @NotEmpty(message = "A identificação da unidade não pode ser vazia")

    private String identificacaoUnidade;

    public ApiCadastroCondomino() {

    }

    public ApiCadastroCondomino(ObjectId _id, String nome,   String cpf,  String identificacaoUnidade) {
        this._id = _id;
        this.nome = nome;
        this.cpf = cpf;
        this.identificacaoUnidade = identificacaoUnidade;
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getIdentificacaoUnidade() {
        return identificacaoUnidade;
    }

    public void setIdentificacaoUnidade(String identificacaoUnidade) {
        this.identificacaoUnidade = identificacaoUnidade;
    }
}
