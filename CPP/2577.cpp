#include <iostream>
#include <string>
#define SIZE 10
using namespace std;

int arr[SIZE];
int main(void){
    cin.tie(0);
    int A, B, C;
    cin >> A >> B >> C;
    
    long result = A * B * C;
    string s = to_string(result);
    for (auto c : s) arr[c-'0']++;
    for(int i = 0; i<SIZE; i++)
        cout << arr[i] << '\n';
}