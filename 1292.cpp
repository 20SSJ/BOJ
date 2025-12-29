#include <iostream>
using namespace std;

int A, B, psum, j;
int arr[1000005];
int main(){
    ios_base::sync_with_stdio(0);
    cin.tie(0); cout.tie(0);
    cin >> A >> B;
    int k = 1;
    for (int i = 1; i <= B; i++){
        j = i;
        while(j--) arr[k++] = i;
    }
    for (int i = A; i <= B; i++)
        psum += arr[i];
    cout << psum;
    return 0;
}