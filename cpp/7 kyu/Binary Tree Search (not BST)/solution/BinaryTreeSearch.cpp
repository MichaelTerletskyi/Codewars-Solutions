#include <bits/stdc++.h>
using namespace std;

struct Node {
    int val;
    Node *left = nullptr;
    Node *right = nullptr;
};

bool search(int val, Node *root) {
    if(root == nullptr) return false;
    queue<Node*> chain;
    chain.push(root);

    while(!chain.empty())  {
        Node *temp = chain.front();
        chain.pop();
        if(temp -> val == val) return true;
        if(temp -> left != nullptr) {
            chain.push(temp -> left);
        }
        if(temp -> right != nullptr) {
            chain.push(temp -> right);
        }
    }
    return false;
}