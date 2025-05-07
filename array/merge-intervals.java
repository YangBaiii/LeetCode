class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));
        List<int[]> ans = new LinkedList<>();
        int[] newArr = intervals[0];
        ans.add(newArr);
        for (int[] arr : intervals) {
           if (arr[0] <= newArr[1]) {
            newArr[1] = Math.max(newArr[1], arr[1]);
           } else {
            newArr = arr;
            ans.add(newArr);
           }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}