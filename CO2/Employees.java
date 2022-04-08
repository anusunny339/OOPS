/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employees;

/**
 *
 * @author sjcet
 */
import java.util.Scanner;
public class Employees {
    Scanner sc=new Scanner(System.in);
    int eno,esalary,n;
    String ename;

    
    public void read(){
        System.out.println("\n Enter employee details id,name and salary");
        eno=sc.nextInt();
        ename=sc.next();
        esalary=sc.nextInt();
    }
    
    public void display(){
        System.out.println("eno :"+eno);
        System.out.println("name: "+ename);
        System.out.println("Salary: "+esalary);
        
    }
    
    public static void main(String[] args) {
        
        int n,ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of employess");
        n=sc.nextInt();
        
       Employees arr[]=new Employees[n];
       for(int i=0;i<n;i++){
           arr[i]=new Employees();
           arr[i].read();
           
       }
       
      
       for(int i=0;i<n;i++){
            System.out.println("\nEmployee"+(i+1));
           arr[i].display();
           
       }
       
       System.out.println("\n enter employee id to search");
       ch=sc.nextInt();
       
       for(int i=0;i<n;i++){
           if(ch==arr[i].eno){
               
              arr[i].display();
              break;
           }
           else{
               System.out.println("employee not found");
               break;
               
           }
       }
       
       
       
       
       
       
    }
    
}
