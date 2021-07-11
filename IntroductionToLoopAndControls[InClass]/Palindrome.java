static boolean isPalindrome(int N)
    {
        int sum = 0;
        int rev = N;
        while(N > 0)
        {
            int digit = N%10;
            sum = sum*10+digit;
            N = N/10;
        }
       if(rev == sum)
         return true;
         else return false;
    }