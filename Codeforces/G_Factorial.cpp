#include <iostream>
using namespace std;

int main()
{
    int tcase;
    cin >> tcase;

    for (int i = 0; i < tcase; i++)
    {
        int num;
        long long b = 1;
        cin >> num;
        for (int i = 1; i <= num; i++)
        {
            b = b * i;
        }
        cout << b << endl;
    }
}