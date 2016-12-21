LintCode Coding interview questions online training system
Language
Problem
Ladder
Nine Chapter
Medium Longest Substring with At Most K Distinct Characters RPIVATE  edit Show result

92% Accepted
Given a string, find the length of the longest substring T that contains at most k distinct characters.

Example
For example, Given s = "eceba", k = 3,

T is "eceb" which its length is 4.

Tags Expand


1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
class Solution:
    # @param s : A string
    # @return : An integer
    def lengthOfLongestSubstringKDistinct(self, s, k):
        if k == 0:
            return 0

        hash = {}
        head, tail = 0, 0
        longest = 0
        while head < len(s):
            while head < len(s) and (s[head] in hash or len(hash) < k):
                hash.setdefault(s[head], 0)
                hash[s[head]] += 1
                head += 1
            longest = max(longest, head - tail)
            while tail < head and len(hash) == k:
                hash[s[tail]] -= 1
                if hash[s[tail]] == 0:
                    del hash[s[tail]]
                tail += 1
        return longest
Reset  
