package entity;

import enums.UnitFlag;
import enums.UnitType;

import java.util.List;

public class Unit {

    private Integer id;
    private Integer controllingPlayerId;
    private Integer hexId;
    private Integer power;
    private Integer health;
    private Integer maxHealth;
    private List<UnitFlag> flags;
    private UnitType type;

}
