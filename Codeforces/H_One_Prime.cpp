#include <iostream>
using namespace std;

int main()
{

    int a;
    cin >> a;

    if (1 == a)
    {
        cout << "NO" << endl;
        return 0;
    }
    bool flg = true;
    for (int i = 2; i <= a - 1; i++)
    {
        if (a % i == 0)
        {
            flg=false;
        }
    }
    if(flg){
        cout << "YES";
    }else{
        cout << "NO";
    }
    

    return 0;
}
