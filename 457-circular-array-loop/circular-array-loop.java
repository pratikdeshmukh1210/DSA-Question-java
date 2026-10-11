
class Solution {
    public boolean circularArrayLoop(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            boolean forward = nums[i] > 0;
            int curr = i;
            int step = 0;

            while (step < n) {
                int value = nums[curr];

                if (value == 0 || (value > 0) != forward) {
                    break;
                }

                int next = (curr + value) % n;

                if (next < 0) {
                    next += n;
                }

                if (next == curr) {
                    break;
                }

                curr = next;
                step++;

                if (curr == i) {
                    return true;
                }
            }
        }

        return false;
    }
}
