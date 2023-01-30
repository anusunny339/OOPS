#include <iostream>
using namespace std;
class Person
{
public:
    Person()
    { // default constructor
        std::cout << "default constructor invoked" << std::endl;
    }
    ~Person()
    { // destructor
        std::cout << "desconstructor invoked" << std::endl;
    }
    Person(string name, int age, int salary)
    { // parameterized constructor
        std::cout << "parameterized constructor invoked" << std::endl;
        this->name = name;
        this->age = age;
        this->salary = salary;
    }
    string name;
    void printData()
    {
        std::cout << age << " " << name << " " << salary << std::endl;
    }
    void setSalary(int num)
    {
        salary = num;
        this->salary = num;
    }
    void setAge(int num)
    {
        this->age = num;
    }
private:
    int salary = 100;
protected:
    int age = 35;
};
int main()
{
    Person p;
    p.name = "Dr Tarkeshwar Barua";
    // p.age=50;
    p.setAge(150);
}