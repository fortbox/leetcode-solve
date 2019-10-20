class Solution {
    public static void main(String[] args) {
        int[] ratings = {1, 2, 87, 87, 87, 2, 1};
        int sum = candy(ratings);
        System.out.println("sum = " + sum);
    }

    public static int candy(int[] ratings) {
        int[] candyArray = new int[ratings.length];
        candyArray[0] = 1;
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candyArray[i] = candyArray[i - 1] + 1;
            } else if (ratings[i] == ratings[i - 1]) {
                candyArray[i] = 1;
            } else {
                candyArray[i] = 1;
                for (int j = i; j - 1 >= 0; j--) {
                    if (ratings[j - 1] > ratings[j] && candyArray[j - 1] <= candyArray[j]) {
                        candyArray[j - 1] += 1;
                    } else {
                        break;
                    }
                }
            }
        }
        int total = 0;
        for (int i = 0; i < candyArray.length; i++) {
            total += candyArray[i];
            System.out.println(candyArray[i]);
        }
        return total;
    }
}
