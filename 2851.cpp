#include <iostream>
using namespace std;

int n, ans, a, b, tmp;
int main(){
    cin.tie(0); cout.tie(0);
    ios_base::sync_with_stdio(0);
    for (int i =  0; i < 10; i++){
        cin >> n;
        ans += n;
        if(ans == 100){
            cout << ans;
            break;
        }
        else if (ans > 100){
            a = ans - 100;
            tmp = ans - n;
            b = 100 - tmp;
            if (a > b) cout << tmp;
            else cout << ans;
            break;
        }
        if (i == 9) cout << ans;
    }
    return 0;
}