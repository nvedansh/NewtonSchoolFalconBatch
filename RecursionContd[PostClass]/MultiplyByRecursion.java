static int  Multiply_by_recursion(int  n, int m) 
    { 
    if(n==0 || m==0){return 0;}
    if (m == 1){ 
        return n;
    }
    return n + Multiply_by_recursion(n,m-1); 
    }