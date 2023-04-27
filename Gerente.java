package com.mycompany.exerciciosobreempregados;
public class Gerente extends Empregado{
    private String departamento;
    
    float s = salario;
    String n = getNome();
    
    public Gerente(String departamento, float pSalario, String pNome){
        this.departamento = departamento;
        this.salario = pSalario;
        this.n = pNome;
    }
    
    public String toString(String pDpto, float s, String n){
       float f = s;
       String str = String.valueOf(f);
       String t =  "\nSalário: " + str + "\nDepartamento: " + pDpto + "\nNome: " + n;
       return  t;
       
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
}
