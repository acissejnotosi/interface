package com.example.jsampaio.aninterface;

import java.util.Vector;

/**
 * Created by jsampaio on 09/11/16.
 */

public class vectorDataMap {

    protected Vector<Double> lat;
    protected Vector<Double> lng;
    protected Vector<Double> alt;
    protected Vector<Float> speed;
    protected Vector<Integer> pulse;


    public vectorDataMap(Vector<Double> lat, Vector<Double> lng, Vector<Double> alt, Vector<Float> speed, Vector<Integer> pulse) {
        this.lat = lat;
        this.lng = lng;
        this.alt = alt;
        this.speed = speed;
        this.pulse = pulse;
    }


    public void setLat(Vector<Double> lat) {
        this.lat = lat;
    }

    public void setLng(Vector<Double> lng) {
        this.lng = lng;
    }

    public void setSpeed(Vector<Float> speed) {
        this.speed = speed;
    }

    public void setPulse(Vector<Integer> pulse) {
        this.pulse = pulse;
    }

    public void setAlt(Vector<Double> alt) {
        this.alt = alt;
    }

    public Vector<Integer> getPulse() {
        return pulse;
    }

    public Vector<Float> getSpeed() {
        return speed;
    }

    public Vector<Double> getLng() {
        return lng;
    }

    public Vector<Double> getLat() {
        return lat;
    }

    public Vector<Double> getAlt() {
        return alt;
    }
}
