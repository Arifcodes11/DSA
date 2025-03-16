#include<iostream>
using namespace std;

int main()
{
    int n;
    cin>>n;

    int row=1;
    while(row<=n)
    {
        int col=1;
        int val=row;
        while(col<=row)
        {
            cout<<val<<" ";
            val++;
            col++;
        }
        cout<<endl;
        row++;
    }
    return 0;
}