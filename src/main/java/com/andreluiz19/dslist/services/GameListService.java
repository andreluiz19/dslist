package com.andreluiz19.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.andreluiz19.dslist.dto.GameListDTO;
import com.andreluiz19.dslist.dto.GameMinDTO;
import com.andreluiz19.dslist.entities.GameList;
import com.andreluiz19.dslist.repositories.GameListRepository;

@Service
public class GameListService {
	
	@Autowired
	// Injetando o uma Intância do Repository no Service
	private GameListRepository gameListRepository;
	

	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		
		List<GameList> result = gameListRepository.findAll();
		List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
		
		return dto;
	}
}
