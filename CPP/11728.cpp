#include <iostream>
#include <queue>
using namespace std;

int n, m, s;
queue<int> q;
queue<int> q2;
queue<int> q3;
int main(){
    cin.tie(0); cout.tie(0);
    ios_base::sync_with_stdio(0);
    cin >> n >> m;
    for (int i = 0; i < n; i++){
        cin >> s;
        q.push(s);
    }
    for (int i = 0; i < m; i++){
        cin >> s;
        q2.push(s);
    }
    for(int i = 0; i < n + m; i++){
        if(!q.empty() && !q2.empty()){
            if (q.front() < q2.front()){
                q3.push(q.front());
                q.pop();
            }
            else{
                q3.push(q2.front());
                q2.pop();
            } 
        }
        if(q.empty()){
            while(!q2.empty()){
                q3.push(q2.front());
                q2.pop();
            }
        }
        if(q2.empty()){
            while(!q.empty()){
                q3.push(q.front());
                q.pop();
            }
        }
    }
    for(int i = 0; i < n + m; i++){
        cout << q3.front() << ' ';
        q3.pop();
    }
    return 0;
}