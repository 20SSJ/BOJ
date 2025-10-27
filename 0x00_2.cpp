#include <iostream>
#include <vector>
using namespace std;

void func1(vector<int> v) {
    v[10] = 7;
}

int main(void){
    vector<int> v(100);
    func1(v);
    cout << v[10];
}