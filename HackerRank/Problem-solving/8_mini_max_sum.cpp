#include <iostream>
using namespace std;

int main() {
  int k, arr[5], temp = 0;
  long long mi = 0, ma = 0;

  for (int i = 0; i < 5; i++) {
    cin >> arr[i];
  }
  for (int j = 0; j < 4; j++) {
    for (int i = 0; i < 4; i++) {
      if (arr[i] > arr[i + 1]) {
        temp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;
      }
      temp = 0;
    }
  }
  for (k = 0; k < 4; k++) {
    mi = mi + arr[k];
  }
  for (k = 1; k < 5; k++) {
    ma = ma + arr[k];
  }

  
  cout << mi << " " << ma << endl;
}
