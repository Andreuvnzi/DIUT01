/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Andreu.DIejAgua;
import org.apache.commons.cli.*;

/**
 *
 * @author aleja
 */
public class Vista {
    private Controlador controlador;
    
    Vista(Controlador controlador){
        this.controlador = controlador;
    }
    public void hervir(String[] args){
        Options options = new Options();
        Option oTemp = Option.builder("t").build();
    }
}
