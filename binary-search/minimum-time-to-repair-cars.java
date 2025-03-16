class Solution {
    public long repairCars(int[] ranks, int cars) {
        TreeMap<Integer, Integer> freqMap = new TreeMap<>();
        // Improve efficiency by passing a frequency array of ranks rather than ranks itself
        for (int rank : ranks) {
            freqMap.put(rank, freqMap.getOrDefault(rank, 0) + 1);
        }
        
        long left = 0, right = (long) 1e14;
        while (left < right) {
            long mid = (left + right) / 2;
            long count = 0;

            for (var entry : freqMap.entrySet()) {
                int rank = entry.getKey(), freq = entry.getValue();
                count += freq * Math.sqrt(mid / rank);
                if (count >= cars) break; 
            }

            if (count >= cars) right = mid;
            else left = mid + 1;
        }
        return left;
    }
}