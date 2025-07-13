class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int l = 0, r = 0, ans = 0;
        for (; l < players.length; l++) {
            if (r < trainers.length && players[l] <= trainers[r]) {
                r++;
                ans++;
            } else {
                while (r < trainers.length && players[l] > trainers[r]) {
                    r++;
                }
                if (r == trainers.length) break;
                else ans++;
            }
        }
        return ans;
    }
}