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
public class Viagem {
    private Passageiro passageiro;
    private Rota rota;

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public Viagem(String dataHora, Passageiro passageiro, Rota rota) {
        this.passageiro = passageiro;
        this.rota = rota;
    }

    public Rota getRota() {
        return rota;
    }

    public void setRota(Rota rota) {
        this.rota = rota;
    }
}
