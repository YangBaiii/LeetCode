class Solution {
    public int countLargestGroup(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        int ans = 0, maxSize = 0;
        for (int i = 1; i <= n; i++) {
            int count = 0, temp = i;
            while (temp > 0) {
                count += temp % 10;
                temp /= 10;
            }
            map.put(count, map.getOrDefault(count, 0) + 1);
        }
        for (int size : map.values()) {
            maxSize = Math.max(maxSize, size);
        }
        for (int size : map.values()) {
            if(size == maxSize) ans++;
        }
        return ans;
    }
}