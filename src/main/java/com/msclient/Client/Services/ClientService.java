package com.msclient.Client.Services;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msclient.Client.Dtos.ClientDto;
import com.msclient.Client.Dtos.KpiDto;
import com.msclient.Client.Models.Client;
import com.msclient.Client.utils.CalculateStandarDeviation;

@Service
public class ClientService {

	@Autowired
	private ClientRepository clientRepository;
	
	static final int LIFE_EXPECTANCY = 76;
	
	public List<ClientDto> findAllWithProbableDeath() {
		List<ClientDto> clientsWithProbableDeath = new ArrayList<>();

		clientRepository.findAll().stream().forEach((client) -> {
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(client.getDateOfBirth());
			int year = calendar.get(Calendar.YEAR) + + LIFE_EXPECTANCY;
			ClientDto cDto = new ClientDto(client.getId(), client.getName(), client.getSurname(), client.getAge() , client.getDateOfBirth(), year);
			clientsWithProbableDeath.add(cDto);
		});
		return clientsWithProbableDeath;
	}
	
	public KpiDto getKpiOfClients() {
		List<Integer> ages = clientRepository.findAll().stream().map(Client::getAge).toList();
		
		double averageOfAges = ages.stream().mapToInt((a) -> a).summaryStatistics().getAverage();
		
		double standardDeviation = CalculateStandarDeviation.calculateStandardDeviation(ages);
		
		KpiDto kpiDto = new KpiDto(averageOfAges , standardDeviation);
		return kpiDto;
		
	}
	
}
