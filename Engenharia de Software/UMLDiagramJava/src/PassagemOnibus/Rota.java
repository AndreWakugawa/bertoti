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
    private HashMap <String , String>rota = new HashMap<String, String>();

    public HashMap<String, String> getRota() {
        return rota;
    }

    public void setRota(HashMap<String, String> rota) {
        this.rota = rota;
    }

    public Rota(HashMap rota) {
    }
    
    public boolean verificarRota(String cidadeOrigem, String cidadeDestino) {
        List <Rota> encontrados = new LinkedList<Rota>();
        for (String i : rota.keySet()) {
            for (String j : rota.values()) {
                if i.equals(String cidadeOrigem) {
                    if j.equals(cidadeDestino) {
                        encontrados.add();
                    }
                }
            }
        }
    }
}
