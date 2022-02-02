/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.eci.cvds.patterns.shapes;

import edu.eci.cvds.patterns.concrete.*;


/**
 *
 * @author edwar.lozano
 */
public class ShapeFactory {
    public static Shape create(RegularShapeType figureType){
        Shape figure;
        switch (figureType) {
            case Triangle:
                figure = new Triangle();
                break;
            case Quadrilateral:
                figure = new Quadrilateral();
                break;
            case Pentagon:
                figure = new Pentagon();
                break;
            case Hexagon:
                figure =  new Hexagon();
                break;
            default:
                figure = null;
        }
        return figure;
    }
}
