package io.github.kamilszewc.javaquantitieslibrary;

public class Energy {

    public enum Unit {KCAL}

    private final float value;
    private final Unit unit;

    public Energy(float value) {
        this.value = value;
        this.unit = Unit.KCAL;
    }

    public Energy(float value, Unit unit) {
        if (unit == null) throw new NullPointerException("Unit can not be null");
        this.value = value;
        this.unit = unit;
    }

    public float getValue() {
        return value;
    }

    public float getKcal() {
        return value;
    }

    public Energy add(Energy energyA, Energy energyB) {
        return new Energy(energyA.value + energyB.value, Unit.KCAL);
    }

    public Energy sub(Energy energyA, Energy energyB) {
        return new Energy(energyA.value - energyB.value, Unit.KCAL);
    }

    public Energy mul(Energy energyA, Energy energyB) {
        return new Energy(energyA.value * energyB.value, Unit.KCAL);
    }

    public Energy div(Energy energyA, Energy energyB) {
        return new Energy(energyA.value / energyB.value, Unit.KCAL);
    }

    @Override
    public String toString() {
        return value + " " + unit;
    }
}
