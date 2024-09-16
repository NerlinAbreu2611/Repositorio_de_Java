/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gityjava;

/**
 *
 * @author elmen
 */
public class Numeros_divisibles_entre_el_2_y_el_3 {
    
    
    public void n_divisibles(int rango){
        System.out.println("Son divisibles los numeros: ");
        for (int i = 1; i <= rango; i++) {
            
            if(i % 2 == 0 || i % 3 == 0){
                System.out.print("[" + i +"] " );
            }
            
        }
        
        
    }
    
}
