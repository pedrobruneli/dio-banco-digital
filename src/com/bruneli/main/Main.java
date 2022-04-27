package com.bruneli.main;

import com.bruneli.entities.Banco;
import com.bruneli.entities.Cliente;
import com.bruneli.entities.ContaCorrente;
import com.bruneli.entities.ContaPoupanca;

public class Main {
	
	public static void main(String[] args) {
		Banco bc = new Banco("Bradesco");
		
		Cliente cliente = new Cliente("Pedro");
		ContaCorrente cc = new ContaCorrente(cliente);
		cc.setSaldo(250);
		
		Cliente cliente2 = new Cliente("Osvaldo");
		ContaPoupanca c2 = new ContaPoupanca(cliente2);
		c2.setSaldo(100);
		
		Cliente cliente3 = new Cliente("Claudio");
		ContaPoupanca c3 = new ContaPoupanca(cliente3);
		c3.setSaldo(887.90);
		
		
		bc.addConta(cc);
		bc.addConta(c2);
		bc.addConta(c3);
		
		bc.getClientesMaiorSaldo(3);
	}

}
