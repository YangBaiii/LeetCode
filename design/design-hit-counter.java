class HitCounter {
    // Follow Up
    private Deque<int[]> queue;
    private int totalHits;

    public HitCounter() {
        queue = new LinkedList<>();
        totalHits = 0;
    }

    public void hit(int timestamp) {
        if (!queue.isEmpty() && queue.peekLast()[0] == timestamp) {
            queue.peekLast()[1]++;
        } else {
            queue.offer(new int[]{timestamp, 1});
        }
        totalHits++;
    }

    public int getHits(int timestamp) {
        while (!queue.isEmpty() && timestamp - queue.peek()[0] >= 300) {
            totalHits -= queue.poll()[1];
        }
        return totalHits;
    }
}
