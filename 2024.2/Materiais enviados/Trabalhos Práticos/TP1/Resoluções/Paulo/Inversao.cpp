#include <algorithm>
#include <iostream>
#include <unordered_set>
#include <queue>
#include <utility>
using namespace std;

long reverseNumber(long N) {
  string s = to_string(N);
  reverse(s.begin(), s.end());
  return(atol(s.c_str()));
}

int main(){
  cin.sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);
  int N, A, B; //variáveis conforme sugerido pelo exercício
  cin>>N;
  for(int i=0;i<N;i++) {
    cin>>A>>B;
    queue<pair<int,int> > q;
    unordered_set<int> jaTestou;
    q.push(make_pair(A,0));
    while(!q.empty()) {
      auto f=q.front();
      q.pop();
      if(f.first==B) {
        cout << f.second << endl;
        while(!q.empty()) q.pop();//esvazia a pilha pra sair do while
      } else {
        if(jaTestou.find(f.first)==jaTestou.end()) { //não testou ainda.
          jaTestou.insert(f.first);
          q.push(make_pair(f.first+1,f.second+1));
          q.push(make_pair(reverseNumber(f.first),f.second+1));
        }
      }
    }
  }
  return 0;
}