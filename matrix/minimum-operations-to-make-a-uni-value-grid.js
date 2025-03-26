/**
 * @param {number[][]} grid
 * @param {number} x
 * @return {number}
 */
var minOperations = function(grid, x) {
     let ans = 0, row = grid.length, col = grid[0].length;
        let list = [];
        for (let i = 0; i < row; i++) {
            for (let j = 0; j < col; j++) {
                list.push(grid[i][j]);
            }
        }
        list.sort((a, b) => a - b);
        let target = list[Math.floor(list.length / 2)];
        for (let num of list) {
            let diff = Math.abs(target - num);
            if (diff % x !== 0) return -1;
            ans += diff / x;
        }
        return ans;
};