#include <iostream>
using namespace std;

int main() {
    
    int num;
    int reverse = 0;
    cin >> num;
    int orig = num;

    while (num != 0) {
        int digit = num % 10;     // Get the last digit
        reverse = reverse * 10 + digit;            // Print the digit
        num = num / 10;           // Remove the last digit
    }

    if (orig == reverse) {
        cout << reverse<< endl ;
        cout << "YES"<< endl;
        
    } else {
        cout<< reverse << endl;
        cout << "NO" << endl;
    }

    
    return 0;
}
