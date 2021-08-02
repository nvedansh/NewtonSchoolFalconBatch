import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		
		int l[] = new int[n+1];
		int r[] = new int[n+1];
		int p[] = new int[n+1]; //parent

		for(int i = 1; i <= n; i++){
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
			
			if(l[i] != -1)	p[l[i]] = i;
			if(r[i] != -1)	p[r[i]] = i;
		}
		while(q-- > 0){
			ArrayList<Integer> list = new ArrayList<>();
			int x = sc.nextInt();
			while(x != 1){
				if(l[p[x]] == x){
					list.add(0, 1);
				}
				else{
					list.add(0, 0);
				}
				x = p[x];
			}
			for(Integer i : list){	
				if(x == -1)	break;
				if(i.equals(0)){
					if(l[x] == -1){
						x = l[x];
						break;
					}
					x = l[x];
				}
				else{
					if(r[x] == -1){
						x = r[x];
						break;
					}
					x = r[x];
				}
			}
			System.out.println(x);
		}
	}
}