/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no210;

import java.util.ArrayList;
import java.util.List;

public class EdgeNode {
    int source;
    List<Integer> desList;

    public EdgeNode(int source) {
        this.source = source;
        desList = new ArrayList<>();
    }
}
