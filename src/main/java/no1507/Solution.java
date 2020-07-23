package no1507;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public String reformatDate(String date) {
        HashMap<String, Integer> monthMap = new HashMap<>();
        List<String> list=Arrays.asList("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec");
        int m=1;
        for (String s : list) monthMap.put(s,m++);
        String[] array = date.split(" ");
        array[0]=array[0].substring(0,array[0].length()-2);
        array[1]= String.valueOf(monthMap.get(array[1]));
        array[1]=array[1].length()==1?"0"+array[1]:array[1];
        array[0]=array[0].length()==1?"0"+array[0]:array[0];
        return array[2]+"-"+array[1]+"-"+array[0];
    }
}