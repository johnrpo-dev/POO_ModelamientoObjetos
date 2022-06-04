package com.modeling.sofka.planets;

abstract public class Cosmos {
    protected int id;
    protected String name;
    protected double mass;
    protected double density;
    protected double distanceSun;

    public Cosmos() {
    }

    protected Cosmos(int id, String name, double mass, double density, double distanceSun) {
        this.name = name;
        this.mass = mass;
        this.density = density;
        this.distanceSun = distanceSun;
    }

    abstract public void createPlanet();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public double getMass() {
        return mass;
    }

    public double setMass(double mass) {
        this.mass = mass;
        return mass;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public double getDistanceSun() {
        return distanceSun;
    }

    public double setDistanceSun(double distanceSun) {
        this.distanceSun = distanceSun;
        return distanceSun;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Planet{");
        sb.append("Id='").append(id).append('\'');
        sb.append("name='").append(name);
        sb.append(", mass=").append(mass);
        sb.append(", density=").append(density);
        sb.append(", distanceSun=").append(distanceSun);
        sb.append('}');
        return sb.toString();
    }
}
