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
        
        HashMap<Cidade, List<Cidade>> rotasMap = new LinkedHashMap<>();
//        rotasMap.put(new Cidade("São Paulo"), Arrays.asList(new Cidade("Rio de Janeiro"), new Cidade("Belo Horizonte")));
//        rotasMap.put(new Cidade("Rio de Janeiro"), Arrays.asList(new Cidade("Salvador")));
        
        Rota rota = new Rota(rotasMap);
        
        rota.addRota(new Cidade ("São Paulo"), new Cidade("Rio de Janeiro"));
        rota.addRota(new Cidade ("São Paulo"), new Cidade("Belo Horizonte"));
        rota.addRota(new Cidade ("São Paulo"), new Cidade("São José dos Campos"));
        rota.addRota(new Cidade("Rio de Janeiro"), new Cidade("São Paulo"));
        
        Cidade cidadeOrigem = new Cidade("São Paulo");        
        System.out.println("Exemplo de busca de viagem partindo de São Paulo");
        rota.verificarOrigem(cidadeOrigem);        
        System.out.println("Exemplo em que o usuário escolheu Rio de Janeiro como destino");
        
        
        
    }


        
}
