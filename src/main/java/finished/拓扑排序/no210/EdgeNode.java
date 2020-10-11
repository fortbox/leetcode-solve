/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.拓扑排序.no210;

import java.util.ArrayList;
import java.util.List;

public class EdgeNode {
    public int source;
    public List<Integer> desList;

    public EdgeNode(int source) {
        this.source = source;
        desList = new ArrayList<>();
    }
}
