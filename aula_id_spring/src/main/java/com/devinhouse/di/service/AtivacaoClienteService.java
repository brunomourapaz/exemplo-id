package com.devinhouse.di.service;

import org.springframework.stereotype.Component;

import com.devinhouse.di.modelo.Cliente;
import com.devinhouse.di.notificador.NotificadorEmail;

@Component
public class AtivacaoClienteService {

	private NotificadorEmail notificador;
	

	// vamos seguir na nossa aplicação implementando a injeção de dependência com spring, ou seja, como injetar um bean spring
	// em outro bean spring, vamos injetar o notificar email
	
	
	public void ativar(Cliente cliente) {

		// ativa o cliente
		cliente.ativar();

		// chama o notificar passando o cliente e a mensagem como parâmetros para
		// notificar o cliente
		this.notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");

	}


	// uma das formar de fazer a injecao de dependecias é pelo construtor
	// passamos como parâmetro um objeto que é gerenciando pelo spring, ou seja, um bean spring
	// lógica se o NotificadorEmail não for gerenciado pelo spring isso não ocorre, vamos comentar a anotação @Component lá
	public AtivacaoClienteService(NotificadorEmail notificador) {
		this.notificador = notificador;
		System.out.println("AtivacaoClienteService: "+notificador);
	}

}
