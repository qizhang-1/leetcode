# DFS recursively 
import collections 
class Solution():
    def subsets1(self, nums):
        res = []
        self.dfs(nums, 0, [], res)
        return res
                
    def dfs(self, nums, index, path, res):
        res.append(path)
        for i in xrange(index, len(nums)):
            self.dfs(nums, i+1, path+[nums[i]], res)


# unit test

if __name__ == "__main__":
    assert Solution().subsets1([]) == [[]]
    A1 = Solution().subsets1([1,2,3])
    a1 = [[], [1], [2], [1, 2], [3], [1, 3], [2, 3], [1, 2, 3]] 
    assert cmp(A1, a1)
