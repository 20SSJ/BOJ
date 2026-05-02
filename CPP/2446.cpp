#include <iostream>

using namespace std;

int main(){
    int N;
    cin >> N;
    for (int i = N; i > 0; i--){
        for (int j = N - i; j > 0; j--) cout << " "; 
        for (int k = 0; k < 2 * (i-1)+ 1; k++) cout << "*";
        cout << "\n";
    }
    for (int i = 1; i < N; i++){
        for (int j = N - 1 - i; j > 0; j--) cout << " "; 
        for (int k = 0; k < 2 * i + 1; k++) cout << "*";
        cout << "\n";
    }
    return 0;
}