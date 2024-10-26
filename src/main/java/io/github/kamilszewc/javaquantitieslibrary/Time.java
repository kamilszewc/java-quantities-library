package io.github.kamilszewc.javaquantitieslibrary;

public class Time {

    public enum Unit {S, MIN, H};

    final private float value;
    final private Unit unit;

    public Time(float value) {
        this.value = value;
        this.unit = Unit.S;
    }

    public Time(float value, Unit unit) {
        if (unit == null) throw new NullPointerException("Unit can not be null");
        this.value = value;
        this.unit = unit;
    }

    public float getS() {
        if (unit == Unit.MIN) return value * 60;
        else if (unit == Unit.H) return value * 3600;
        else return value;
    }

    public float getMin() {
        if (unit == Unit.S) return value / 60;
        else if (unit == Unit.H) return value * 60;
        else return value;
    }

    public float getH() {
        if (unit == Unit.S) return value / 3600;
        else if (unit == Unit.MIN) return value / 60;
        else return value;
    }

    public Time add(Time time) {
        switch (this.unit) {
            case S: return new Time(this.value + time.getS(), Unit.S);
            case MIN: return new Time(this.value + time.getMin(), Unit.MIN);
            case H: return new Time(this.value + time.getH(), Unit.H);
            default: return null;
        }
    }

    public Time sub(Time time) {
        switch (this.unit) {
            case S: return new Time(this.value - time.getS(), Unit.S);
            case MIN: return new Time(this.value - time.getMin(), Unit.MIN);
            case H: return new Time(this.value - time.getH(), Unit.H);
            default: return null;
        }
    }

    public Time mul(Time time) {
        switch (this.unit) {
            case S: return new Time(this.value * time.getS(), Unit.S);
            case MIN: return new Time(this.value * time.getMin(), Unit.MIN);
            case H: return new Time(this.value * time.getH(), Unit.H);
            default: return null;
        }
    }

    public Time div(Time time) {
        switch (this.unit) {
            case S: return new Time(this.value / time.getS(), Unit.S);
            case MIN: return new Time(this.value / time.getMin(), Unit.MIN);
            case H: return new Time(this.value / time.getH(), Unit.H);
            default: return null;
        }
    }

    @Override
    public String toString() {
        return value + " " + unit;
    }
}
