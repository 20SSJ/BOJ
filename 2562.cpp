#include <iostream>

#define SIZE 9

using namespace std;

int main(){
    int arr[SIZE];
    int max = 0, idx = 0;
    for (int i = 0; i < SIZE; i++){
        cin >> arr[i];
        if (max < arr[i]){
            max = arr[i];
            idx = i;
        } 
    }
    cout << max << "\n" << idx + 1;
    return 0;
}