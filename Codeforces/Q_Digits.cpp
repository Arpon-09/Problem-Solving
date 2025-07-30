#include <iostream>
#include <string>
using namespace std;

int main() {
    int t;
    cin >> t;

    for (int i = 1; i <= t; i++) {
        

        string s;
        cin >> s;
        
        for (int j = (int)s.length() - 1; j >= 0; j--) {
            cout << s[j] << " ";
        }
        cout << endl;  
    }

    return 0;
}
