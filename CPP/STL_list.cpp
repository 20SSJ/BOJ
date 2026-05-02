#include <iostream>
#include <list>
using namespace std;

int main(void){
    ios_base::sync_with_stdio(0);
    list<int> L = {1, 2};
    list<int>::iterator t = L.begin(); // t -> 1
    L.push_front(10); // 10 1 2 
    cout << *t << '\n'; // 1
    L.push_back(5); // 10 1 2 5 
    L.insert(t, 6); // 10 6 1 2 5 
    t++; // t->2
    t = L.erase(t); // 10 6 1 t->5   

    cout << *t << '\n';
    for(auto i : L) cout << i << ' ';
    cout << '\n';
    for(list<int>::iterator it = L.begin(); it != L.end(); it++){
        cout << *it << ' ';
    }
}