#include <iostream>
#include <list>
using namespace std;

int main(){
    int N, K, t = 0;
    cin >> N >> K;
    list<int> L;
    list<int> result;
    for(int i = 1; i < N + 1; i++) L.push_back(i);
    while(L.size()){
        t = (t + K - 1) % L.size();
    }
    
    return 0;
}