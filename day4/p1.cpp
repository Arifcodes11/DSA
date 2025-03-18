#include<iostream>
using namespace std;

int main()
{
    int noOfRows,noOfCols;

    cout<<"Enter the number of rows and columns:";

    cin>>noOfRows>>noOfCols;

    for(int rows=1;rows<=noOfRows;rows++)
    {
        for(int cols=1;cols<=noOfCols;cols++)
        {
            cout<<"*";
        }
        cout<<endl;
    }
    return 0;
}