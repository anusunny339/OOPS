#include<iostream>
using namespace std;
int main(){
    char *friends[]={"abc", "kbc","xyz"};
    for(int i=0;i<3;i++){
        std::cout<<"Hi Friend "<<friends[i]<<std::endl;
    }
    return 0;
}