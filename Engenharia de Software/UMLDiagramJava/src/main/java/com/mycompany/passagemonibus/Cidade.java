/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.passagemonibus;

import java.util.*;

/**
 *
 * @author AndreWakugawa
 */
public class Cidade {
    private String nome;

    public String getNome() {
        return nome;
    }

    public Cidade(String nome) {
        this.nome = nome;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Cidade cidade = (Cidade) obj;
        return Objects.equals(nome, cidade.nome);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
