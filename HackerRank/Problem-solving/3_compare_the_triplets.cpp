#include<iostream>
using namespace std;

int main()
{
    int Al[3];int Bo[3];
    int i,Alice=0,Bob=0;
    //cout<<"Alice elements"<<endl;
    for(i=0;i<3;i++){
        cin>>Al[i];
    }
    //cout<<"Bob's elements"<<endl;
    for(i=0;i<3;i++){
        cin>>Bo[i];
    }
    for(i=0;i<3;i++){
        if(Al[i]==Bo[i])
         {
             Alice=Alice+0;
             Bob=Bob+0;
         }
        else{
                if(Al[i]>Bo[i])
            Alice=Alice+1;

                else
            Bob=Bob+1;
            }
    }
    cout<<Alice<<" "<<Bob<<endl;

    return 0;
}
