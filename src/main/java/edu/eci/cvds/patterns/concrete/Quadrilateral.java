/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.eci.cvds.patterns.concrete;

import edu.eci.cvds.patterns.shapes.Shape;

/**
 *
 * @author edwar.lozano
 */
public class Quadrilateral implements Shape{
    private final int EDGES = 4;
    
    public Quadrilateral(){
        
    }
    
    public int getNumberOfEdges() {
        return EDGES;
    }
}
