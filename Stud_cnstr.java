/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stud_cnstr;

/**
 *
 * @author sjcet
 */
public class Stud_cnstr {
    int m1,m2,m3;
    float sum,percentage;
    
     Stud_cnstr(){
         m1=50;
         m2=50;
         m3=50;
     }
     
     public void calculate(){
         sum=m1+m2+m3;
         System.out.println("sum :"+sum);
     }
     
     public void percentage(){
          percentage=((sum / 300) * 100);

         System.out.println("percentage:"+percentage);
     }
    
    public static void main(String[] args) {
       Stud_cnstr s1=new Stud_cnstr();
       s1.calculate();
       s1.percentage();
      
       
    }
    
}
