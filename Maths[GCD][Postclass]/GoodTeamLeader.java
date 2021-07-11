import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Long, Integer> hm = new HashMap<>();
        for(int i = 0; i < n; i++){
            long value = sc.nextLong();
            long x = (long)Math.sqrt(value);
            hm.put(value, hm.getOrDefault(value, 0) + 1);
            for(long j=2;j<=x;j++){
                if(value%j==0){
                    hm.put(j, hm.getOrDefault(j, 0) + 1);
                    if(j*j!=value){
                        hm.put(value/j, hm.getOrDefault(value/j, 0) + 1);
                    }
                }
            }
        }
        int ans=0;
        for(Long l : hm.keySet()){
            ans = Math.max(ans, hm.get(l));
        }
        System.out.println(ans);
	}
}