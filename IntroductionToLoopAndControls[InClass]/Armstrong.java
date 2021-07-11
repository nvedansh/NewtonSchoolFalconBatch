static boolean isArmstrong(int N)
    {
        int num = N;
        int sum = 0;
        while(N > 0)
        {
            int digit = N%10;
            sum += digit*digit*digit;
            N  = N/10;
        }
       if(num == sum)
         return true;
         else return false;
    }