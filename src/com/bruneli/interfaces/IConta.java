package com.bruneli.interfaces;

import com.bruneli.entities.Conta;

public interface IConta{
	
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, Conta conta);
	
	void imprimirExtrato();

}
