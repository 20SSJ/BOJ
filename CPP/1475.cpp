#include <iostream>
#include <string>
#define SIZE 10
using namespace std;

int arr[SIZE];
int main(void){
    int N, MAX = 1;
    cin >> N;

    string room = to_string(N);
    for (auto c : room) arr[c - '0']++;

    int six_nine = (arr[6] + arr[9] + 1) / 2;
    int sets = 0;
    for(int i = 0; i < SIZE; i++){
        if(i != 6 && i != 9){
            if(MAX < arr[i]) MAX = arr[i];
        }
    }

    sets = (six_nine > MAX) ? six_nine : MAX;
    cout << sets; 
}