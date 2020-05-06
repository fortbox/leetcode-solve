/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.No929_独特的电子邮件地址;

import java.util.HashSet;

class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();
        for (String email : emails) {
            int index = email.indexOf('@');
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < index; i++) {
                char c = email.charAt(i);
                if (c == '+') break;
                if (c == '.') continue;
                stringBuilder.append(c);
            }
            stringBuilder.append('@');
            stringBuilder.append(email.substring(index + 1));
            set.add(stringBuilder.toString());
        }
        return set.size();
    }
}
