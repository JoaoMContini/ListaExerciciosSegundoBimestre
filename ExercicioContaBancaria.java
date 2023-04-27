package com.mycompany.exerciciocontabancaria;
import java.util.*;
public class ExercicioContaBancaria{
    public static void main(String[] args) {
        ArrayList<ContaBancaria> contas = new ArrayList<>();
        
        ContaBancaria conta1 = new ContaBancaria("Marcos", 231, 40020);
        ContaPoupanca conta2 = new ContaPoupanca("Maria", 4545, 30050, 5);
        ContaEspecial conta3 = new ContaEspecial("Pedro", 781239, 3000, 5500);
        
        contas.add(conta1);
        contas.add(conta2);
        contas.add(conta3);
        
        contas.get(0).sacar(590);
        
        contas.get(1).depositar(3000);
    }
}
