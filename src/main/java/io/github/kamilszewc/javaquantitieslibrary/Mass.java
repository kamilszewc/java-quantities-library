package io.github.kamilszewc.javaquantitieslibrary;

public class Mass {

    public enum Unit {G, KG, LBS}

    private final float value;
    private final Unit unit;

    public Mass(float value) {
        this.value = value;
        this.unit = Unit.KG;
    }

    public Mass(float value, Unit unit) {
        if (unit == null) throw new NullPointerException("Unit can not be null");
        this.value = value;
        this.unit = unit;
    }

    public float getValue() {
        return value;
    }

    public float getG() {
        if (unit == Unit.KG) return value * 1000;
        else if (unit == Unit.LBS) return value * 1000 / 0.45359237f;
        else return value;
    }

    public float getKg() {
        if (unit == Unit.G) return value / 1000;
        if (unit == Unit.KG) return value;
        else return value / 0.45359237f;
    }

    public float getLbs() {
        if (unit == Unit.KG) return value * 2.20462262f;
        else if (unit == Unit.G) return value * 2.20462262f / 1000;
        else return value;
    }

    public Mass add(Mass mass) {
        switch (this.unit) {
            case KG: return new Mass(this.value + mass.getKg(), Unit.KG);
            case G: return new Mass(this.value + mass.getG(), Unit.G);
            case LBS: return new Mass(this.value + mass.getLbs(), Unit.LBS);
            default: return null;
        }
    }

    public Mass sub(Mass mass) {
        switch (this.unit) {
            case KG: return new Mass(this.value - mass.getKg(), Unit.KG);
            case G: return new Mass(this.value - mass.getG(), Unit.G);
            case LBS: return new Mass(this.value - mass.getLbs(), Unit.LBS);
            default: return null;
        }
    }

    public Mass mul(Mass mass) {
        switch (this.unit) {
            case KG: return new Mass(this.value * mass.getKg(), Unit.KG);
            case G: return new Mass(this.value * mass.getG(), Unit.G);
            case LBS: return new Mass(this.value * mass.getLbs(), Unit.LBS);
            default: return null;
        }
    }

    public Mass div(Mass mass) {
        switch (this.unit) {
            case KG: return new Mass(this.value / mass.getKg(), Unit.KG);
            case G: return new Mass(this.value / mass.getG(), Unit.G);
            case LBS: return new Mass(this.value / mass.getLbs(), Unit.LBS);
            default: return null;
        }
    }

    @Override
    public String toString() {
        return value + " " + unit;
    }
}
