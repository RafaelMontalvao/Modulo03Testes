package tech.devinHouse.aula;

import org.junit.jupiter.api.*;
import tech.devinHouse.aula.Operacao;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeAll
    static void setupAll(){
        System.out.println("executado uma unica vez no inicio da classe de teste");
    }

    static @AfterAll
    void tearDownAll(){
        System.out.println("executado uma unica ve no final da classe de teste");
    }

    @BeforeEach
    void setup(){
        System.out.println("Antes de cada metodo de teste");
        calculadora = new Calculadora();
    }

    @AfterEach
    void tearDown(){
        System.out.println("Depois de cada metodo de teste");

    }

    @Test
    @DisplayName("Quando operacao de soma 2 nros positivos deve retornar nro positivo")
    void calcular_soma1(){
       Float resultado = calculadora.calcular(2.1f,3.5f , Operacao.SOMA);
       assertNotNull(resultado); // garante que o resultado nao seja nulo.
       assertEquals(5.6f, resultado);
    }

    @Test
    @DisplayName("Quando operacao de soma 2 nros negativos deve retornar nro negativo")
    void calcular_erro1(){
        Float resultado = calculadora.calcular(-2.1f,-3.5f ,Operacao.SOMA);
        assertNotNull(resultado); // garante que o resultado nao seja nulo.
        assertEquals(-5.6f, resultado);
    }

    @Test
    @DisplayName("Quando operacao subtracao 2 numeros positivos com primeiro maior deve retornar um numero positivo")
    void calcular_subtracao_1(){ // teste subtracao
        Float resultado = calculadora.calcular(5f,3.5f ,Operacao.SUBRTACAO);
        assertNotNull(resultado); // garante que o resultado nao seja nulo.
        assertTrue(resultado >= 0);
        assertEquals(1.5f, resultado);
    }
    @Test
    @DisplayName("Quando operacao subtracao 2 numeros positivos com primeiro menor deve retornar um numero negativo")
    void calcular_subtracao_2(){ // teste subtracao
        Float resultado = calculadora.calcular(3.5f,5f ,Operacao.SUBRTACAO);
        assertNotNull(resultado); // garante que o resultado nao seja nulo.
        assertFalse(resultado >= 0);
        assertEquals(-1.5f, resultado);
    }
}