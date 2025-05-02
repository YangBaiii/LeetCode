class Solution {
    public String pushDominoes(String dominoes) {
        char[] arr = dominoes.toCharArray();
        int n = arr.length;
        int lastLeft = -1, lastRight = -1;

        for (int i = 0; i <= n; i++) {
            char c = (i < n) ? arr[i] : 'R'; 
            if (c == 'R') {
                if (lastRight > lastLeft) {
                    // Case: R...R — fill in all with 'R'
                    for (int j = lastRight + 1; j < i; j++) {
                        arr[j] = 'R';
                    }
                }
                lastRight = i;
            } else if (c == 'L') {
                if (lastLeft > lastRight || lastRight == -1) {
                    // Case: L...L or ...L — fill in all with 'L'
                    for (int j = lastLeft + 1; j < i; j++) {
                        arr[j] = 'L';
                    }
                } else {
                    // Case: R...L — fill in from both ends
                    int lo = lastRight + 1, hi = i - 1;
                    while (lo < hi) {
                        arr[lo++] = 'R';
                        arr[hi--] = 'L';
                    }
                    // If lo == hi, leave it as '.', balanced
                }
                lastLeft = i;
            }
        }
        return new String(arr);
    }
}
