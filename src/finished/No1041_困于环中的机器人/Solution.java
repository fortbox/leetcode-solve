package finished.No1041_困于环中的机器人;

class Solution {

    public static void main(String[] args) {
        String s = "GLRLLGLL";
        System.out.println(isRobotBounded(s));
    }

    /**
     * 要记录上次的方向
     * 如果起始的方向和结束的方向不一致则,一定可以到达.
     */
    public static boolean isRobotBounded(String instructions) {
        //起始方向
        String start = "10";
        String before = "10";
        String now = "10";
        int[] point = {0, 0};
        for (int i = 0; i < instructions.length(); i++) {
            char c = instructions.charAt(i);
            now = calculateNewOrientation(before, c);
            if (before.equals(now)) {
                switch (before) {
                    case "10":
                        point[0]++;
                        break;
                    case "-10":
                        point[0]--;
                        break;
                    case "01":
                        point[1]++;
                        break;
                    case "0-1":
                        point[1]--;
                        break;
                    default:
                        break;
                }
            }
            System.out.println("now = " + now);
            before = now;
        }
        System.out.println("now = " + now);
        System.out.println("before = " + before);
        return !start.equals(now) || (point[0] == 0 && point[1] == 0);
    }

    private static String calculateNewOrientation(String before, char step) {
        if (step == 'G') {
            return before;
        }
        if (step == 'L') {
            switch (before) {
                case "10":
                    return "01";
                case "-10":
                    return "0-1";
                case "01":
                    return "-10";
                case "0-1":
                    return "10";
                default:
                    return null;
            }
        }
        if (step == 'R') {
            switch (before) {
                case "10":
                    return "0-1";
                case "-10":
                    return "01";
                case "01":
                    return "10";
                case "0-1":
                    return "-10";
                default:
                    return null;
            }
        }
        return null;
    }
}
