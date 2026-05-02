#include <iostream>
#include <vector>
using namespace std;

void func1(vector<int> v) {
    v[10] = 7;
}

int main(void){
    ios::sync_with_stdio(0);
    vector<int> v(100);
    func1(v);
    cout << v[10];
}