/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No1169_查询无效交易;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Solution {


    public List<String> invalidTransactions(String[] transactions) {
        ArrayList<TBean> ts = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        for (String transaction : transactions) {
            String[] ss = transaction.split(",");
            TBean bean = new TBean();
            bean.name = ss[0];
            bean.time = Integer.parseInt(ss[1]);
            bean.money = Integer.parseInt(ss[2]);
            bean.city = ss[3];
            ts.add(bean);
        }
        //1,先把超过一千的全部找出来.
        for (TBean bean : ts) {
            if (bean.money > 1000) {
                set.add(bean.toString());
            }
        }
        //2,然后遍历查.
        for (TBean tBean : ts) {
            for (TBean bean : ts) {
                if (tBean.toString().equals(bean.toString())) {
                    continue;
                }
                if (tBean.name.equals(bean.name)) {
                    if (!tBean.city.equals(bean.city)) {
                        if (Math.abs(tBean.time - bean.time) <= 60) {
                            set.add(tBean.toString());
                            set.add(bean.toString());
                        }
                    }
                }
            }
        }
        ArrayList<String> res = new ArrayList<>();
        for (String s : set) {
            res.add(s);
        }
        return res;
    }

    class TBean {
        String name;
        int time;
        int money;
        String city;

        @Override
        public String toString() {
            return name + "," + time + "," + money + "," + city;
        }
    }
}