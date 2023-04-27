package com.mycompany.exerciciocontabancaria;
public class ContaEspecial extends ContaBancaria {
    private float limite;

    public ContaEspecial(String pCliente, int pNumConta, float pSaldo, float pLimite) {
        super(pCliente, pNumConta, pSaldo);
        this.limite = pLimite;
    }
    public void sacar(float valor) {
        if (getSaldo() - valor < -limite) {
            System.out.println("Limite de crédito excedido");
        } else {
            setSaldo(getSaldo() - valor);
        }
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }
}

