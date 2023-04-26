package com.mycompany.exerciciosobreingressos;
import java.util.*;
public class Ingresso {
    private float valor = 314;

    public Ingresso(float pValor) {
        this.valor = pValor;
    }

    public String toString(){
        float n = this.valor;
        String str = String.valueOf(n);
        return str;
    }
    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
}
