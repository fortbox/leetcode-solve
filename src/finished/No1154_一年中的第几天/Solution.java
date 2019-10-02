package finished.No1154_一年中的第几天;

class Solution {
    public int dayOfYear(String date) {
        String[] ss = date.split("-");
        return Integer.parseInt(ss[2]) + calculateDay(ss[1], judgeLeapYear(ss[0]));
    }

    private boolean judgeLeapYear(String year) {
        int y = Integer.parseInt(year);
        if (y % 100 == 0) {
            return y % 400 == 0;
        } else {
            return y % 4 == 0;
        }
    }

    private int calculateDay(String month, boolean leap) {
        int m = Integer.parseInt(month);
        int num = 0;
        switch (m) {
            case 1:
                num = 0;
                break;
            case 2:
                num = 31;
                break;
            case 3:
                num = 31 + 28;
                break;
            case 4:
                num = 31 + 28 + 31;
                break;
            case 5:
                num = 31 + 28 + 31 + 30;
                break;
            case 6:
                num = 31 + 28 + 31 + 30 + 31;
                break;
            case 7:
                num = 31 + 28 + 31 + 30 + 31 + 30;
                break;
            case 8:
                num = 31 + 28 + 31 + 30 + 31 + 30 + 31;
                break;
            case 9:
                num = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
                break;
            case 10:
                num = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
                break;
            case 11:
                num = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
                break;
            case 12:
                num = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
                break;
            default:
                break;
        }
        if (leap && m > 2) {
            num += 1;
        }
        return num;
    }

}
