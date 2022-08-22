package com.devinhouse.di.service;

import com.devinhouse.di.modelo.Cliente;
import com.devinhouse.di.modelo.Produto;
import com.devinhouse.di.notificacao.Notificador;
import com.devinhouse.di.notificacao.NotificadorEmail;
import com.devinhouse.di.notificacao.NotificadorSMS;

public class EmissaoNotaFiscalService {

	private Notificador notificador;

	public EmissaoNotaFiscalService(Notificador notificador) {
		this.notificador = notificador;

	}

	public void emitir(Cliente cliente, Produto produto) {
		// TODO emite a nota fiscal aqui...
		NotificadorSMS notificador = new NotificadorSMS();
		this.notificador.notificar(cliente, " Nota fiscal do produto " + produto.getNome() + "foi emitida ");

	}

}
