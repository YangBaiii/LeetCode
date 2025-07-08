class Solution {
    public int maxEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> Integer.compare(a[0], b[0]));
        int day = 0, i = 0 , len = events.length, ans = 0;   
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        while (!pq.isEmpty() || i < len) {
            if (pq.isEmpty()) {
                day = events[i][0];
            } 
            while (i < len && events[i][0] <= day) {
                pq.offer(events[i++][1]);
            }
            pq.poll();
            ans++;
            day++;
            // remove expired events that have a end day earlier that current day
            while (!pq.isEmpty() && pq.peek() < day) {
                pq.poll();
            }
        }
        return ans;
    }
}