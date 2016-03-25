package fr.unice.bf.isola3000.entities;

/**
 * Created by patch on 22/03/2016.
 */
public enum AreaEnum {

    SNOW_PARK("Snow park"),
    BEGINNER("Beginner"),
    PRO("Pro");

    private String name;

    public String getName() { return name; }

    AreaEnum(String name) { this.name = name; }
}
