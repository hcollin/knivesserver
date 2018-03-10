package com.frosttroll.knives.entity;

import com.frosttroll.knives.enums.TurnStatus;

public class Turn {

    private Integer id;
    private Integer gameId;
    private Integer counter;
    private TurnStatus status;

    public Turn() {
    }

    public Turn(Integer id, Integer gameId, Integer counter, TurnStatus status) {
        this.id = id;
        this.gameId = gameId;
        this.counter = counter;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public Integer getCounter() {
        return counter;
    }

    public void setCounter(Integer counter) {
        this.counter = counter;
    }

    public TurnStatus getStatus() {
        return status;
    }

    public void setStatus(TurnStatus status) {
        this.status = status;
    }
}
