package tpuno;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class EjDos {

    public static void main(String[] args) {
        System.out.println("Modo Consola");
        System.out.println("Ingresa tu nombre");
        String msj;
        Scanner sc = new Scanner(System.in);
        msj = sc.nextLine();
        System.out.println("Bienvenida, " + msj);
        JOptionPane.showMessageDialog(null, "Modo JOptionPane");
        String nombre = JOptionPane.showInputDialog("Ingresa tu nombre");
        JOptionPane.showMessageDialog(null, "Bienvenida, "+ nombre)    ;
        
    }

}
