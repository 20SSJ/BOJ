#include <iostream>
#include <algorithm>
#include <string>
using namespace std;

const int MX = 1000005;
char dat[MX];
int pre[MX], nxt[MX];
int unused = 1;

void insert(int addr, char c){
    dat[unused] = c;
    pre[unused] = addr;
    nxt[unused] = nxt[addr];
    if (nxt[addr] != -1) pre[nxt[addr]] = unused;
    nxt[addr] = unused;
    unused++;
}

void erase(int addr){
    nxt[pre[addr]] = nxt[addr];
    if (nxt[addr] != -1) pre[nxt[addr]] = pre[addr];
}

void traverse(){
    int cur = nxt[0];
    while(cur != -1){
        cout << dat[cur];
        cur = nxt[cur];
    }
}

int main(){
    ios_base::sync_with_stdio(0);
    cin.tie(0);

    fill(pre, pre + MX, -1);
    fill(nxt, nxt + MX, -1);
    
    string S;
    cin >> S;

    int cursor = 0;
    for (auto c : S){
        insert(cursor, c);
        cursor = nxt[cursor];
    }

    int M;
    cin >> M;

    for (int i = 0; i < M; i++){
        char w;
        cin >> w;

        if (w == 'D'){
            if (nxt[cursor] != -1) cursor = nxt[cursor];
        }
        else if (w == 'p'){
            char nw;
            cin >> nw;
            cursor = pre[cursor];
            insert(cursor, nw);
        }
        else if (w == 'L'){
            if (pre[cursor] != -1) cursor = pre[cursor];
        }
        else if (w == 'B'){
            if (pre[cursor] != -1){
                cursor = pre[cursor];
                erase(cursor);
            }
        }
    }
    traverse();
    return 0;
}