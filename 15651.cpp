#include <iostream>
#define SIZE 9
using namespace std;

int n, m;
int arr[SIZE];
int isused[SIZE];
void func(int k){
    if (k == m){
        for (int i = 0; i < m; i++)
            cout << arr[i] << ' ' ;
        cout << '\n';
        return;
    }

    for (int i = 1; i <= n; i++){
        if(!isused[i]){
            arr[k] = i;
            func(k+1);
        }
    }
}

int main(){
    cin.tie(0);
    ios_base::sync_with_stdio(0);
    cin >> n >> m;
    func(0);
    return 0;
}