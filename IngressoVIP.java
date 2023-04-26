package com.mycompany.exerciciosobreingressos;
import java.util.*;
public class IngressoVIP extends Ingresso {
    private float valorAdicional;
    
    public float getValor() {
        return super.getValor();
    }

    public String toString(){
       float valor = valorAdicional + getValor();
        String str = String.valueOf(valor);
        return str;
    }

    public IngressoVIP(float valorAdicional, float pValor) {
        super(pValor);
        this.valorAdicional = valorAdicional;
    }
    
    

    
    
    
}
