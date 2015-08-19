#include<stdio.h> 
#include<stdlib.h>

int a, b, c;
main()
{
	 printf("Programa de triangulos\n");
     printf("Ingrese el dato a: "); 
     scanf("%d",&a); 
     printf("Ingrese el dato b: "); 
     scanf("%d",&b); 
     printf("Ingrese el dato c: "); 
     scanf("%d",&c); 
     if(a==b&&a==c) 
     { 
          printf("El triangulo es equilatero"); 
     } 
     else if(a==b||a==c||b==c) 
     { 
          printf("El triangulo es isosceles"); 
     } 
     else if(a!=b&&a!=b&&b!=c) 
     { 
          printf("El triangulo es escaleno"); 
     }
     printf("\n");
     system("pause");
     return 0;
} 
