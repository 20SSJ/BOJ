#include <iostream>
using namespace std;

long dom(int A, int B, int C){
    if (B == 1) return A % C;
    long long val = dom(A, B/2, C);
    val = val * val % C;
    if (B % 2 == 0) return val;
    return val * A % C;
}

int main(){
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    long long A, B, C;
    cin >> A >> B >> C;
    cout << dom(A, B, C);
    return 0;
}