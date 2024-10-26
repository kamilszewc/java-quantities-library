package io.github.kamilszewc.javaquantitieslibrary;

public class LuminousIntensity {

    public enum Unit {CD}

    private final float value;
    private final Unit unit;

    public LuminousIntensity(float value) {
        this.value = value;
        this.unit = Unit.CD;
    }

    public LuminousIntensity(float value, Unit unit) {
        if (unit == null) throw new NullPointerException("Unit can not be null");
        this.value = value;
        this.unit = unit;
    }

    public float getValue() {
        return value;
    }

    public float getCd() {
        return value;
    }

    public LuminousIntensity add(LuminousIntensity luminousIntensity) {
        return new LuminousIntensity(this.value + luminousIntensity.value, Unit.CD);
    }

    public LuminousIntensity sub(LuminousIntensity luminousIntensity) {
        return new LuminousIntensity(this.value - luminousIntensity.value, Unit.CD);
    }

    public LuminousIntensity mul(LuminousIntensity luminousIntensity) {
        return new LuminousIntensity(this.value * luminousIntensity.value, Unit.CD);
    }

    public LuminousIntensity div(LuminousIntensity luminousIntensity) {
        return new LuminousIntensity(this.value / luminousIntensity.value, Unit.CD);
    }

    @Override
    public String toString() {
        return value + " " + unit;
    }
}
