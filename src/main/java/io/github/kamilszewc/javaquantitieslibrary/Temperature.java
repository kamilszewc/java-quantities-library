package io.github.kamilszewc.javaquantitieslibrary;

public class Temperature {

    public enum Unit {K}

    private final float value;
    private final Unit unit;

    public Temperature(float value) {
        this.value = value;
        this.unit = Unit.K;
    }

    public Temperature(float value, Unit unit) {
        if (unit == null) throw new NullPointerException("Unit can not be null");
        this.value = value;
        this.unit = unit;
    }

    public float getValue() {
        return value;
    }

    public float getK() {
        return value;
    }

    public Temperature add(Temperature temperatureA, Temperature temperatureB) {
        return new Temperature(temperatureA.value + temperatureB.value, Unit.K);
    }

    public Temperature sub(Temperature temperatureA, Temperature temperatureB) {
        return new Temperature(temperatureA.value - temperatureB.value, Unit.K);
    }

    public Temperature mul(Temperature temperatureA, Temperature temperatureB) {
        return new Temperature(temperatureA.value * temperatureB.value, Unit.K);
    }

    public Temperature div(Temperature temperatureA, Temperature temperatureB) {
        return new Temperature(temperatureA.value / temperatureB.value, Unit.K);
    }


    @Override
    public String toString() {
        return value + " " + unit;
    }
}
