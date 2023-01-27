package com.algaworks.algalog.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalog.domain.model.Cliente;

@RestController
public class ClienteController {
	@GetMapping("/clientes")
	public List<Cliente> Listar() {
		Cliente cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("João 2");
		cliente1.setEmail("joao@algawors.com");
		cliente1.setTelefone("11 99999-8888");
		
		Cliente cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Maria 2");
		cliente2.setEmail("maria@algawors.com");
		cliente2.setTelefone("11 99999-5558");
		
		return Arrays.asList(cliente1, cliente2);
	}
}
