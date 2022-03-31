/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stud_scan;

/**
 *
 * @author sjcet
 */
import java.util.Scanner;
public class Stud_scan {
    int m1,m2,m3,total;
    
    Stud_scan(int a,int b,int c){
        m1=a;
        m2=b;
        m3=c;
        
        
    }
    
    public void display(){
        total=m1+m2+m3;
        System.out.println("m1:"+m1);
        System.out.println("m2:"+m2);
        System.out.println("m3:"+m3);
        System.out.println("Total marks:"+total);
        
        
    }

    
    public static void main(String[] args) {
        int m1,m2,m3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three marks");
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();
        
        Stud_scan s1=new Stud_scan(m1,m2,m3);
        s1.display();
    }
    
}
