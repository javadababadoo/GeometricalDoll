/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.geometric;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.util.Arrays;

/**
 *
 * @author PC
 */
public class Triangle implements AbstractGeometry{
    
    private Color color;
    
    private int[] x = null;
    
    private int[] y = null;
    
    private int numberPoints = 3;

    public Triangle(Color color, int[] x, int[] y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    
    
    @Override
    public void paint(Graphics2D g) {
        g.setColor(color);
//
//        getX()[0]=100; getX()[1]=150; getX()[2]=50;
//        getY()[0]=100; getY()[1]=150; getY()[2]=150;
        System.out.println("Triangle");
        System.out.println("X: "+Arrays.toString(x));
        System.out.println("Y: "+Arrays.toString(y));
        Polygon p = new Polygon(getX(), getY(), numberPoints); 
        g.fillPolygon(p);
    }

    /**
     * @return the x
     */
    public int[] getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int[] x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int[] getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int[] y) {
        this.y = y;
    }

    /**
     * @return the numberPoints
     */
    public int getNumberPoints() {
        return numberPoints;
    }

    /**
     * @param numberPoints the numberPoints to set
     */
    public void setNumberPoints(int numberPoints) {
        this.numberPoints = numberPoints;
    }
    
}
