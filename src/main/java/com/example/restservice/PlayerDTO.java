package com.example.restservice;

public class PlayerDTO {
    public int id;
    public String name;

    @Override
    public String toString() {
        return "PlayerDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

