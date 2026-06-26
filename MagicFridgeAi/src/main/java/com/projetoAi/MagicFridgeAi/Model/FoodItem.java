package com.projetoAi.MagicFridgeAi.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.val;

import java.time.LocalDate;

@Entity
@Table(name = "food_items")
@NoArgsConstructor
@AllArgsConstructor
public class FoodItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String categoria;
    private Integer quantidade;
    private LocalDate validade;

    //Getters e Setters
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCategoria(){
        return categoria;
    }
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }

    public Integer getQuantidade(){
        return  quantidade;
    }
    public void setQuantidade(Integer quantidade){
        this.quantidade = quantidade;
    }

    public LocalDate getValidade(){
        return validade;
    }
    public void setValidade(LocalDate validade){
        this.validade = validade;
    }

}
