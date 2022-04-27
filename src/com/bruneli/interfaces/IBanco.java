package com.bruneli.interfaces;

import com.bruneli.entities.Conta;

public interface IBanco {
	
	void listarClientes();
	void addConta(Conta conta);
	void getClientesMaiorSaldo(int limit);

}
