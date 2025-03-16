class Solution {
    public long repairCars(int[] ranks, int cars) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int rank : ranks) {
            freqMap.put(rank, freqMap.getOrDefault(rank, 0) + 1);
        }
        
        long left = 1, right = (long) 1e14;
        while (left < right) {
            long mid = (left + right) / 2;
            long count = 0;

            // Iterate through unique ranks and use frequency to optimize counting
            for (var entry : freqMap.entrySet()) {
                int rank = entry.getKey(), freq = entry.getValue();
                count += (long) freq * (long) Math.sqrt((double) mid / rank);
                if (count >= cars) break; 
            }

            if (count >= cars) right = mid;
            else left = mid + 1;
        }
        return left;
    }
}
