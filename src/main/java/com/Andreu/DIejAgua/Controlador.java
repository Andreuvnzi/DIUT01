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
public class Controlador {
    private Modelo modelo;
    private Vista vista;
    
    public Controlador(){
        modelo = new Modelo();
        vista = new Vista(this);
    }
    public static void main(String[] args){
      args = new String[]{"-e","80000"};
      Controlador ctrl = new Controlador();
      ctrl.iniciarVista(args);
    }
    private void iniciarVista(String[] args){
        vista.hervir(args);
    }
  
