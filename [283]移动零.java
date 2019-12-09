//给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。 
//
// 示例: 
//
// 输入: [0,1,0,3,12]
//输出: [1,3,12,0,0] 
//
// 说明: 
//
// 
// 必须在原数组上操作，不能拷贝额外的数组。 
// 尽量减少操作次数。 
// 
// Related Topics 数组 双指针



//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void moveZeroes(int[] nums) {
        while (true) {
            int a = findFirstZero(nums);
            if (a == -1) return;
            int b = findNotZero(a + 1, nums);
            if (b == -1) return;
            // 返回 -1 代表找不到.
            changePosition(a, b, nums);
        }

    }

    /**
     * 交换数组中两个数的位置
     * @param a
     * @param b
     * @param nums
     */
    private void changePosition(int a, int b, int[] nums) {
        int i = nums[a];
        nums[a] = nums[b];
        nums[b] = i;
    }

    /**
     * 寻找从 from 开始的非零位置
     * @param from
     * @param nums
     * @return
     */
    private int findNotZero(int from, int[] nums) {
        for(int i = from; i < nums.length; i++){
            if(nums[i] != 0)
                return i;
        }
        return -1;
    }

    private int findFirstZero(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0)
                return i;
        }
        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
