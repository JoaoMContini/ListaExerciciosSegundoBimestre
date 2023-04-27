package com.mycompany.exerciciocontabancaria;
public class ContaPoupanca extends ContaBancaria {
    private int diaRendimento;

    public ContaPoupanca(String pCliente, int pNumConta, float pSaldo, int pDiaRendimento) {
        super(pCliente, pNumConta, pSaldo);
        this.diaRendimento = pDiaRendimento;
    }

    public void calcularNovoSaldo(float pTaxaRendimento) {
        int diaAtual = 15;
        if (diaAtual == diaRendimento) {
            float novoSaldo = getSaldo() + (getSaldo() * pTaxaRendimento);
            setSaldo(novoSaldo);
        }
    }
}
