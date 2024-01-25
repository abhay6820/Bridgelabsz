import java.util.PriorityQueue;

 class PriorityQueueDemo {
     public static void main(String[] args) {
         PriorityQueue<Integer> pq = new PriorityQueue<>();

         // Add numbers in the specified order
         pq.add(79);
         pq.add(99);
         pq.add(88);
         pq.add(95);

         // Print the numbers in priority order
         System.out.println("Numbers in priority order: ");
         while (!pq.isEmpty()) {
             System.out.print(pq.poll() + " ");
         }

     }
 }