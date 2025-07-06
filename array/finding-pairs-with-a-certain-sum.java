class FindSumPairs {
    Map<Integer, Integer> map;
    int[] a1, a2;
    public FindSumPairs(int[] nums1, int[] nums2) {
        a1 = nums1;
        a2 = nums2;    
        map = new HashMap<>();   
        for (int i : a2) map.put(i, map.getOrDefault(i, 0) + 1);
    }
    
    public void add(int index, int val) {
        int old = a2[index];
        map.put(old, map.get(old) - 1);
        a2[index] += val;
        map.put(a2[index], map.getOrDefault(a2[index], 0) + 1);
    }
    
    public int count(int tot) {
        int ans = 0;
        for (int i : a1) ans += map.getOrDefault(tot - i, 0); 
        return ans;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */