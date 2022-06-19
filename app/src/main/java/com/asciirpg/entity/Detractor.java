package com.asciirpg.entity;

import com.asciirpg.util.Position;

/**
 * Class for detractor properties. Decreases player health if encountered.
 */
public class Detractor extends Entity{

    // Default constructor
    public Detractor() {
        this.icon = '%';
        this.pos = new Position(3, 3);
    }

    // Parametrized constructor
    public Detractor(Position pos) {
        this.icon = '%';
        this.pos = pos;
    }

}