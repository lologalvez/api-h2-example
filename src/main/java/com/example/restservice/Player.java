package com.example.restservice;

public class Player {

    private int id;
    private String name;

    public Player(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public PlayerDTO createDTO() {
        PlayerDTO playerDTO = new PlayerDTO();
        playerDTO.id = this.id;
        playerDTO.name = this.name;
        return playerDTO;
    }
}