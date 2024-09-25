/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gityjava;

/**
 *
 * @author elmen
 */
public class GitYJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola, aqui voy a clonar mi repositorio de Git");
        
        Numeros_divisibles_entre_el_2_y_el_3 dato = new Numeros_divisibles_entre_el_2_y_el_3();
        
        dato.n_divisibles(100);
        
        System.out.println("Hare otra cosa");
        
        NumerosPrimos p = new NumerosPrimos();
        System.out.println("Los numeros primos del 1 al 10 son:");
        for (int i = 1; i <= 10; i++) {
            if(p.primosOno(i)){
                System.out.print(i + " ");
            }
        }
       
    }
    
    
    public static String buenas_noches(String nombre){
        return "buenas noches " + nombre;
    }
    
}
