package com.devinhouse.di;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.devinhouse.di.modelo.Cliente;
import com.devinhouse.di.service.AtivacaoClienteService;


@Controller // define que a classe é reponsável para receber requisições web
public class MeuPrimeiroController {
	
	private AtivacaoClienteService ativacaoClienteService;
	
    // agora vamos ver a ordem da instanciação quando a aplicação é iniciada
	// agora vamos chamar o hello
	// com isso finalizamos esta parte e veja que em nenhum momento usamos a palavra new para instanciar os objetos gerenciados pelo
	// spring 
	public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService) {
		this.ativacaoClienteService = ativacaoClienteService;
		
		System.out.println("MeuPrimeiroController: "+ativacaoClienteService);
	}


	@GetMapping("/hello") // define qual o caminho para chegar a essa resposta
	@ResponseBody // define que a resposta será no corpo da requisição)
	public String hello() {
		Cliente joao = new Cliente("João", "joao@xyz.com", "5566952155", true);
		ativacaoClienteService.ativar(joao);
		
		return "Hello!";
	}

}
