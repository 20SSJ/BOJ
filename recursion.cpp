#include <iostream>
using namespace std;

int sum;
void rec(int n){
    if(n==0) return;
    cout << n << " ";
    rec(n - 1);
}

int recSum(int n){
    if(n== 0) return 0;
    return n + recSum(n - 1);
}

int main(){
    rec(10);
    cout << "\n";
    cout << recSum(10);
    return 0;
}