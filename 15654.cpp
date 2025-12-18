#include <iostream>
#include <algorithm>
#define SIZE 9
using namespace std;

int n, m;
int arr[SIZE];
bool isused[SIZE];

void func(int k){
    if (k == m){
        for (int i = 0; i < m; i++)
            cout << arr[i] << ' ';
        cout << '\n';
        return;
    }
    for (int i = 0; i < m; i++){
        if(!isused){
            func(k+1);
        }
    }
}

int main(){
    cin.tie(0);
    ios_base::sync_with_stdio(0);
    cin >> n >> m;
    for (int i = 0; i < n; i++)
        cin >> arr[i];
    sort(arr, arr+n);
    func(0);
    return 0;
}