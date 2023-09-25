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
    //TESTES COM CLASSE DE EQUIVALENCIA
    @Test
    void testeOrigemFalseDestinoFalse() {
        Passageiro pas = new Passageiro("Jorge");
        Cidade cidade = new Cidade("SP");
        Cidade cidade2 = new Cidade("SJC");
        Cidade cidade3 = new Cidade("RJ");
        Cidade cidade4 = new Cidade("BH");
        Rota rota = new Rota(new LinkedHashMap<>(), 10, 4);
        Viagem viagem = new Viagem("2023-08-08 23:59:59", pas, rota);

        // Criação de cidadeOrigem e cidadeDestino em 'rota'
        rota.addRota(cidade, cidade2);

        // Teste em que nenhuma cidade existem em 'rota'
        Assertions.assertTrue(rota.verificarRota(cidade3, cidade4));

        // Teste em que cidadeOrigem existe em 'rota' mas cidadeDestino não existe
        Assertions.assertTrue(rota.verificarRota(cidade, cidade4));

        // Teste em que cidadeOrigem não existe mas cidadeDestino existe em 'rota'
        Assertions.assertTrue(rota.verificarRota(cidade3, cidade2));

        // Teste em que ambas cidadeOrigem e cidadeDestino existem em 'rota'
        Assertions.assertTrue(rota.verificarRota(cidade, cidade2));
    }

    @Test
    void testeOrigemTrueDestinoFalse() {
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
    void testeOrigemFalseDestinoTrue() {
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
    void testeOrigemTrueDestinoTrue() {
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
