#include <iostream>  // std::cout
#include <cstdio>   // printf
int main()
{
	int a = 5; // 'a' is L-value
	float b = 0.9f;
	printf("Hello world %d %3.1f \n", a, b);
	std::cout << "Hello world" << a << " " 
		<< b << " " << std::endl; 
	return 0;
}
