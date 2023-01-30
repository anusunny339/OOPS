#include<iostream>
using namespace std;
void func(){
    char name[]="Tarkeshwar Barua";
    int age=30;
    cout <<age<<" I am user defined function "<<name;
}
int func1(int age, char name[]){
    cout <<age<<" I am user defined function "<<name;
    return age;
}
int main(){
    func();
   int age= func1(31, "Mr ABC");
   cout<<"\n"<< age;
    return 0;
}
