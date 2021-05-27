package com.example.lr3.TaskThree;

public class Point3d extends Point {
    private int z;

    public Point3d() {
        z = 12;
    }

    public Point3d(int z) {
        this.z = z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public int getXCoordinates () {
        return this.getX();
    }

    public int getYCoordinates() {
        return this.getY();
    }


    public String toString(){
        return "Point3D coordinates is: " + "[" + this.getX() + ";" + this.getY() + ";" + this.getZ() + "]";
    }
}
