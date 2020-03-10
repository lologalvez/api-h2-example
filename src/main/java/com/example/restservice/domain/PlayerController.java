package com.example.restservice.domain;
import com.example.restservice.infrastructure.IPlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlayerController {

	@Autowired
    IPlayerRepository playerRepository;

	@GetMapping("/players/{id}")
	public PlayerDTO playerById(@PathVariable int id) {
		PlayerDTO player =  playerRepository.findById(id);
		return player;
	}

	@GetMapping("/players")
	public List<PlayerDTO> allPlayers() {
		List<PlayerDTO> allPlayers =  playerRepository.findAll();
		return allPlayers;
	}

	@PostMapping(value = "/players", consumes = "application/json", produces = "application/json")
	public void createPlayer(@RequestBody Player player) {
		playerRepository.save(player);
	}

}
