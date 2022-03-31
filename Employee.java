/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author sjcet
 */
public class Employee {
    int id,salary,tot_salary;
    String ename;
    
    Employee(int a,int b,String c){
        id=a;
        salary=b;
        ename=c;
        
    }
    public void total(){
        tot_salary=salary+( (salary * 20) / 100);
    }
    public void display(){
        total();
        System.out.println("id: "+id);
        System.out.println("name: "+ename);
        System.out.println("salary: "+tot_salary);
        
        
    }

    
    public static void main(String[] args) {
        Employee e1=new Employee(101,10000,"Anu");
        e1.display();
    }
    
}
