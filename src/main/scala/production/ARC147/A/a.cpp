#include <set>
#include <iostream>

using namespace std;

int main() {
    // code
    int n;
    cin >> n;

  multiset<int> st;

  for (int i = 0; i < n; i++) {
    int a;
    cin >> a;
    st.insert(a);
//    auto itr = st.begin();       // 最初の要素へのイテレータを取得
//    cout << *itr << "\n";      // イテレータの指す先のデータを表示
//  cout << st.size() << endl;

  }
  int cnt = 0;


    while(st.size()>1) {
     // cout<<st.size()<<endl;
    auto top = st.begin();
    int tt = *top;
//          cout<<tt<<endl;
//    st.erase(top);
//      cout<<st.size()<<endl;
    auto endit = st.end();
      endit--;
        int ee = *endit;
    st.erase(endit);

//cout<< ee<<endl;
//cout<< tt<<endl<<endl;
    if(ee % tt != 0) {
      st.insert(ee % tt);
    }
    cnt++;
  }



  cout << cnt << endl;

  return 0;
}
