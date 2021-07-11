static int Factorial(int N)
{
    if(N==0){
        return 1;
    }

    return N*Factorial(N-1);
}