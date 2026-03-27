#include <iostream>
#include <vector>
using namespace std;

int arr[2000000];
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    int n, x;
    cin >> n;
    vector<int> v(n);
    for (int i = 0; i < n; i++) cin >> v[i];
    cin >> x;
    int cnt = 0;
    for (int j = 0; j < n; j++){
        if(x > v[j] && arr[x-v[j]]) cnt++;
        arr[v[j]] = 1;
    }
    cout << cnt;
    return 0;
}