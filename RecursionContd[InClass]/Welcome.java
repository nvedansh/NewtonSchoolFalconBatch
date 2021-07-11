public static int safe_Position(int n, int k)
{
      return solve_problem(n, k) + 1;     //(5 2)
}

public static int solve_problem(int n, int k){
    if(n == 1){
      /*if only one person is there 0 is the safe position*/
      return 0;
    }
    return (solve_problem(n-1,k) + k) % n;
}