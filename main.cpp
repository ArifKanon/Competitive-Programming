#include<iostream>
using namespace std;
int res,rem=0,nf;

    void palindrome(int n)
        {
            rem += n % 10;
            res = n / 10;

        if(res > 0)
        {
            rem = rem * 10;
            palindrome(res);
        }
        if(nf == rem)
        {
            cout<<"Palindrome number: "<<rem<<"\n";
        }
        rem = 0;
        }

int main()
{
    int num;
    cin>>num;

    for(nf=1; nf<num; nf++)
    {
        palindrome(nf);
    }

    return 0;
}
