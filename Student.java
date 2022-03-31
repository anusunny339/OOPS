/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author sjcet
 */
public class Student {
    int m1,m2,m3;
    public void calculate(){
        float sum;
        float percentage;
        m1=50;
        m2=90;
        m3=100;
        sum=m1+m2+m3;
        percentage=((sum / 300) * 100);
        System.out.println("sum :"+sum);
        System.out.println("Percentage:"+percentage);
    }

    public static void main(String[] args) {
        Student s1=new Student();
        s1.calculate();
    }
    
}
