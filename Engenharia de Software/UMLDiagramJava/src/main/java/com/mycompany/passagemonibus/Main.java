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
public class Main {
    
    public static void main(String[] args) {
        Passageiro passageiro = new Passageiro("Maria José");
        Rota rota = new Rota(new LinkedHashMap<>(), 10, 4);
        String dataHora = "2023-10-05 20:00:00";
        Cidade cidade1 = new Cidade("Taubate");
        Cidade cidade2 = new Cidade("Jacarei");
        rota.addRota(new Cidade ("São Paulo"), new Cidade("Rio de Janeiro"));
        rota.addRota(new Cidade ("São Paulo"), new Cidade("Belo Horizonte"));
        rota.addRota(new Cidade ("São Paulo"), new Cidade("São José dos Campos"));
        rota.addRota(new Cidade("Rio de Janeiro"), new Cidade("São Paulo"));
        
        
        Viagem viagem = new Viagem(dataHora, passageiro, rota);
        rota.verificarRota(cidade1, cidade2);
        
        Cidade cidadeOrigem = new Cidade("São Paulo");        
        System.out.println("Exemplo de busca de viagem partindo de São Paulo");
        rota.verificarOrigem(cidadeOrigem);        
        System.out.println("Exemplo em que o usuário escolheu Rio de Janeiro como destino");
        
        System.out.println("Visualização dos assentos da rota antes da reserva do usuário");
        rota.visualizarAssentos();
        
        System.out.println("Visualização dos assentos após a reserva do usuário");
        rota.reservarAssento(0, 3, passageiro);
        rota.visualizarAssentos();
    }
}
