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
public class Hexagon implements Shape{
    private final int EDGES = 6;
    
    public Hexagon(){
        
    }
    
    public int getNumberOfEdges() {
        return EDGES;
    }
}
