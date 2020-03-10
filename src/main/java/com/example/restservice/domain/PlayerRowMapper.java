package com.example.restservice.domain;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PlayerRowMapper implements RowMapper<PlayerDTO> {
        public PlayerDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
                PlayerDTO playerDTO = new PlayerDTO();
                playerDTO.id = rs.getInt("id");
                playerDTO.name = rs.getString("name");
                return playerDTO;
        }

}

