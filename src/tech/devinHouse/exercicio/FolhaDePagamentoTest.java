package tech.devinHouse.exercicio;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FolhaDePagamentoTest {

    private FolhaDePagamento folha;

    @BeforeEach
    void setup(){
        folha = new FolhaDePagamento();
    }

    @Test
    @DisplayName("Quando tem gratificacao deve add gratificacao no salario")
    void calcularSalarioBruto_comGratificacao(){
        //given
        Double salarioBase = 1000.0;
        Double gratificacao = 200.0;
            String funcao = "dev";
        //when
        Double resultado = folha.calcularSalarioBruto(salarioBase,gratificacao,funcao);
        //then
        assertEquals(1200,resultado);
        assertNotNull(resultado);
    }

    @Test
    @DisplayName("Quando não tem gratificacao deve add gratificacao no salario")
    void calcularSalarioBruto_semGratificacao(){
        //given
        Double salarioBase = 1000.0;
        Double gratificacao = null;
        String funcao = "dev";
        //when
        Double resultado = folha.calcularSalarioBruto(salarioBase,gratificacao,funcao);
        //then
        assertEquals(1000,resultado);
        assertNotNull(resultado);
    }
    @Test
    @DisplayName("Quando gerente nao  deve add gratificacao no salario")
    void calcularSalarioBruto_gerente(){
        //given
        Double salarioBase = 1000.0;
        Double gratificacao = null;
        String funcao = "gerente";
        //when
        Double resultado = folha.calcularSalarioBruto(salarioBase,gratificacao,funcao);
        //then
        assertEquals(1300,resultado);
        assertNotNull(resultado);
    }
    @Test
    void calcularSalarioLiquido() {
        Double salario = 100.0;
        List<Double> descontos = new ArrayList<>();
        descontos.add(200.0);
        assertThrows(IllegalStateException.class, () -> folha.calcularSalarioLiquido(salario, descontos));
    }

}