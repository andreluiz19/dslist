package com.andreluiz19.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andreluiz19.dslist.dto.GameMinDTO;
import com.andreluiz19.dslist.entities.Game;
import com.andreluiz19.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	// Injetando o uma Intância do Repository no Service
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll() {
		
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		
		return dto;
	}
}
