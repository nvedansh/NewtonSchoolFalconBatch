import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        /*Inserting the array in hashmap*/
        for(int i = 0; i < n; i++){
            if(hm.containsKey(a[i])){
                /*number already present*/
                //2 3 => 2 4
                //a[i] = 2, hm.get(a[i]) = 4
                hm.put(a[i], hm.get(a[i]) + 1);
            }
            else{
                /*number not present*/
                hm.put(a[i], Integer.valueOf(1));
            }
        }
        /*
            which entries value is greater than zero
            By Iterating over hashmap
        */
        ArrayList<Integer> keys = new ArrayList<>();
        for(Integer key: hm.keySet()){
            if(hm.get(key) > 1){
                keys.add(key);
            }
        }

        /*Sorted order*/
        Collections.sort(keys); //1 2

        for(Integer key: keys){
            System.out.println(key+" "+hm.get(key)); //1 4 \n 2 3
        }


	}
}