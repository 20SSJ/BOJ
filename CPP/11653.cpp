#include <iostream>
using namespace std;

int n, tmp;
int main(){
    cin.tie(0); cout.tie(0);
    ios_base::sync_with_stdio(0);
    cin >> n;
    for (int i = 2; i*i <= n; i++){
        while(n % i == 0){
            n /= i; 
            cout << i << '\n';
        }
    }
    if(n != 1) cout << n;
    return 0;
}