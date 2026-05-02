#include <iostream>
using namespace std;

int n, num;
int arr[2000001];
int main(){
    cin.tie(0); cout.tie(0);
    ios_base::sync_with_stdio(0);
    cin >> n;
    for (int i = 0; i < n; i++){
        cin >> num;
        arr[num+1000000]++;
    }
    for (int i = 0; i <= 2000000; i++){
        for (int j = 0; j < arr[i]; j++){
            cout << i-1000000 << '\n';
        }
    }
    return 0;
}