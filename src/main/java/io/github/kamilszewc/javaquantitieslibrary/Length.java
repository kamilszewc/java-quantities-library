package io.github.kamilszewc.javaquantitieslibrary;

public class Length {

    public enum Unit {KM, M, CM}

    private final float value;
    private final Unit unit;

    public Length(float value) {
        this.value = value;
        this.unit = Unit.M;
    }

    public Length(float value, Unit unit) {
        if (unit == null) throw new NullPointerException("Unit can not be null");
        this.value = value;
        this.unit = unit;
    }

    public float getValue() {
        return value;
    }

    public float getKm() {
        if (unit == Unit.M) return value / 1000;
        else if (unit == Unit.CM) return value / 1000000;
        else return value;
    }

    public float getM() {
        if (unit == Unit.CM) return value / 1000;
        else if (unit == Unit.KM) return value * 1000;
        else return value;
    }

    public float getCm() {
        if (unit == Unit.M) return value * 1000;
        else if (unit == Unit.KM) return value * 1000000;
        else return value;
    }

    public Length add(Length lengthA, Length lengthB) {
        switch (lengthA.unit) {
            case M: return new Length(lengthA.value + lengthB.getM(), Unit.M);
            case CM: return new Length(lengthA.value + lengthB.getCm(), Unit.CM);
            case KM: return new Length(lengthA.value + lengthB.getKm(), Unit.KM);
            default: return null;
        }
    }

    public Length sub(Length lengthA, Length lengthB) {
        switch (lengthA.unit) {
            case M: return new Length(lengthA.value - lengthB.getM(), Unit.M);
            case CM: return new Length(lengthA.value - lengthB.getCm(), Unit.CM);
            case KM: return new Length(lengthA.value - lengthB.getKm(), Unit.KM);
            default: return null;
        }
    }

    public Length mul(Length lengthA, Length lengthB) {
        switch (lengthA.unit) {
            case M: return new Length(lengthA.value * lengthB.getM(), Unit.M);
            case CM: return new Length(lengthA.value * lengthB.getCm(), Unit.CM);
            case KM: return new Length(lengthA.value * lengthB.getKm(), Unit.KM);
            default: return null;
        }
    }

    public Length div(Length lengthA, Length lengthB) {
        switch (lengthA.unit) {
            case M: return new Length(lengthA.value / lengthB.getM(), Unit.M);
            case CM: return new Length(lengthA.value / lengthB.getCm(), Unit.CM);
            case KM: return new Length(lengthA.value / lengthB.getKm(), Unit.KM);
            default: return null;
        }
    }

    @Override
    public String toString() {
        return value + " " + unit;
    }
}
