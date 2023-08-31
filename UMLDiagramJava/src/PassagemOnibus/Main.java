/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PassagemOnibus;

import java.util.*;

/**
 *
 * @author André
 */
public class Main {
    
    public static void main(String[] args) {
        Passageiro passageiro = new Passageiro("Maria José");
        Rota rota = new Rota(new LinkedHashMap<>(), 10, 4);
        String dataHora = "2023-10-05 20:00:00";
        
        rota.addRota(new Cidade ("São Paulo"), new Cidade("Rio de Janeiro"));
        rota.addRota(new Cidade ("São Paulo"), new Cidade("Belo Horizonte"));
        rota.addRota(new Cidade ("São Paulo"), new Cidade("São José dos Campos"));
        rota.addRota(new Cidade("Rio de Janeiro"), new Cidade("São Paulo"));
        
        
        Viagem viagem = new Viagem(dataHora, passageiro, rota);
        
        Cidade cidadeOrigem = new Cidade("São Paulo");        
        System.out.println("Exemplo de busca de viagem partindo de São Paulo");
        rota.verificarOrigem(cidadeOrigem);        
        System.out.println("Exemplo em que o usuário escolheu Rio de Janeiro como destino");
    }    
}
