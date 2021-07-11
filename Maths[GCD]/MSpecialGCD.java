static int gcd(int a, int b){
    if(b == 0){
        return a;
    }
    return gcd(b, a % b);
}

static int primeFactor(int n){

    if(n % 2 == 0){
        return 2;
    }
    for(int i = 3; i <= Math.sqrt(n); i+=2){
        /*
            N = 101
            10
            i = 3, i = 5, i = 7, i = 9
        */
        if(n%i == 0){
            return i;
        }
    }
    return n;
}


static void printM_SpecialGCD(int N, int M)
{

    //N = 10, M = 5 
    int prime = primeFactor(N); //prime = 2
    int count = 0; 
    int i = prime; // i = 2
    while(count < M){
        int res = gcd(N + i, N); //(22, 10) = 2
        if(res == prime){
            System.out.print((N+i)+" "); //12 14 16 18 22
            count++; // 5
        }
        i += prime; // 14
    }
}



//N = 10, M = 5

//smallest_prime_factor(N) = 2

//i = 2 ..... i = sqrt(N) => find a factor which is a prime
//return N, n is a prime number


//I have to find 5 numbers which are greater 10 whose gcd (, 10) is 2
// gcd(12, 10) = 2 
// gcd(14, 10) = 2
// gcd(16, 10) = 2
// gcd(18, 10) = 2
// gcd(22, 10) = 2

//12 14 16 18 22