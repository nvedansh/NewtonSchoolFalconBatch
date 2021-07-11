static int Power(int n,int p)
{
        if(p==0)
          return 1;
        return n*Power(n,p-1);
    
}