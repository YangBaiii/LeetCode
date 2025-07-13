class Solution {
public:
    int matchPlayersAndTrainers(vector<int>& players, vector<int>& trainers) {
        sort(players.begin(), players.end());
        sort(trainers.begin(), trainers.end());
        
        int l = 0, r = 0, ans = 0;
        while (l < players.size() && r < trainers.size()) {
            if (players[l] <= trainers[r]) {  
                ans++;
                l++; 
            }
            r++;  
        }
        return ans;
    }
};