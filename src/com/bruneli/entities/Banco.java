package com.bruneli.entities;

import java.util.ArrayList;
import java.util.List;

import com.bruneli.interfaces.IBanco;

import lombok.Data;

@Data
public class Banco implements IBanco {

	private String nome;
	private List<Conta> contas = new ArrayList<>();

	public Banco(String nome) {
		this.nome = nome;
	}

	@Override
	public void listarClientes() {
		System.out.println("=== CLIENTES DO BANCO ===");
		if (contas.size() > 0) {
			for (Conta c : contas) {
				System.out.println(c.getCliente().getNome());
			}
		} else System.out.println("Não há clientes cadastrados");
	}

	@Override
	public void addConta(Conta c) {
		this.contas.add(c);
	}

	@Override
	public void getClientesMaiorSaldo(int limit) {
		contas.sort((a,b) -> Double.valueOf(b.getSaldo() - a.getSaldo()).intValue());
		System.out.println("=== CONTAS DE MAIORES SALDO ===");
		for(Conta c : contas.stream().limit(limit).toList()) {
			System.out.println(c.getCliente().getNome() + " - R$" + c.getSaldo());
		}
	}

}
