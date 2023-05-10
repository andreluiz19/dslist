package com.andreluiz19.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andreluiz19.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
	
}
