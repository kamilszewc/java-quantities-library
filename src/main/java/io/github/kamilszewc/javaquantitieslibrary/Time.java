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

    public Time add(Time timeA, Time timeB) {
        switch (timeA.unit) {
            case S: return new Time(timeA.value + timeB.getS(), Unit.S);
            case MIN: return new Time(timeA.value + timeB.getMin(), Unit.MIN);
            case H: return new Time(timeA.value + timeB.getH(), Unit.H);
            default: return null;
        }
    }

    public Time sub(Time timeA, Time timeB) {
        switch (timeA.unit) {
            case S: return new Time(timeA.value - timeB.getS(), Unit.S);
            case MIN: return new Time(timeA.value - timeB.getMin(), Unit.MIN);
            case H: return new Time(timeA.value - timeB.getH(), Unit.H);
            default: return null;
        }
    }

    public Time mul(Time timeA, Time timeB) {
        switch (timeA.unit) {
            case S: return new Time(timeA.value * timeB.getS(), Unit.S);
            case MIN: return new Time(timeA.value * timeB.getMin(), Unit.MIN);
            case H: return new Time(timeA.value * timeB.getH(), Unit.H);
            default: return null;
        }
    }

    public Time div(Time timeA, Time timeB) {
        switch (timeA.unit) {
            case S: return new Time(timeA.value / timeB.getS(), Unit.S);
            case MIN: return new Time(timeA.value / timeB.getMin(), Unit.MIN);
            case H: return new Time(timeA.value / timeB.getH(), Unit.H);
            default: return null;
        }
    }

    @Override
    public String toString() {
        return value + " " + unit;
    }
}
