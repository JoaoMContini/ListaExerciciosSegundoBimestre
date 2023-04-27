package com.mycompany.exerciciocontabancaria;
public class ContaBancaria {
    private String cliente;
    private int numConta;
    private float saldo;

    public ContaBancaria(String pCliente, int pNumConta, float pSaldo) {
        this.cliente = pCliente;
        this.numConta = pNumConta;
        this.saldo = pSaldo;
    }

    public void sacar(float pValor) {
        if (saldo - pValor < 0) {
            System.out.println("Sem saldo suficiente");
        } else {
            saldo -= pValor;
        }
    }

    public void depositar(float pValor) {
        saldo += pValor;
    }

    public String getCliente() {
        return cliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public float getSaldo() {
        return saldo;
    }
    
    public void setSaldo(float pSaldo) {
        this.saldo = pSaldo;
    }
}
