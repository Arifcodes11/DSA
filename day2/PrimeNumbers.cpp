#include<iostream>
using namespace std;

int main() {

   /* int n;
    cin >> n;

    int i = 2;

    while(i<n) {
        
        if(n%i==0) {
            cout<< " Not prime for "<< i << endl;
        }
        else{
            cout<<" Prime for "<< i <<endl;
        }
        i = i + 1;
    }

}*/
   int n;
   cin>>n;

   if(n<2)
   {
    cout<<"Not a prime Number "<<n<<endl;
    return 0;
   }
   int i=2;
   bool isPrime=true;
   while(i<n)
   {
    if(n%i==0)
    {
        isPrime=false;
        break;
    }
    i++;
   }
   if(isPrime)
   {
    cout<<n<<" is a Prime Number "<<endl;
   }
   else{
    cout<<n<<" is Not a prime Number "<<endl;
   }
   return 0;

}