class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n; // If k is greater than n, we only need to rotate k % n steps
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        // Push the last k elements into the stack
        for (int i = n - 1; i >= n - k; i--) {
            stack.push(nums[i]);
        }
        // Enqueue the first n - k elements into the queue
        for (int i = 0; i < n - k; i++) {
            queue.offer(nums[i]);
        }

        // Pop all elements from the stack and add them to the start of the array
        for (int i = 0; i < k; i++) {
            nums[i] = stack.pop();
        }

        // Dequeue all elements from the queue and add them to the end of the array
        for (int i = k; i < n; i++) {
            nums[i] = queue.poll();
        }
    }

}