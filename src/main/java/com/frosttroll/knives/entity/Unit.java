package com.frosttroll.knives.entity;

import com.frosttroll.knives.enums.UnitFlag;
import com.frosttroll.knives.enums.UnitType;

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
