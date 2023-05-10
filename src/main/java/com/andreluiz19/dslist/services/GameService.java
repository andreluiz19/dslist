package com.andreluiz19.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.andreluiz19.dslist.dto.GameDTO;
import com.andreluiz19.dslist.dto.GameMinDTO;
import com.andreluiz19.dslist.entities.Game;
import com.andreluiz19.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	// Injetando o uma Intância do Repository no Service
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		
		Game result = gameRepository.findById(id).get();
		
		GameDTO dto = new GameDTO(result);
		
		return dto;
		
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll() {
		
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		
		return dto;
	}
}
