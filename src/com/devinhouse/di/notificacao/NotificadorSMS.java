package com.devinhouse.di.notificacao;

import com.devinhouse.di.modelo.Cliente;

public class NotificadorSMS implements Notificador{

	// simula o envio de notificação por SMS
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s SMS através do telefone %s: %s\n", 
				cliente.getNome(), cliente.getTelefone(), mensagem);
		
		
	}

}
