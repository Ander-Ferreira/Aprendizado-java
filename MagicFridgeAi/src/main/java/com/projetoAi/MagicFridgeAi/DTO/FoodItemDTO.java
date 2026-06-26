package com.projetoAi.MagicFridgeAi.DTO;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
public class FoodItemDTO {
    private Long id;
    private String nome;
    private String categoria;
    private Integer quantidade;
    private LocalDate validade;

    //Getters
    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public LocalDate getValidade() {
        return validade;
    }

    //Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }




}
