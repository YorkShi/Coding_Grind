// 小偷找到了一个新的偷盗地点，这个地区的房子组成了一个环，
// 如果小偷同时偷窃了两个直接相邻的房子，就会触发警报器。
// 在不触发警报器的情况下，求小偷可以抢到的最多的money。

public class robber {
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        return Math.max(robber1(nums, 0, nums.length - 2), robber1(nums, 1, nums.length - 1));
    }
    public int robber1(int[] nums, int st, int ed) {
        int []res = new int[2];
        if(st == ed)
            return nums[ed];
        if(st+1 == ed)
            return Math.max(nums[st], nums[ed]);
        res[st%2] = nums[st];
        res[(st+1)%2] = Math.max(nums[st], nums[st+1]);

        for(int i = st+2; i <= ed; i++) {
            res[i%2] = Math.max(res[(i-1)%2], res[(i-2)%2] + nums[i]);

        }
        return res[ed%2];
    }
}
