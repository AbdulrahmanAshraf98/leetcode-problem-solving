class Solution {
    public void moveZeroes(int[] nums) {
        Queue<Integer> queue = new LinkedList<>();
        for (int num : nums) {
            if (num != 0) {
                queue.add(num);
            }
        }
        int i = 0;
        while (!queue.isEmpty()) {
            nums[i++] = queue.poll();
        }

        while (i < nums.length) {
            nums[i++] = 0;
        }

    }
}