/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Andreu.DIejAgua;

/**
 *
 * @author aleja
 */
public class Modelo {
    private final static int temp = (int) (Math.random()*100+1);
    
    public int elevar(int cantidad){
        return cantidad+temp;
    }
    public int reducir(int cantidad){
        return cantidad-temp;
    }
  

/*}*/
}