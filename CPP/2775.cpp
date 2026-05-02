#include <iostream>
using namespace std;

int calc(int f, int u){
    if (f==0) return u;
    else{
        int p = 0;
        for (int i = 1; i < u + 1; i++){
            p += calc(f-1, i);
        }
        return p;
    }
}

int main(){
    cin.tie(0);
    ios_base::sync_with_stdio(0);
    int T;
    cin >> T;
    for(int i = 0; i < T; i++){
        int F, U;
        cin >> F >> U;
        cout << calc(F, U) << "\n";
    }
    return 0;
}