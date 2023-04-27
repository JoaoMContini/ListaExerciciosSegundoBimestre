package com.mycompany.exerciciosobreempregados;
public class ExercicioSobreEmpregados {

    public static void main(String[] args) {
        Gerente g = new Gerente("SQ Vendas", 30600, "Carlos");
        System.out.println(g.toString(g.getDepartamento(), g.salario, g.n));
        Vendedor v = new Vendedor(10, 1500, "João");
        System.out.println(v.toString(v.n, v.salario, v.calcularSalario(v.salario, 10), 10));
    }
}
