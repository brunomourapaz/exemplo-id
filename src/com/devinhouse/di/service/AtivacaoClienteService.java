package com.devinhouse.di.service;

import com.devinhouse.di.modelo.Cliente;
import com.devinhouse.di.notificacao.Notificador;

public class AtivacaoClienteService {

	private Notificador notificador;

	public AtivacaoClienteService(Notificador notificador) {
		this.notificador = notificador;

	}

	public void ativar(Cliente cliente) {

		// ativa o cliente
		cliente.ativar();

		// chama o notificar passando o cliente e a mensagem como parâmetros para
		// notificar o cliente
		this.notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");

	}

}
