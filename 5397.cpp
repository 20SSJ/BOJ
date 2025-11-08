#include <iostream>
#include <string>
#include <list>
using namespace std;

int main(){
    ios_base::sync_with_stdio(0);
    cin.tie(0);

    int N;
    cin >> N;

    for (int i = 0; i < N; i++){
        string s;
        cin >> s;
        list<char> L;
        list<char>:: iterator c = L.end();
        
        for (auto j : s) {
            if(j == '<'){
                if (c != L.begin()) c--;
            }
            else if (j == '>'){
                if (c != L.end()) c++;
            } 
            else if (j == '-'){
                if (c != L.begin()){
                    c--;
                    c = L.erase(c);
                }
            }
            else L.insert(c, j);
        }
        
        for (auto k : L) cout << k;
        cout << '\n';
    }
    return 0;
}