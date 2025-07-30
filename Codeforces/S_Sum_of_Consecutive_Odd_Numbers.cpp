#include <iostream>
#include <string>
using namespace std;

int main() {
    int t;
    cin >> t;

    for (int i = 1; i <= t; i++) {
        
        int x; 
        cin >> x;
        int y;
        cin >> y;

        int start = min(x , y);
        int end = max (x, y);
        int sum = 0;

        if (start + 1 == end) {
                cout << "0" << endl; 
            } else {

        for (int j= start+1; j< end; j++) {

            
             if (j % 2 != 0) {
                sum = sum +j;
                
            }
        }cout << sum << endl;
    }
        
    }

    return 0;
}
