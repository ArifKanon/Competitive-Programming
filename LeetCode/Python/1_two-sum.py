## 1. Two Sum
## Link: https://leetcode.com/problems/two-sum/

class Solution:
    def twoSum(self, nums, target):
        for outer, outerEle in enumerate(nums):
            for inner, innerEle in enumerate(nums):
                if outer == inner:
                    continue
                if outerEle + innerEle == target:
                    return [outer, inner]
        return -1
        

obj = Solution()
result = obj.twoSum([0,1,4,8,2], 10)
print(result)


#### Optimal solution
def twoSummation(self, nums, target):
    seen = {}
    for index, value in enumerate(nums):
        remaining = target - value

        if remaining in seen:
            return [index, seen[remaining]]

        seen[value] = index