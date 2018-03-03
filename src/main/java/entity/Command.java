package entity;

import enums.CommandType;

public class Command {

    private Integer id;
    private Integer turnId;
    private Integer playerId;
    private CommandType command;
    private String params;

    public Command() {
    }

    public Command(Integer id, Integer turnId, Integer playerId, CommandType command, String params) {
        this.id = id;
        this.turnId = turnId;
        this.playerId = playerId;
        this.command = command;
        this.params = params;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTurnId() {
        return turnId;
    }

    public void setTurnId(Integer turnId) {
        this.turnId = turnId;
    }

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public CommandType getCommand() {
        return command;
    }

    public void setCommand(CommandType command) {
        this.command = command;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }
}
