#include<bits/stdc++.h>
using namespace std;

bool checkPrime(int n)
{
    if(n<2)
        return 0;
    if(n==2)
        return 1;
    if(n%2 == 0)
        return 0;
    for(int i=3; i*i<=n; i+=2)
    {
        if(n%i == 0)
            return 0;
    }
    return 1;
}

int main()
{
    int num;
    while(scanf("%d",&num) != EOF)
    {
        if(checkPrime(num))
            cout<<"The number is Prime"<<"\n";
        else
            cout<<"The number is not Prime"<<"\n";
    }
    return 0;
}
