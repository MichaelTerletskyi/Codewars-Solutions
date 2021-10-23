// My solution by loop
long long factorial(long n) {
    if(n == 0) return 1;
    for(int i = n - 1; i > 0; i--) {
        n = n * i;
    }
    return n;
}

//Solution by recursion
//long long factorial(long n){
//    return n == 0 ? 1 : n * factorial(n - 1);
//}