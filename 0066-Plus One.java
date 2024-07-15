class Solution {
    public int[] plusOne(int[] arr) {
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i]++;
                return arr;
            }
            arr[i] = 0;
        }
        
        int[] newArr = new int[n + 1];
        newArr[0] = 1;
        return newArr;
        }
    }
