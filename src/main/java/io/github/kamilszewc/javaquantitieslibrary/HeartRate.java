package io.github.kamilszewc.javaquantitieslibrary;

public class HeartRate {

    public enum Unit {COUNT_MIN}

    private final float value;
    private final Unit unit;

    public HeartRate(float value) {
        this.value = value;
        this.unit = Unit.COUNT_MIN;
    }
    public HeartRate(float value, Unit unit) {
        if (unit == null) throw new NullPointerException("Unit can not be null");
        this.value = value;
        this.unit = unit;
    }

    public float getValue() {
        return value;
    }

    public float getCountMin() {
        return value;
    }

    public HeartRate add(HeartRate heartRate) {
        return new HeartRate(this.value + heartRate.value, Unit.COUNT_MIN);
    }

    public HeartRate sub(HeartRate heartRate) {
        return new HeartRate(this.value - heartRate.value, Unit.COUNT_MIN);
    }

    public HeartRate mul(HeartRate heartRate) {
        return new HeartRate(this.value * heartRate.value, Unit.COUNT_MIN);
    }

    public HeartRate div(HeartRate heartRate) {
        return new HeartRate(this.value / heartRate.value, Unit.COUNT_MIN);
    }

    @Override
    public String toString() {
        return value + " " + unit;
    }
}
