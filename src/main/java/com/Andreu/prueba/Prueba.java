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

    public static void main(String[] args) {
        
       args = new String[]{"-c"};
        //Creamos el objetos options
        Options options = new Options();
        //Creamos la fecha actual
        options.addOption("t","time", false, 
                "Fecha actual");
        //Creamos el hola mundo
        options.addOption("w","hello world", false,
                "Hola Mundo");
        //creamos el mundo es bonito
        options.addOption("n","bonito", false,
                "Hola mundo bonito");
        //creamos el mundo es cruel
        options.addOption("c","cruel", false,
                "Hola mundo cruel");
        //creamos la opcion de ayuda
        options.addOption("h","help", false,
                "mensaje de ayuda");
        
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("n", "nice", false,
                "imprime hola mundo bonito"));
        
        group.addOption(new Option("c", "cruel", false,
                "imprime hola mundo cruel"));
        
        options.addOptionGroup(group);
        
      
        CommandLineParser parser = new DefaultParser();
        
        try{
         CommandLine cmd = parser.parse(options, args);  
         
      if(cmd.hasOption("w")) {
          System.out.println("Hola mundo");
    
}     if(cmd.hasOption("n")) {
          System.out.println("El mundo es bonito");
    
}     if(cmd.hasOption("c")) {
          System.out.println("El mundo es cruel");
    
}
            System.out.println("");
            
            
        }catch(ParseException ex){
            
        }

        }
        
        
       
    
    }

