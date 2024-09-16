/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gityjava;

/**
 *
 * @author elmen
 */
public class NumerosPrimos {
 
  public boolean primosOno(int num){
      int cont = 0;
      for (int i = 1; i <= num / 2; i++) {
          if( num % i == 0){
              cont++;
          }
      }
      
      if(cont == 1 && num != 1 && num != 0){
          return true;
      }
      
      return false;
      
  }    
}
