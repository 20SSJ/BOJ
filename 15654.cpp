#include <iostream>
#include <algorithm>
#define SIZE 9
using namespace std;

int n, m;
int arr[SIZE];
int answer[SIZE];
bool isused[SIZE];

void func(int num, int k){
    if (k == m){
        for(int i = 0; i < m; i ++) cout << answer[i] << ' ';
        cout << '\n';
        return;
    }
    for (int i = 1; i <= n; i++){
        if(!isused[i]){
            answer[k] = arr[i-1];
            isused[i] = 1;
            func(i+1, k+1);
            isused[i] = 0;
        }
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