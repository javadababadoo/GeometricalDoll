/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.geometricaldoll;

import com.test.geometric.AbstractGeometry;
import com.test.geometric.Circle;
import com.test.geometric.Rectangle;
import com.test.geometric.Triangle;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class GeometryDash {

    private static final GeometryDash uniqueInstance = new GeometryDash();
    
    private List<AbstractGeometry> geometryList = new ArrayList<>();
    
    private int widthCanvas = 0;
    
    private int heightCanvas = 0;
    
    public static GeometryDash getInstance(){
        return uniqueInstance;
    }
    
    private GeometryDash() {
    }
    
    public void buildGeometry(){
        //Background
        System.out.println("Width: "+ widthCanvas + " --- Height: "+ heightCanvas);
        Rectangle rectangle = new Rectangle(Color.BLACK, 0, 0, widthCanvas, heightCanvas);
        getGeometryList().add(rectangle);
        
        
        //Triangle
        Triangle triangle = new Triangle();
        getGeometryList().add(triangle);
        
        //Circle circle = new Circle(Color.yellow, x, y, widthCanvas, height);
    }

    /**
     * @return the geometryList
     */
    public List<AbstractGeometry> getGeometryList() {
        return geometryList;
    }

    /**
     * @param geometryList the geometryList to set
     */
    public void setGeometryList(List<AbstractGeometry> geometryList) {
        this.geometryList = geometryList;
    }

    /**
     * @return the widthCanvas
     */
    public int getWidthCanvas() {
        return widthCanvas;
    }

    /**
     * @param widthCanvas the widthCanvas to set
     */
    public void setWidthCanvas(int widthCanvas) {
        this.widthCanvas = widthCanvas;
    }

    /**
     * @return the heightCanvas
     */
    public int getHeightCanvas() {
        return heightCanvas;
    }

    /**
     * @param heightCanvas the heightCanvas to set
     */
    public void setHeightCanvas(int heightCanvas) {
        this.heightCanvas = heightCanvas;
    }
    
}
