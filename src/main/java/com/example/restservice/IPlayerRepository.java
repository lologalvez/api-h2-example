package com.example.restservice;

import java.util.List;

public interface IPlayerRepository {
    void save(Player player);

    List<PlayerDTO> findAll();

    PlayerDTO findById(int id);
}
