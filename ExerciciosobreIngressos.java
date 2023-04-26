package com.mycompany.exerciciosobreingressos;
public class ExerciciosobreIngressos {

    public static void main(String[] args) {
    Ingresso ing = new Ingresso(150);
        System.out.println("O valor do ingresso é: " + ing.toString());    
    IngressoVIP ingV = new IngressoVIP(ing.getValor(), 150);
    System.out.println("O valor do ingresso VIP é: " + ingV.toString());
    }
}
