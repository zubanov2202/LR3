package com.example.lr3;

import com.example.lr3.TaskThree.Point;
import com.example.lr3.TaskThree.Point3d;

import org.junit.Test;

public class TestThree {
    @Test
    public void Test(){
        Point p1 = new Point();
        System.out.println("(Without setters) " + p1);
        p1.setX(5);
        p1.setY(3);
        System.out.println("(With setters) " + p1);


        Point3d p3d = new Point3d();
        System.out.println("(Without setter) "+ p3d);
        p3d.setZ(7);
        System.out.println("(With setter) "+ p3d);

    }
}
