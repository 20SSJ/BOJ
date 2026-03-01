#include <iostream>
#include <string>
#include <cmath>
#define SIZE 26
using namespace std;

int main(){
    cin.tie(0);
    ios_base::sync_with_stdio(0);
    string s1, s2;
    cin >> s1 >> s2;
    int arr[SIZE] = {0};
    for (auto c:s1) arr[c - 'a']++;
    for (auto s:s2) arr[s - 'a']--;
    int sum = 0;
    for (int i = 0; i < SIZE; i++){
        if (arr[i] != 0){
            sum += abs(arr[i]);
        }
    }
    cout << sum;
    return 0;
}