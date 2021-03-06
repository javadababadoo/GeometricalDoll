/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.geometricaldoll;

import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author PC
 */
public class Canvas extends javax.swing.JPanel {

    private static final Canvas uniqueInstance = new Canvas();

    public static Canvas getInstance() {
        return uniqueInstance;
    }

    /**
     * Creates new form Canvas
     */
    public Canvas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        //these co-ords are relative to the component
    }//GEN-LAST:event_formMouseClicked

    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        GeometryDash.getInstance().setWidthCanvas(this.getWidth());
        GeometryDash.getInstance().setHeightCanvas(this.getHeight());
        GeometryDash.getInstance().buildGeometry();
        GeometryDash.getInstance().getGeometryList().forEach(i -> i.paint(g2));

//        Repository.getInstance().getItems()
//                //.stream()
//                //.filter(AbstractItem::hasChanged)
//                .forEach(i -> i.paint(g2,this));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
