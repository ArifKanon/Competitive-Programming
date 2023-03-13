#include<iostream>
#include<cmath>
using namespace std;

int main()
{
    int n,i;
    float neg=0,pos=0,zero=0;
    //cout<<"Enter the array size"<<endl;
    cin>>n;
    int arr[n];
    //cout<<"Enter's the array element"<<endl;
    for(i=0;i<n;i++){
        cin>>arr[i];
    }
    for(i=0;i<n;i++){
        if(arr[i]<0)
        {
            neg++;
        }
        else if(arr[i]>0)
        {
            pos++;
        }
        else
        {
            zero++;
        }
    }
    //cout<<"pos="<<pos<<" neg="<<neg<<" zero="<<zero<<endl;

    float po,ne,ze;
    po=pos/n;
    ne=neg/n;
    ze=zero/n;
    cout<<po<<endl<<ne<<endl<<ze<<endl;
    return 0;
}
