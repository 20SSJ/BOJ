#include <iostream>
using namespace std;

void hanoi(int a, int b, int n){
    if(n == 1){
        cout << a << ' ' << b << '\n';
        return;
    }
    int c = 6 - a - b;
    hanoi(a, c, n-1);
    cout << a << ' ' << b << '\n';
    hanoi(c, b, n-1);
}
int main(){
    cin.tie(0);
    ios_base::sync_with_stdio(0);
    int k;
    cin >> k;
    cout << (1<<k)-1 << '\n';
    hanoi(1, 3, k);
    return 0;
}