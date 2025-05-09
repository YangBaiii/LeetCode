class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length, add = 0;
        List<Integer> list = new LinkedList<>();
        for (int i = len - 1; i >= 0; i--) {
            int num = digits[i] + add;
            if (i == len - 1) num++;
            add = num > 9 ? 1 : 0;
            num = num > 9 ? num - 10 : num;
            list.add(0, num);
        }
        if (add == 1) list.add(0, 1);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}