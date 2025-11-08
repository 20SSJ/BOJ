#include <iostream>
using namespace std;

const int MX = 1000005;
int dat[MX];
int head = 0, tail = 0;
void push(int x){
    dat[tail++] = x;
}
void front(){
    if (head == tail) cout << -1 << '\n';
    else cout << dat[head] << '\n';
}
void back(){
    if (head == tail) cout << -1 << '\n';
    else cout << dat[tail-1] << '\n';
}
void pop(){
    if (head == tail) cout << -1 << '\n';
    else cout << dat[head++] << '\n';
}
void size(){
    cout << tail - head << '\n'; 
}
void empty(){
    if (tail - head == 0) cout << 1 << '\n';
    else cout << 0 << '\n';
}
int main(){
    cin.tie(0);
    ios_base::sync_with_stdio(0);
    int N, x;
    cin >> N;
    string s;
    for (int i = 0; i < N; i++){
        cin >> s;
        if (s == "push"){
            cin >> x;
            push(x);
        }
        else if (s == "front") front();
        else if (s == "back") back();
        else if (s == "pop") pop();
        else if (s=="empty") empty();
        else if (s == "size") size();
    }
}