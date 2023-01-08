package com.msclient.Client;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/client")
public class ClientController {

	@Autowired
	private ClientRepository clientRepository;
	
	@Autowired
	private ClientService clientService;
	
	@PostMapping
	public Client saveClient(@Validated @RequestBody Client client) {
		System.out.println(client);
		return clientRepository.save(client);
	}
	
    @GetMapping
    public List<ClientDto> findAllClients() {
		return clientService.findAllWithProbableDeath();
    }
 
    @GetMapping("/kpi")
    public KpiDto kpiOfClients() {
       return clientService.getKpiOfClients();
    }

	
	
}
