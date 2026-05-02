#include <iostream>
using namespace std;

int n, H, W, P;

int main(){
    cin.tie(0);
    ios_base::sync_with_stdio(0);
    cin >> n;
    for(int i = 0; i < n; i++){
        cin >> H >> W >> P;
        int floor = (P-1) % H + 1;
        int room = 1 + (P-1) / H;
        cout << floor * 100 + room << "\n";
    }
    return 0;
}