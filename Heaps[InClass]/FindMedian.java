static PriorityQueue<Integer> smaller = new PriorityQueue<>(Collections.reverseOrder()); //Max heap for lower values
static PriorityQueue<Integer> larger = new PriorityQueue<>(); // Min heap for larger values 
public static double getMedian(int X) //X = 4
{
   //smaller = [4, 10] and larger = [15]
   //adding
   if(smaller.size() == 0 || smaller.peek() >= X){
      smaller.add(X);
   }
   else{
      larger.add(X);
   }
   
   //shifting
   if(smaller.size() - larger.size() > 1){
      larger.add(smaller.remove());
   }
   else if(larger.size() - smaller.size() > 1){
      smaller.add(larger.remove());
   }

   //smaller = [4, 5] and larger = [10, 15]
   //odd elements
   if(smaller.size() > larger.size()){
      return Double.valueOf(smaller.peek());
   }
   
   else if(larger.size() > smaller.size()){
      return Double.valueOf(larger.peek());
   }
   
   //even element
   return (Double.valueOf(smaller.peek()) + Double.valueOf(larger.peek())) / 2.0;
}