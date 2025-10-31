#include <iostream>
#include <list>
#include <string>
using namespace std;

int main(){
    ios_base::sync_with_stdio(0);
    cin.tie(0);

    string N;
    cin >> N;
    
    list<char> L;
    for (auto i : N) L.push_back(i);

    list<char>:: iterator c = L.end();

    int M;
    cin >> M;
    
    for (int i = 0; i < M; i++){
        char A, B;
        cin >> A;

        if (A == 'L' && c != L.begin()) c--;
        else if (A == 'D' && c != L.end()) c++;
        else if (A == 'B' && c!= L.begin()){
            c--;
            c = L.erase(c);
        }
        else if (A == 'P'){
            cin >> B; 
            L.insert(c, B);
        }
    }
    for(auto j : L) cout << j;
    return 0;
}