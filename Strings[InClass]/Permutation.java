import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

    //ABCDE
    //['A', 'B', 'C', 'D', 'E']
    //['A', 'D', 'C', 'B', 'E']
    //ADCBE
    public static String swap(String str, int i, int j){
        char strArray[] = str.toCharArray();    
        char temp = strArray[i];
        strArray[i] = strArray[j];
        strArray[j] = temp;
        return String.valueOf(strArray);
    }


    public static void permute(String str, int left, int right, ArrayList<String> ans){
        if(left == right){
            ans.add(str);
        }
        else{
            for(int i = left; i <= right; i++){
                String swapped_str = swap(str, left, i);
                permute(swapped_str, left+1, right, ans);
            }
        }
    }

	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        ArrayList<String> ans = new ArrayList<>();
        permute(str, 0, n - 1, ans);
        Collections.sort(ans);
        for(int i = 0; i < ans.size(); i++){
            System.out.print(ans.get(i) +" ");
        }

	}
}