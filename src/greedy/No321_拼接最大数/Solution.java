package greedy.No321_拼接最大数;

class Solution {
    public static void main(String[] args) {
        int[] nums1 = {4, 6, 9, 1, 0, 6, 3, 1, 5, 2, 8, 3, 8, 8, 4, 7, 2, 0, 7, 1, 9, 9, 0, 1, 5, 9, 3, 9, 3, 9, 7, 3, 0, 8, 1, 0, 9, 1, 6, 8, 8, 4, 4, 5, 7, 5, 2, 8, 2, 7, 7, 7, 4, 8, 5, 0, 9, 6, 9, 2};
        int[] nums2 = {9, 9, 4, 5, 1, 2, 0, 9, 3, 4, 6, 3, 0, 9, 2, 8, 8, 2, 4, 8, 6, 5, 4, 4, 2, 9, 5, 0, 7, 3, 7, 5, 9, 6, 6, 8, 8, 0, 2, 4, 2, 2, 1, 6, 6, 5, 3, 6, 2, 9, 6, 4, 5, 9, 7, 8, 0, 7, 2, 3};

        System.out.println("nums1.length = " + nums1.length);
        System.out.println("nums2.length = " + nums2.length);
        int k = 60;
        int[] res = maxNumber(nums1, nums2, k);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }


    public static int[] maxNumber(int[] nums1, int[] nums2, int k) {
        int[] res = new int[k];
        for (int i = 0; i <= k; i++) {
            if (i <= nums1.length && k - i <= nums2.length) {
                int[] s1 = find(nums1, i);
                int[] s2 = find(nums2, k - i);
                int[] s3 = getMax(s1, s2);
                res = cmp(s3, res);
            }
        }
        return res;
    }

    private static int[] cmp(int[] s1, int[] s2) {
        for (int i = 0; i < s1.length; i++) {
            if (s1[i] > s2[i]) {
                return s1;
            } else if (s1[i] < s2[i]) {
                return s2;
            }
        }
        return s1;
    }

    private static int[] getMax(int[] s1, int[] s2) {
        int[] res = new int[s1.length + s2.length];
        int i = 0, j = 0, k = 0;
        while (i < s1.length && j < s2.length) {
            if (s1[i] > s2[j]) {
                res[k++] = s1[i++];
            } else if (s1[i] == s2[j]) {
                if (i + 1 < s1.length && j + 1 < s2.length) {
                    int a = i + 1;
                    int b = j + 1;
                    while (a < s1.length && b < s2.length) {
                        if (s1[a] == s2[b]) {
                            a++;
                            b++;
                        } else if (s1[a] > s2[b]) {
                            res[k++] = s1[i++];
                            break;
                        } else {
                            res[k++] = s2[j++];
                            break;
                        }
                    }
                    if (a == s1.length || b == s2.length) {
                        res[k++] = s1[i++];
                    }
                } else {
                    if (i + 1 < s1.length) {
                        res[k++] = s1[i++];
                    } else if (j + 1 < s2.length) {
                        res[k++] = s2[j++];
                    } else {
                        res[k++] = s1[i++];
                    }
                }
            } else {
                res[k++] = s2[j++];
            }
        }
        if (i == s1.length) {
            if (j < s2.length) {
                for (; j < s2.length; j++) {
                    res[k++] = s2[j];
                }
            }
        } else {
            for (; i < s1.length; i++) {
                res[k++] = s1[i];
            }
        }
        return res;
    }


    private static int[] find(int[] nums, int n) {
        int k = n, j = 0, i = 0, mm = 0;
        int[] res = new int[k];
        while (k > 0) {
            int t = 0;
            i = mm;
            for (; nums.length - i >= k; i++) {
                if (nums[i] > t) {
                    t = nums[i];
                    mm = i;
                }
            }
            mm++;
            res[j++] = t;
            k--;
        }
        return res;
    }
}
