class Solution {
    public String pushDominoes(String dominoes) {
        String[] arr = new String[dominoes.length()];
        StringBuilder sb = new StringBuilder();
        int lastRight = -1;
        for (int i = 0; i < dominoes.length(); i++) {
            char c = dominoes.charAt(i);
            if (c == 'L') {
                if (lastRight < 0) {
                    for (int j = 0; j <= i; j++) arr[j] = "L"; 
                } else {
                    int sum = i + lastRight;
                    int mid = sum % 2 == 0 ? sum / 2 : sum / 2 + 1;
                    for (int j = lastRight; j < mid; j++) {
                        arr[j] = "R";
                    }
                    for (int j = mid; j <= i; j++) {
                        arr[j] = "L";
                    }
                    if (sum % 2 == 0) arr[mid] = ".";
                    lastRight = -1;
                }
            } else if (c == 'R') {
                lastRight = i;
                arr[i] = "R";
            } else arr[i] = ".";
        }
        if (lastRight > 0) {
            for (int i = lastRight; i < dominoes.length(); i++) {
                arr[i] = "R";
            }
        }
        for (String s : arr) sb.append(s);
        return sb.toString();
    }
}