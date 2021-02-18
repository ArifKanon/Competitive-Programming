#include<iostream>
using namespace std;

int main()
{
    int n;
    //cout<<"Input Array size"<<endl;
    cin>>n;
    if(n>=1 && n<=10)
    {
        int i;
        long sum=0;
        long arr[n];
        for(i=0;i<n;i++){
            cin>>arr[i];
        }
        for(i=0;i<n;i++){
            sum=sum+arr[i];
        }
        //cout<<"Total sum"<<endl;
        cout<<sum<<endl;
    }
    /*else
        cout<<"Error"<<endl;*/

    return 0;
}
