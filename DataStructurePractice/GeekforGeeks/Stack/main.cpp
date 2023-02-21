#include <iostream>
#include <bits/stdc++.h>
using namespace std;

class stack{
int top;

public:
    int a[MAX];
    //Stack(){top=-1;}
    bool push(int x);
    int pop();
    int peek();
    bool isEmpty();
};
bool Stack::push(int x){
if(top>=(MAX-1)){
    cout<<"Stack overflow";
    return false;
}
else{
    a
}
}
