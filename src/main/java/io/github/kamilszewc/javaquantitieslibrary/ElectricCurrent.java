package io.github.kamilszewc.javaquantitieslibrary;

public class ElectricCurrent {

    public enum Unit {A}

    private final float value;
    private final Unit unit;

    public ElectricCurrent(float value) {
        this.value = value;
        this.unit = Unit.A;
    }

    public ElectricCurrent(float value, Unit unit) {
        if (unit == null) throw new NullPointerException("Unit can not be null");
        this.value = value;
        this.unit = unit;
    }

    public float getValue() {
        return value;
    }

    public float getA() {
        return value;
    }

    public ElectricCurrent add(ElectricCurrent electricCurrent) {
        return new ElectricCurrent(this.value + electricCurrent.value, Unit.A);
    }

    public ElectricCurrent sub(ElectricCurrent electricCurrent) {
        return new ElectricCurrent(this.value - electricCurrent.value, Unit.A);
    }

    public ElectricCurrent mul(ElectricCurrent electricCurrent) {
        return new ElectricCurrent(this.value * electricCurrent.value, Unit.A);
    }

    public ElectricCurrent div(ElectricCurrent electricCurrent) {
        return new ElectricCurrent(this.value / electricCurrent.value, Unit.A);
    }

    @Override
    public String toString() {
        return value + " " + unit;
    }
}
