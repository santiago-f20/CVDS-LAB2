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
public class Triangle implements Shape {
    
    private final int EDGES = 3;
    
    public  Triangle (){
    
    }
    
    public int getNumberOfEdges() {
        return EDGES;
    }
}
