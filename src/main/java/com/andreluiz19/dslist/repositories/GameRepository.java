package com.andreluiz19.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andreluiz19.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	
}
