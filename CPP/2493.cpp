#include <iostream>
#include <stack>
using namespace std;

int N, r;
stack<pair<int, int>> st;
int main(){
    cin.tie(0); cout.tie(0);
    ios_base::sync_with_stdio(0);
    cin >> N;
    for (int i = 1; i < N + 1; i++){
        cin >> r;
        while(!st.empty()){
            if(st.top().second < r) st.pop();
            else{
                cout << st.top().first << ' ';
                break;
            } 
        }
        if(st.empty()){
            cout << 0 << ' ';
        }
        st.push({i, r});
    }
    return 0;
}