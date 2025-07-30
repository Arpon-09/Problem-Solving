#include <iostream>

using namespace std;

int main () {

    int a;
   
    int b;
    

   

    while (true) {
        cin >> a;
        cin >> b;

        if (a <= 0 || b <= 0) break;

    

    int start = min(a , b);
    int end = max (a, b);
    int sum = 0;

    for (int i = start; i <= end; i++) {

        cout << i << " ";
        sum = sum + i;

        
    } 
    
    cout << "sum =" << sum << endl;

}

    






    return 0;   
}