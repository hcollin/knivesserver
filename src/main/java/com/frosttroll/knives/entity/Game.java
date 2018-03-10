package com.frosttroll.knives.entity;

import com.frosttroll.knives.enums.GameFlag;
import com.frosttroll.knives.enums.GameStatus;

import java.util.List;

public class Game {

    private Integer id;
    private String name;
    private GameStatus status;
    private List<GameFlag> flags;

    public Game() {
    }

    public Game(Integer id, String name, GameStatus status, List<GameFlag> flags) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.flags = flags;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GameStatus getStatus() {
        return status;
    }

    public void setStatus(GameStatus status) {
        this.status = status;
    }

    public List<GameFlag> getFlags() {
        return flags;
    }

    public void setFlags(List<GameFlag> flags) {
        this.flags = flags;
    }
}

