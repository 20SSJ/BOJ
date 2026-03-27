#include <iostream>
using namespace std;

int n, m, num;
int arr[20000001];
int main(){
    cin.tie(0); cout.tie(0);
    ios_base::sync_with_stdio(0);
    cin >> n;
    for (int i = 0; i < n; i++){
        cin >> num;
        arr[num + 10000000]++;
    }
    cin >> m;
    for (int i = 0; i < m; i++){
        cin >> num;
        cout << arr[num + 10000000] << ' ';
    }
    return 0;
}