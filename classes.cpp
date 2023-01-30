#include<iostream>
using namespace std;
class Person{
    public: 
        string name;
        void printData(){
            std::cout<<age<<" "<<name<<" "<<salary<<std::endl;
        }
        void setSalary(int num){
            salary=num;
            this->salary=num;
        }
        void setAge(int num){
            this->age=num;
        }
    private:
        int salary=100;
    protected:
        int age=35;
        
};
int main(){
    Person p;
    p.name="Dr Tarkeshwar Barua";
    //p.age=50;
    p.setAge(150);
    //p.salary=200;
    p.setSalary(300);
    p.printData();
    return 0;
}
