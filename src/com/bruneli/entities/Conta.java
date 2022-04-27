package com.bruneli.entities;

import com.bruneli.interfaces.IConta;

import lombok.Data;

@Data
public abstract class Conta implements IConta{

	private static final int AGENCIA_PADRAO = 1;	
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	@Override
	public void sacar(double valor) {
		this.saldo -= valor;
	}
	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}
	@Override
	public void transferir(double valor, Conta conta) {
		this.saldo -= valor;
		conta.depositar(valor);
	}
	
	protected void imprimirInfos() {
		System.out.println("Titular: " + cliente.getNome());
		System.out.println("Agencia: " + this.agencia);
		System.out.println("Conta: " + this.numero);
		System.out.println("Saldo: " + this.saldo);
	}

}
