// Online C++ compiler to run C++ program online
#include <iostream>
//#include<conio.h>
int  main() {
   int A[20],N,Temp,i,j;
 //  clrscr();
   cout<<"Enter the number of elements:";
   cin>>N;
   cout<<"\n Enter the elements of th array";
   for(i=0;i<N;i++)
   {
       cin>>A[i];
   }
       for(i=1;i<N;i++)
       {
           Temp = A[i];
           j = i-1;
           while(Temp<A[j]&&j>=0)
           {
               A[j+1] = A[j];
               j = j-1;
           }
           A[j+1] = Temp[j]
       }
       cout<<"\n The sorted list is: \n";
       for(i=0;i<N;i++){
           cout<<A[i]<<"";
       }
   }

    
