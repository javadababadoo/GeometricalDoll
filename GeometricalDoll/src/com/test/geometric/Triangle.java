/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.geometric;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

/**
 *
 * @author PC
 */
public class Triangle implements AbstractGeometry{
    
    private Color color;

    @Override
    public void paint(Graphics2D g) {
        g.setColor(Color.BLUE);
        
        int[] x = new int[3];
        int[] y = new int[3];
        int n = 3;
        x[0]=100; x[1]=150; x[2]=50;
        y[0]=100; y[1]=150; y[2]=150;

        Polygon p = new Polygon(x, y, n); 
        g.fillPolygon(p);
    }
    
}
