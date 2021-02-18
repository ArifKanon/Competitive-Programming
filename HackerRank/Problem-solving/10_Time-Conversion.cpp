#include <bits/stdc++.h>
using namespace std;

string timeconversion(string s)
{
    if(s.substr(8,2) == "AM")
        {
            if(s.substr(0,2) == "12")
            {
                return "00"+s.substr(2,6);
            }
            else
                return s.substr(0,8);
        }
    else
    {
        if(s.substr(0,2) == "12")
            {
                return s.substr(0,8);
            }

        else
        {
            string sn = s.substr(0,2);
            stringstream ss;
            ss<<sn;
            int t;
            ss>>t;
            t+=12;
            stringstream ss2;
            ss2<<t;
            ss2>>sn;
            return sn+s.substr(2,6);
        }
    }
}

int main()
{
    string st;
    getline(cin,st);
    cout<<timeconversion(st)<<"\n";
    return 0;
}
