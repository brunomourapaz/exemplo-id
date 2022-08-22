package com.devinhouse.di.notificacao;

import com.devinhouse.di.modelo.Cliente;

public interface Notificador {
	
	void notificar(Cliente cliente, String mensagem);

}
