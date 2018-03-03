package entity;

public class City {

    private Integer id;
    private String name;
    private Integer hexId;
    private Integer controllingPlayerId;
    private Integer size;

    public City() {
    }

    public City(Integer id, String name, Integer hexId, Integer controllingPlayerId, Integer size) {
        this.id = id;
        this.name = name;
        this.hexId = hexId;
        this.controllingPlayerId = controllingPlayerId;
        this.size = size;
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

    public Integer getHexId() {
        return hexId;
    }

    public void setHexId(Integer hexId) {
        this.hexId = hexId;
    }

    public Integer getControllingPlayerId() {
        return controllingPlayerId;
    }

    public void setControllingPlayerId(Integer controllingPlayerId) {
        this.controllingPlayerId = controllingPlayerId;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
