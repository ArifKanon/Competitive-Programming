#include<bits/stdc++.h>
using namespace std;

int factorial(int n)
{
    int r = n;
    if(n==0)
        return 1;

    for(int i=1; i<n; i++)
        r *= (n-i);
    return r;
}

int main()
{
    int num,res;
    cin>>num;
    if(num<0)
        cout<<"Factorial of a negative number does not exist."<<"\n";
    else
        cout<<"Result: "<<factorial(num)<<"\n";
    return 0;
}
