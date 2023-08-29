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
public class Viagem {
    private List<Usuario> listaPassageiros = new LinkedList<Usuario>();
    private Rota rota;

    public List<Usuario> getListaPassageiros() {
        return listaPassageiros;
    }

    public void setListaPassageiros(List<Usuario> listaPassageiros) {
        this.listaPassageiros = listaPassageiros;
    }

    public Viagem(String dataHora, List<Usuario> listaPassageiros, Rota rota) {
        this.listaPassageiros = listaPassageiros;
        this.rota = rota;
    }
}
