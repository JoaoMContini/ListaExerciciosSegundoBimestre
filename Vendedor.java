package com.mycompany.exerciciosobreempregados;
public class Vendedor extends Empregado{
    private float percentualComissao;

    String n = getNome();
    public Vendedor(float percentualComissao,float pSalario, String pNome) {
        this.percentualComissao = percentualComissao;
        this.salario = pSalario;
        this.n = pNome;
    }
    
    
    public float calcularSalario(float pSalario, float pComissao){
        float salarioComissionaado = (pSalario + (pSalario * (pComissao/100)));
        return salarioComissionaado;
}

    public float getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(float percentualComissao) {
        this.percentualComissao = percentualComissao;
    }
    
    public String toString(String pNome, float s, float sC, float c){
       float salario = s;
       float salarioC = sC;
       float comissao = c;
       String str = String.valueOf(salario);
       String str2 = String.valueOf(salarioC);
       String str3 = String.valueOf(comissao);
       
       String t = "\nNome: " + pNome + "\nSalário: " + str + "\nSalário com Comissao: " + str2 + "\nComissao: " + str3;
       return  t;
       
    }
}
