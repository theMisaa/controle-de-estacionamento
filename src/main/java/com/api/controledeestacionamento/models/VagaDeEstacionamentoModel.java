package com.api.controledeestacionamento.models;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "TABELA_VAGAS")
public class VagaDeEstacionamentoModel{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(nullable = false, unique = true, length = 10)
    private String numeroDaVaga;
    @Column(nullable = false, unique = true, length = 7)
    private String numeroDaPlaca;
    @Column(nullable = false, length = 70)
    private String marcaDoCarro;
    @Column(nullable = false, length = 70)
    private String modeloDoCarro;
    @Column(nullable = false, length = 70)
    private String corDoCarro;
    @Column(nullable = false)
    private LocalDateTime dataDoRegistro;
    @Column(nullable = false, length = 130)
    private String nomeDoResponsavel;
    @Column(nullable = false, length = 30)
    private String apartamento;
    @Column(nullable = false, length = 10)
    private String bloco;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public LocalDateTime getDataDoRegistro() {
        return dataDoRegistro;
    }

    public void setDataDoRegistro(LocalDateTime dataDoRegistro) {
        this.dataDoRegistro = dataDoRegistro;
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
