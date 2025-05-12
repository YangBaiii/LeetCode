class Solution {
    public int[] findEvenNumbers(int[] digits) {
        List<Integer> list = new ArrayList<>();
        int[] count = new int[10];
        int[] temp = new int[10];
        for (int i : digits) count[i]++;
        for (int i = 100; i <= 999; i+=2) {
            Arrays.fill(temp, 0);
            int num = i;
            while (num > 0) {
                temp[num % 10]++;
                if (count[num % 10] < temp[num % 10]) break;
                num /= 10;
            }
            if (num == 0) list.add(i);
        }    
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}