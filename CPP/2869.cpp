#include <iostream>
using namespace std;

int A, B, V, i, day;

int main(){
    cin.tie(0); cout.tie(0);
    ios_base::sync_with_stdio(0);
    cin >> A >> B >> V;
    i = A - B;
    day = (V - B - 1) / i + 1;
    cout << day;
    return 0;
}