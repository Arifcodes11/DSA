#include<iostream>
using namespace std;

int main()
{
    int noOfRows;
    cout<<"Enter the Number of rows fro the pattern: ";
    cin>>noOfRows;


    for(int row=1;row<=noOfRows;row++)
    {
        for(int col=1;col<=row;col++)
        {
            cout<<"* ";
        }
        cout<<endl;
    }
    return 0;
}