#include <iostream>
#include <bitset>
#include <cmath>
using namespace std;

int main() {
    int T;
    cin >> T; 

    while (T--) {
        int N;
        cin >> N;

        bitset<32> b(N);          
        int onesCount = b.count(); 

       
        int result = (1 << onesCount) - 1;  

        cout << result << endl;
    }

    return 0;
}
