/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioarchivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ancardenas
 */
public class EjercicioArchivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    File archivo=new File("x/y/Letras.txt");
  File archivo2=new File("x/y/Texto.txt");
     /*System.out.println(archivo.exists());
    System.out.println(archivo.isDirectory());
    if(archivo.isDirectory()){
        String lista[]=archivo.list();
        for(String nombre:lista){
            System.out.println(nombre);
        }*/
    Scanner input;
        try {
              System.out.println(archivo.exists());
              input = new Scanner(archivo);
             PrintStream out=new PrintStream(archivo2);
            
            
          
            int contador=0;
            while(input.hasNext()){
                out.println(input.next());
            contador++;
            }
                System.out.println(contador);


    

        } catch (FileNotFoundException ex) {
            Logger.getLogger(EjercicioArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}