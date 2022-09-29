/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.Andreu.prueba;

import java.lang.invoke.MethodHandles;
import org.apache.commons.cli.*;

/**
 *
 * @author aleja
 */
public class Prueba {

    public static void main(String[] args) throws ParseException {
        
        //Creamos el objetos options
        Options options = new Options();
        //Creamos la fecha actual
        options.addOption("t", false, "Fecha actual");
        //Creamos el hola mundo
        options.addOption("w", false,"Hola Mundo");
        //creamos el mundo es bonito
        options.addOption("n", false,"El mundo es bonito");
        //creamos el mundo es cruel
        options.addOption("c", false,"El mundo es cruel");
        //creamos la opcion de ayuda
        options.addOption("h", false, "mensaje de ayuda");
      
        CommandLineParser parser = new DefaultParser();
        
        try{
         CommandLine cmd = parser.parse(options, args);  
         
      if(cmd.hasOption("w")) {
          System.out.println("Hola mundo");
    
}
else {
          System.out.println("");
   
}
      if(cmd.hasOption("n")) {
          System.out.println("El mundo es bonito");
    
}

      if(cmd.hasOption("c")) {
          System.out.println("El mundo es cruel");
    
}

        }catch(ParseException ex){
            
        }

        }
        
        
       
    
    }

