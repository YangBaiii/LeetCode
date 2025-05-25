class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] count = new int[1001];
        List<Integer> list = new ArrayList<>();
        for (int i : nums1) count[i]++;
        for (int i : nums2) {
            if (count[i] != 0) {
                list.add(i);
                count[i] = 0;
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}