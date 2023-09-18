/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.passagemonibus.Cidade;
import com.mycompany.passagemonibus.Passageiro;
import com.mycompany.passagemonibus.Rota;
import com.mycompany.passagemonibus.Viagem;
import java.util.LinkedHashMap;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Noite
 */
public class teste {
    @Test
    void teste() {
        Passageiro pas = new Passageiro("Jorge");
        Cidade cidade = new Cidade("SP");
        Cidade cidade2 = new Cidade("SJC");
        Rota rota = new Rota(new LinkedHashMap<>(), 10, 4);
        Viagem viagem = new Viagem("2023-08-08 23:59:59", pas, rota);
        
        pas.setNome("Rita");
        Assertions.assertEquals(pas.getNome(), "Rita");
        cidade.getNome();
        rota.addRota(cidade, cidade2);
        rota.reservarAssento(2, 3, pas);
        Assertions.assertEquals(rota.verificarRota(cidade, cidade2),true);
        
    }
    
}
