/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PassagemOnibus;

import java.util.*;

/**
 *
 * @author Noite
 */
public class Rota {
    private HashMap <Cidade, List<Cidade>>rota = new LinkedHashMap<>();

    public HashMap <Cidade, List<Cidade>> getRota() {
        return rota;
    }

    public void setRota(HashMap<Cidade, List<Cidade>> rota) {
        this.rota = rota;
    }

    public Rota(HashMap<Cidade, List<Cidade>>rota) {
        this.rota = new LinkedHashMap<>();
    }
    
    public boolean verificarRota(Cidade cidadeOrigem, Cidade cidadeDestino) {
        
        return rota.containsKey(cidadeOrigem) && rota.get(cidadeOrigem).equals(cidadeDestino);
        }
    
    public void addRota(Cidade cidadeOrigem, Cidade cidadeDestino) {
        if (rota.containsKey(cidadeOrigem)) {
            List<Cidade> destinoExistente = rota.get(cidadeOrigem);
            destinoExistente.add(cidadeDestino);
        } else {
            List<Cidade> destinos = new ArrayList<>();
            destinos.add(cidadeDestino);
            rota.put(cidadeOrigem, destinos);
        }
    }
    
    public void verificarOrigem(Cidade cidadeOrigem) {
        if (rota.containsKey(cidadeOrigem)) {
            List<Cidade> destinos = rota.get(cidadeOrigem);
            
            System.out.println("Rotas partindo de " +cidadeOrigem.getNome());
            
            for (Cidade destino : destinos) {
                System.out.println(cidadeOrigem.getNome() + " -> " + destino.getNome());
            }            
        } else {
            System.out.println("Não existem rotas partindo de " +cidadeOrigem.getNome());
        }
    }
}
