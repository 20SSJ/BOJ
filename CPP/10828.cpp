#include <iostream>
using namespace std;

const int MX = 1000005;
int dat[MX];
int pos = 0;

void push(int x){
    dat[pos++] = x;
}

void pop(){
    if (pos < 1) cout << -1 << '\n';
    else cout << dat[--pos] << '\n';
}

void top(){
    if (pos < 1) cout << -1 << '\n';
    else cout << dat[pos - 1] << '\n';
}

void empty(){
    if (pos == 0) cout << 1 << '\n';
    else cout << 0 << '\n';
}

void size(){
    cout << pos << '\n';
}

int main(void){
    int N;
    cin >> N;
    for (int i = 0; i < N; i++){
        string s;
        int w;
        cin >> s;
        if (s == "push"){
            cin >> w;
            push(w);
        }
        else if (s == "top") top();
        else if (s == "pop") pop();
        else if (s== "empty") empty();
        else if (s == "size") size();
    }
}