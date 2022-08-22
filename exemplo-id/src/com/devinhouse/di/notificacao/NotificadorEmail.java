package com.devinhouse.di.notificacao;

import com.devinhouse.di.modelo.Cliente;

public class NotificadorEmail implements Notificador{

	// simula o envio de notificação por email
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do email %s: %s\n", 
				cliente.getNome(), cliente.getEmail(), mensagem);
	}

}
