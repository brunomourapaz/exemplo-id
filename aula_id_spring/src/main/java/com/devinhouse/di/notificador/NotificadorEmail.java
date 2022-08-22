package com.devinhouse.di.notificador;

import org.springframework.stereotype.Component;

import com.devinhouse.di.modelo.Cliente;

@Component // defini que esta classe é um bean spring
public class NotificadorEmail {
	
	public NotificadorEmail() {
		System.out.println("NotificadorEmail");
	}
	
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do email %s: %s\n", 
				cliente.getNome(), cliente.getEmail(), mensagem);
	}

}

