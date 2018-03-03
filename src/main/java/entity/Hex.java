package entity;

import enums.HexFlag;
import enums.TerrainType;

import java.util.List;

public class Hex {

    private Integer id;
    private Integer mapId;
    private Integer x;
    private Integer y;
    private TerrainType terrain;
    private Integer controllingPlayerId;
    private List<HexFlag> flags;

    public Hex() {
    }

    public Hex(Integer id, Integer mapId, Integer x, Integer y, TerrainType terrain, Integer controllingPlayerId, List<HexFlag> flags) {
        this.id = id;
        this.mapId = mapId;
        this.x = x;
        this.y = y;
        this.terrain = terrain;
        this.controllingPlayerId = controllingPlayerId;
        this.flags = flags;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMapId() {
        return mapId;
    }

    public void setMapId(Integer mapId) {
        this.mapId = mapId;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public TerrainType getTerrain() {
        return terrain;
    }

    public void setTerrain(TerrainType terrain) {
        this.terrain = terrain;
    }

    public Integer getControllingPlayerId() {
        return controllingPlayerId;
    }

    public void setControllingPlayerId(Integer controllingPlayerId) {
        this.controllingPlayerId = controllingPlayerId;
    }

    public List<HexFlag> getFlags() {
        return flags;
    }

    public void setFlags(List<HexFlag> flags) {
        this.flags = flags;
    }
}
