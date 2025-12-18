#include <iostream>
#include <algorithm>
#define SIZE 9
using namespace std;

int n, m;
int arr[SIZE];
int answer[SIZE];

void func(int num, int k){
    if (k == m){
        for(int i = 0; i < m; i ++) cout << answer[i] << ' ';
        cout << '\n';
        return;
    }
    for (int i = num; i <= n; i++){
        answer[k] = arr[i-1];
        func(i, k+1);
    }
}

int main(){
    cin.tie(0);
    ios_base::sync_with_stdio(0);
    cin >> n >> m;
    for (int i = 0; i < n; i++) cin >> arr[i];
    sort(arr, arr+n);
    func(1, 0);
    return 0;
}