package com.devinhouse.di;

import com.devinhouse.di.modelo.Cliente;
import com.devinhouse.di.notificacao.Notificador;
import com.devinhouse.di.notificacao.NotificadorSMS;
import com.devinhouse.di.service.AtivacaoClienteService;

public class Main {
	
	public static void main(String[] args) {
		//instanciar cliente
		Cliente joao = new Cliente("João", "joao@xyz.com", "55999665541", true);
		Cliente maria = new Cliente("Maria", "maria@xyz.com", "8545854445", true);
		
		
		//instancia o tipo de notificador a usar
		Notificador notificadorSMS = new NotificadorSMS();
		
		//instanciar o servico de ativação do cliente injetando o notificador na classe Ativação cliente service
		// fazendo tudo isso de forma manual
		AtivacaoClienteService ativacaoClienteService = new AtivacaoClienteService(notificadorSMS);
		ativacaoClienteService.ativar(joao);
		ativacaoClienteService.ativar(maria);

	
		
	}

}
