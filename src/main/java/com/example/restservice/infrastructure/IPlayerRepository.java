package com.example.restservice.infrastructure;

import com.example.restservice.domain.Player;
import com.example.restservice.domain.PlayerDTO;

import java.util.List;

public interface IPlayerRepository {
    void save(Player player);

    List<PlayerDTO> findAll();

    PlayerDTO findById(int id);
}
