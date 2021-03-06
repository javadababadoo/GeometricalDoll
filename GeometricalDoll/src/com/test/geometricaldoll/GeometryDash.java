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
        Rectangle rectangleBackground = new Rectangle(Color.BLACK, 0, 0, widthCanvas, heightCanvas);
        getGeometryList().add(rectangleBackground);
        
        //Head
        Circle head = new Circle(Color.GREEN, (widthCanvas/8)*4, (heightCanvas/8), (heightCanvas/8)*2, (heightCanvas/8)*2);
        getGeometryList().add(head);
        
        int[] x = new int[3];
        int[] y = new int[3];
        int n = 3;
        x[0]=(int)(widthCanvas*0.25);
        x[1]=(int)(widthCanvas*0.5);
        x[2]=(int)(widthCanvas*0.75);
        
        y[0]= (int)(heightCanvas*0.7);
        y[1]= (int)(heightCanvas*0.25);
        y[2]= (int)(heightCanvas*0.7);
        
        //Arms
        Rectangle arms = new Rectangle(Color.RED, (int)(widthCanvas * 0.25), (int) ((heightCanvas * 0.25)+ ((heightCanvas*0.45)*0.25)), (int)(widthCanvas*0.5), (int)(heightCanvas*0.12));
        getGeometryList().add(arms);
        
        //Body
        Triangle body = new Triangle(Color.yellow, x, y);
        getGeometryList().add(body);
        
        //Legs
        Rectangle leg1 = new Rectangle(Color.ORANGE, (int)(widthCanvas * 0.316), (int) (heightCanvas * 0.7), (int)(widthCanvas*0.12), (int)(heightCanvas*0.3));
        getGeometryList().add(leg1);
        
        Rectangle leg2 = new Rectangle(Color.ORANGE, (int)(widthCanvas * 0.559), (int) (heightCanvas * 0.7), (int)(widthCanvas*0.12), (int)(heightCanvas*0.3));
        getGeometryList().add(leg2);
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
