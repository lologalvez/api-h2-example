package com.example.restservice.infrastructure;
import com.example.restservice.domain.Player;
import com.example.restservice.domain.PlayerDTO;
import com.example.restservice.domain.PlayerRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PlayerRepository implements IPlayerRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void save(Player player) {
        PlayerDTO playerDTO = player.createDTO();
        jdbcTemplate.update("INSERT INTO players (id, name) VALUES (?, ?)", playerDTO.id, playerDTO.name);
    }

    @Override
    public List<PlayerDTO> findAll() {
        List<PlayerDTO> allPlayers = new ArrayList<>();
        allPlayers = jdbcTemplate.query("SELECT * FROM players", new PlayerRowMapper());
        return allPlayers;
    }

    @Override
    public PlayerDTO findById(int id) {
        PlayerDTO result = jdbcTemplate.queryForObject("SELECT * FROM players WHERE id=?", new Object[]{id}, new PlayerRowMapper());
        // TODO: if null
        return result;
    }
}
