package entity;

public class Map {

    private Integer id;
    private Integer gameId;
    private String name;

    public Map() {
    }

    public Map(Integer id, Integer gameId, String name) {
        this.id = id;
        this.gameId = gameId;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
