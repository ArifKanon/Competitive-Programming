#include<iostream>
using namespace std;

int main()
{
    int a,i,sum=0;
    //cout<<"Enter the array size"<<endl;
    cin>>a;
    int arr[a];
    //cout<<"Enter the array elemants"<<endl;
    for(i=0;i<a;i++){
        cin>>arr[i];
    }
    for(i=0;i<a;i++){
        sum=sum+arr[i];
    }
    cout<<sum<<endl;
}
