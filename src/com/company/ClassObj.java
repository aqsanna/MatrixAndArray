package com.company;

import java.util.Objects;

public class ClassObj {
    int x, y;

    @Override
    public String toString() {
        return "ClassObj{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassObj classObj = (ClassObj) o;
        return x == classObj.x &&
                y == classObj.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public static void main(String[] args) {

    }
}
