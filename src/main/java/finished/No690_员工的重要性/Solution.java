/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No690_员工的重要性;

import java.util.ArrayList;
import java.util.List;

class Solution {
    //这种特性用队列更好
    public int getImportance(List<Employee> employees, int id) {
        if (employees.size()==0) return 0;
        int sum=0;
        List<Integer> list = new ArrayList<>();
        for (Employee employee : employees) {
            if (id==employee.id){
                sum+=employee.importance;
                list=employee.subordinates;
                break;
            }
        }
        for (Employee employee : employees) {
            if (list.contains(employee.id)){
                sum+=getImportance(employees,employee.id);
            }
        }
        return sum;
    }


    // Employee info
    class Employee {
        // It's the unique id of each node;
        // unique id of this employee
        public int id;
        // the importance value of this employee
        public int importance;
        // the id of direct subordinates
        public List<Integer> subordinates;
    }

    ;

}