package com.trybe.contapoupanca;

public class ContaPoupanca {
  double saldo;
  String titularConta;

  public ContaPoupanca(String nomeTitular, double depositoInicial) {
    this.depositar(depositoInicial);
    this.insereTitularConta(nomeTitular);
  }

  public void insereTitularConta(String titularConta) {
    this.titularConta = titularConta;
  }

  public void depositar(double valor) {
    this.saldo += valor;
  }

  public void sacar(double valor) {
    if (saldo < valor) {
      System.out.println("Saldo insuficiente");
    }
    this.saldo -= valor;
  }

  public double mostrarSaldo() {
    return this.saldo;
  }

  public String mostrarTitularConta() {
    return this.titularConta;
  }
}
