/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.passagemonibus.*;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Noite
 */
public class TesteRota {

    @Test
    void reservarAssentoExpected() {
        Assento ass = new Assento();
        Passageiro pas = new Passageiro("Jorge");
        Cidade cidade = new Cidade("SP");
        Cidade cidade2 = new Cidade("SJC");
        Rota rota = new Rota(new HashMap<>(), 4, 2);
        rota.reservarAssento(1,1, pas);
        Assertions.assertEquals(pas.getNome(), rota.getAssentos()[1][1].getPassageiro().getNome());
    }

    //TESTES COM CLASSE DE EQUIVALENCIA
    @Test
    void verificarRotaOrigemFalseDestinoFalse() {
        Passageiro pas = new Passageiro("Jorge");
        Cidade cidade = new Cidade("SP");
        Cidade cidade2 = new Cidade("SJC");
        Cidade cidade3 = new Cidade("RJ");
        Cidade cidade4 = new Cidade("BH");
        Rota rota = new Rota(new LinkedHashMap<>(), 10, 4);
        Viagem viagem = new Viagem("2023-08-08 23:59:59", pas, rota);

        // Criação de cidadeOrigem e cidadeDestino em 'rota'
        rota.addRota(cidade, cidade2);

        // Teste em que nenhuma cidade existe em 'rota'
        Assertions.assertTrue(rota.verificarRota(cidade3, cidade4));
    }

    @Test
    void verificarRotaOrigemTrueDestinoFalse() {
        Passageiro pas = new Passageiro("Jorge");
        Cidade cidade = new Cidade("SP");
        Cidade cidade2 = new Cidade("SJC");
        Cidade cidade3 = new Cidade("RJ");
        Cidade cidade4 = new Cidade("BH");
        Rota rota = new Rota(new LinkedHashMap<>(), 10, 4);
        Viagem viagem = new Viagem("2023-08-08 23:59:59", pas, rota);

        // Criação de cidadeOrigem e cidadeDestino em 'rota'
        rota.addRota(cidade, cidade2);

        // Teste em que cidadeOrigem existe em 'rota' mas cidadeDestino não existe
        Assertions.assertTrue(rota.verificarRota(cidade, cidade4));
    }

    @Test
    void verificarRotaOrigemFalseDestinoTrue() {
        Passageiro pas = new Passageiro("Jorge");
        Cidade cidade = new Cidade("SP");
        Cidade cidade2 = new Cidade("SJC");
        Cidade cidade3 = new Cidade("RJ");
        Cidade cidade4 = new Cidade("BH");
        Rota rota = new Rota(new LinkedHashMap<>(), 10, 4);
        Viagem viagem = new Viagem("2023-08-08 23:59:59", pas, rota);

        // Criação de cidadeOrigem e cidadeDestino em 'rota'
        rota.addRota(cidade, cidade2);

        // Teste em que cidadeOrigem não existe mas cidadeDestino existe em 'rota'
        Assertions.assertTrue(rota.verificarRota(cidade3, cidade2));
    }

    @Test
    void verificarRotaOrigemTrueDestinoTrue() {
        Passageiro pas = new Passageiro("Jorge");
        Cidade cidade = new Cidade("SP");
        Cidade cidade2 = new Cidade("SJC");
        Cidade cidade3 = new Cidade("RJ");
        Cidade cidade4 = new Cidade("BH");
        Rota rota = new Rota(new LinkedHashMap<>(), 10, 4);
        Viagem viagem = new Viagem("2023-08-08 23:59:59", pas, rota);

        // Criação de cidadeOrigem e cidadeDestino em 'rota'
        rota.addRota(cidade, cidade2);

        // Teste em que ambas cidadeOrigem e cidadeDestino existem em 'rota'
        Assertions.assertTrue(rota.verificarRota(cidade, cidade2));
    }

}
