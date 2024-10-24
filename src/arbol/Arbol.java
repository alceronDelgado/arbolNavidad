/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arbol;

/**
 *
 * @author lalej
 */
import javax.swing.*;
public class Arbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String estrella ="";
        String caracter = "";
        int nivelArbol =0;
        nivelArbol = Integer.parseInt(JOptionPane.showInputDialog("Digite cantidad de niveles del arbol"));
        
        //Piso del arbol
        for(int i=0; i < nivelArbol;i++){
            //Caracteres a contcatenar
            for(int j = 0; j < 1; j++){
                caracter=caracter+"*";
            } 
            estrella +="\n"+caracter;
        }
        JOptionPane.showMessageDialog(null, estrella);
    }
    
}
