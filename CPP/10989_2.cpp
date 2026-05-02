#include <iostream>
using namespace std;

int arr[10001];
int main(){
    int N; 
    cin >> N;
    int a;
    for (int i = 0; i < N; i++){
        cin >> a;
        arr[a]++;
    }
    int size = sizeof(arr) / sizeof(*arr);
    for (int i = 0; i < size; i++){
        if(arr[i] != 0){
            for (int j = 0; j < arr[i]; j++){
                cout << i << "\n";
            }
        }
    }
    return 0;
}