#include<iostream>
#include<cmath>
using namespace std;

int main()
{
    int a,i,j,d1sum=0,d2sum=0;
    //cout<<"Input the Square Matrix size"<<endl;
    cin>>a;
    int arr[a][a];
    //cout<<"Enter the Matrix number"<<endl;
    for(i=0;i<a;i++){
        for(j=0;j<a;j++){
            cin>>arr[i][j];
        }
    }

    for(i=0;i<a;i++){
        for(j=0;j<a;j++){
            if(i==j)
            {
               d1sum=d1sum+arr[i][j];
            }
            if(i+j==a-1)
            {
                d2sum=d2sum+arr[i][j];
            }
        }
    }
    cout<<abs(d1sum-d2sum)<<endl;
    return 0;
}
