package com.vinay.labcode.area;

public class Circle implements Area {
    @Override
    public float compute(float x, float y) {
        return pi*x*x;
    }
}
