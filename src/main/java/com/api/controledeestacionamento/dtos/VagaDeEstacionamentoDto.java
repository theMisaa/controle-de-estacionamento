package com.api.controledeestacionamento.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class VagaDeEstacionamentoDto {

    @NotBlank
    private String numeroDaVaga;
    @NotBlank
    @Size(max = 7)
    private String numeroDaPlaca;
    @NotBlank
    private String marcaDoCarro;
    @NotBlank
    private String modeloDoCarro;
    @NotBlank
    private String corDoCarro;
    @NotBlank
    private String nomeDoResponsavel;
    @NotBlank
    private String apartamento;
    @NotBlank
    private String bloco;

    public String getNumeroDaVaga() {
        return numeroDaVaga;
    }

    public void setNumeroDaVaga(String numeroDaVaga) {
        this.numeroDaVaga = numeroDaVaga;
    }

    public String getNumeroDaPlaca() {
        return numeroDaPlaca;
    }

    public void setNumeroDaPlaca(String numeroDaPlaca) {
        this.numeroDaPlaca = numeroDaPlaca;
    }

    public String getMarcaDoCarro() {
        return marcaDoCarro;
    }

    public void setMarcaDoCarro(String marcaDoCarro) {
        this.marcaDoCarro = marcaDoCarro;
    }

    public String getModeloDoCarro() {
        return modeloDoCarro;
    }

    public void setModeloDoCarro(String modeloDoCarro) {
        this.modeloDoCarro = modeloDoCarro;
    }

    public String getCorDoCarro() {
        return corDoCarro;
    }

    public void setCorDoCarro(String corDoCarro) {
        this.corDoCarro = corDoCarro;
    }

    public String getNomeDoResponsavel() {
        return nomeDoResponsavel;
    }

    public void setNomeDoResponsavel(String nomeDoResponsavel) {
        this.nomeDoResponsavel = nomeDoResponsavel;
    }

    public String getApartamento() {
        return apartamento;
    }

    public void setApartamento(String apartamento) {
        this.apartamento = apartamento;
    }

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }
}
