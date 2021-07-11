static char grades(int a, int b, int c, int d, int e)
    {
        int sum = a+b+c+d+e;
        int per = sum/5;
      if(per >= 80)
			return 'A';
		else if(per >= 60)
			return 'B';
		else if(per >= 40)
			return 'C';
		else
			return 'D';
       
    }