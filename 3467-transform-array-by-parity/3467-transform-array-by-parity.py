class Solution:
    def transformArray(self, nums: List[int]) -> List[int]:
        even = 0
        odd = 0
        result = []
        for i in nums:
            if i%2 == 0:
                even += 1
            else:
                odd += 1
        while even > 0:
            result.append(0)
            even -= 1
        while odd > 0:
            result.append(1)
            odd -= 1
        return result