package tech.devinHouse.aula;

import tech.devinHouse.aula.Operacao;

public class Calculadora {

    public Float calcular(float valor1, float valor2, Operacao operacao){


        Float resultado = null;
        switch (operacao){
           case SOMA:
               resultado = valor1 + valor2;
               break;
           case SUBRTACAO:
                resultado = valor1 - valor2;
                break;
           case MULTIPLICACAO:
                resultado = valor1 * valor2;
                break;
           case DIVISAO:
                resultado = valor1 / valor2;
                break;
        }
        return resultado;

   }




}
