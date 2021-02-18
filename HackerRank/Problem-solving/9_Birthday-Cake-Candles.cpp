#include <iostream>
using namespace std;

int main() {
  int a;
  cin >> a;
  int arr[a], count = 0;
  for (int i = 0; i < a; i++) {
    cin >> arr[i];
  }
  int max = arr[0];
  for (int i = 0; i < a; i++) {
    if (max < arr[i]) {
      max = arr[i];
    }
  }
  for (int i = 0; i < a; i++) {
    if (arr[i] == max) {
      count++;
    }
  }

  cout << count << endl;
}
