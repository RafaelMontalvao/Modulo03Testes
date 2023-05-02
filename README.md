# Modulo03Testes
repositório do 3° modulo do Curso DevinHouse[Ilog] - Testes unitários.
Exericio 01 da semana.
a) Implementar uma classe 'FolhaDePagamento' conforme exemplo abaixo.
b) Implementar testes unitários para o método 'calcularSalarioBruto'.
c) Implementar testes unitários para o outro método 'calcularSalarioLiquido'.

‌

import java.util.List;

public class FolhaDePagamento {

 public Double calcularSalarioBruto(Double salarioBase, Double gratificacao, String funcao) {
    Double salario = salarioBase;
    if (gratificacao != null) {
        salario += gratificacao;
    }
    if (funcao.equals("gerente")) {
        salario *= 1.30;
    }
    return salario;
}

public Double calcularSalarioLiquido(Double salario, List<Double> descontos) {
    if (descontos == null || descontos.isEmpty()) {
        return salario;
    }
    for(Double desconto : descontos) {
        salario -= desconto;
    }
    if (salario < 0) {
        throw new IllegalStateException();
    }
    return salario;
 }
}
