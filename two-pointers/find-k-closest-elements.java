class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int left = 0, right = arr.length - k;
        List<Integer> ans = new ArrayList<>();
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] + arr[mid+k] < 2 * x) left = mid + 1; 
            else right = mid; 
        }
        for (int i = left; i < left + k; i++) ans.add(arr[i]);
        return ans;
        // return Arrays.stream(ans, left, left + k).boxed().collect(Collectors.toList());
    }
}