/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author sjcet
 */
import java.util.Scanner;

class Person{                        // first class
    
String Name, Gender , Address ;
protected int Age ;

public Person ( ) { 

}

public Person ( String n , String g , String addr , int a )  //constructor1
{
this . Name = n ;
this . Gender = g ;
this . Address =addr ;
this . Age = a ;
}

public void displayPerson ( ) {
System.out.println ( "\nName: "+Name ) ;
System.out.println ( "Gender : " + Gender ) ;
System.out.println ( " Address : " + Address ) ;
System.out.println ( "Age : " + Age ) ;
}

}


class Employee extends Person {                  // class 2
int Empid , Salary ;
String Companyname , Qualification ;

public Employee ( ) { 

}

public Employee ( String n , String g , String addr , int a , int eid , String cname , String qual , int sal)  //constr2

{

super ( n , g , addr , a ) ;    // calling parent class constructor==>person()
Empid = eid ;
Companyname = cname ;
Qualification= qual ;
Salary = sal ;

}

public void displayEmployee ( ) {
super . displayPerson ( ) ;           //parent class func
System.out.println ( "Empid : "+Empid ) ;
System.out.println ( "Company name : " + Companyname ) ;
System.out.println( " Qualification : " + Qualification ) ;
System.out.println ( " Salary : " + Salary ) ;
}

}



class Teacher1 extends Employee{                //class3
String Subject , Department ;
int Teacherid ; 

public Teacher1 ( String n , String g , String addr , int a ,int eid , String cname , String qual , int sal ,String sub , String dept , int tid )
{
super ( n , g , addr , a , eid , cname , qual , sal ) ;         //parent constructor
Subject = sub ;
Department = dept ;
Teacherid = tid ;
}

public void displayTeacher ( ) {
super . displayEmployee ( ) ;         //parent func
System.out.println( "Teacherid : " + Teacherid ) ;
System.out.println( "Subject : " + Subject ) ;
System.out.println( "Department : " + Department ) ;
}

}



public class Inheritance {


    public static void main(String[] args) {
        
        System.out.println( "Enter number of employee " ) ;
        Scanner sc=new Scanner(System.in);

         int n = sc.nextInt ( ) ;
         
        Teacher1[ ] teacher1s = new Teacher1 [n] ;
        
        for ( int i = 0 ; i<n; i ++){
         System.out.println( "Enter the name  " ) ;
         String name = sc.next ( ) ;
         System.out.println ( "Enter gender  " ) ;
         String gen = sc.next ( ) ;
         System.out.println ( "Enter address ") ;
         String addr = sc.next( ) ;
         System.out.println( "Enter age " ) ;
         int ag = sc.nextInt( ) ;
         System.out.println( "Enter Empid  ") ;
         int eid = sc. nextInt( ) ;
         System.out.println ( " Enter Company name " ) ;
         String cn = sc.next ( ) ;
         System.out.println ( "Enter qualification of the teacher " ) ;
         String quali = sc . next ( ) ;
         System.out.println ( "Enter salary of the teacher " ) ;
         int sal = sc.nextInt( ) ;
         
         System.out.println( " Enter Teacher id " ) ;
         int tid = sc.nextInt( ) ;
         System.out.println ( " Enter Subject of the teacher " ) ;
         String sub = sc.next ( ) ;
         System.out.println ( " Enter Department of the teacher " ) ;
         String dept = sc.next( ) ;
         
         Teacher1 t = new Teacher1 ( name , gen , addr , ag , eid , cn , quali , sal , sub , dept , tid ) ;

         teacher1s[ i ]=t ;

                 
           
        }
        
        
        for(Teacher1 t : teacher1s ) 
        {

           t . displayTeacher( ) ;
           
          }
        
        
        
    
    
}
}
