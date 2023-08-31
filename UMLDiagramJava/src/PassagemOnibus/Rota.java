/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PassagemOnibus;

import java.util.*;

/**
 *
 * @author AndreWakugawa
 */
public class Rota {
    private HashMap <Cidade, List<Cidade>>rota = new LinkedHashMap<>();
    private Assento[][] assentos;

    public HashMap <Cidade, List<Cidade>> getRota() {
        return rota;
    }

    public void setRota(HashMap<Cidade, List<Cidade>> rota) {
        this.rota = rota;
    }

    public Assento[][] getAssentos() {
        return assentos;
    }

    public Rota(HashMap<Cidade, List<Cidade>>rota, int linhas, int colunas) {
        this.rota = new LinkedHashMap<>();
        this.assentos = new Assento[linhas][colunas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                this.assentos[i][j] = new Assento();
            }
        }
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
    
    public void visualizarAssentos() {
    for (int i = 0; i < assentos.length; i++) {
        for (int j = 0; j < assentos[i].length; j++) {
            System.out.print(assentos[i][j].isReservado() ? "X " : "O ");
            }
        System.out.println();
        }
    }
    
    public void reservarAssento(int linha, int coluna, Passageiro passageiro) {
        if (linha >= 0 && linha < assentos.length && coluna >= 0 && coluna < assentos[linha].length) {
            Assento assento = assentos[linha][coluna];
            if (!assento.isReservado()) {
                assento.setPassageiro(passageiro);
                System.out.println("Assento reservado na linha " +linha + ", coluna " +coluna);
            } else {
                System.out.println("Assento já está reservado.");
            }
        } else {
            System.out.println("Assento inválido.");
        }
    }
}
