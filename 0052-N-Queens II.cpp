class Solution {
public:
    int totalNQueens(int n) {
        vector<bool> col(n, true);
        vector<bool> mainD(2 * n - 1, true);
        vector<bool> antiD(2 * n - 1, true);
        
        int count = 0;
        bt(0, n, col, mainD, antiD, count);
        return count;
    }

    void bt(int i, int n, vector<bool>& col, vector<bool>& mainD, vector<bool>& antiD, int& count) {
        if (i == n) {
            count++;
            return;
        }

        for (int j = 0; j < n; j++) {
            if (col[j] && mainD[i + j] && antiD[i - j + n - 1]) {
                col[j] = mainD[i + j] = antiD[i - j + n - 1] = false;
                bt(i + 1, n, col, mainD, antiD, count);
                col[j] = mainD[i + j] = antiD[i - j + n - 1] = true;
            }
        }
    }
};
