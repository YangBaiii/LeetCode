class Solution {
    public long repairCars(int[] ranks, int cars) {
        long left = 0, right = (long) Arrays.stream(ranks).min().getAsInt() * cars * cars;
        while (left < right) {
            int count = 0;
            long mid = (left + right) / 2;
            for (int rank : ranks) {
                count += Math.sqrt(mid / rank);
            }
            if (count >= cars) right = mid;
            else left = mid + 1;
        }
        return left;
    }
}