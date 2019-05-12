package com.vinay.labcode.area;

public class Rectangle implements Area{
    @Override
    public float compute(float x, float y) {
        return x*y;
    }
}
