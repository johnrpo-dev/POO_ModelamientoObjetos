package com.modeling.sofka.planets;

public class Planet extends Cosmos {



    public Planet(int id, String name, double mass, double density, double distanceSun) {
        super(id, name, mass, density, distanceSun);

    }

    public Planet() {

    }

    @Override
    public void createPlanet() {
        System.out.println("Se ha creado un " + this.getClass().getSimpleName());
    }
}
