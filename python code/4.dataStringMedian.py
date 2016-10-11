"""
持续给出数字，返回每次新增一个新的数时当前数组内的中位数。

注：中位数是指 排好序的数组中位于中间位置的数。
如果数组nums（已排好序）有n个数，那么其中位数是nums[(n - 1) / 2]。
比如，nums = [1, 2, 3]， 中位数是2；如果nums = [1, 19]，那么中位数是1。

Example：
持续给出的数字是：[4, 5, 1, 3, 2, 6, 0]，那么得到的中位数列表就是 [4, 4, 4, 3, 3, 3, 3]。

"""

import heapq
class Solution:
    """
    @param nums: A list of integers.
    @return: The median of numbers
    """

    minHeap, maxHeap = [], []
    numbers = 0
    def medianII(self, nums):
        ans = []
        for item in nums:
            self.add(item)
            ans.append(self.getMedian())
        return ans


    def getMedian(self):
        return -self.maxHeap[0]

    def add(self, value):
        if self.numbers % 2 == 0:
            heapq.heappush(self.maxHeap, -value)
        else:
            heapq.heappush(self.minHeap, value)
        self.numbers += 1
        if len(self.minHeap)==0 or len(self.maxHeap)==0:
            return

        if -self.maxHeap[0] > self.minHeap[0]:
            maxroot = -self.maxHeap[0]
            minroot = self.minHeap[0]
            heapq.heapreplace(self.maxHeap, -minroot)
            heapq.heapreplace(self.minHeap, maxroot)
            #print minroot, maxroot
