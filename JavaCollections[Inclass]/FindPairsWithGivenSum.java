import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	/*
		n = 4, k = 6
		1 5 7 1
		(1, 5) (1, 7) (1, 1) (5, 7) (5, 1) (7, 1)
		2 pairs

		N = 7, k = 6
		1 5 7 5 1 1 5
		Output: 9

	*/
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
        HashMap<Integer, Integer> hm = new HashMap<>();
        long ans = 0;
		//1 5 7 1 5, k = 6
		//hm = [{1, 2}, {5, 2}, {7, 1}]
		for(int i = 0; i < n; i++){
            int ele = sc.nextInt(); // 1 5 7 1 5
			if(hm.containsKey(k - ele)){
				ans += hm.get(k - ele); // ans = 1 + 1 + 2
			}
			if(hm.containsKey(ele)){
                /*number already present*/
                hm.put(ele, hm.get(ele) + 1);
            }
            else{
                /*number not present*/
                hm.put(ele, Integer.valueOf(1));
            }
        }
		System.out.println(ans);
	}
}