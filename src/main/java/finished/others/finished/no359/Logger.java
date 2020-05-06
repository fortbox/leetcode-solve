/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.no359;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Logger {
    List<Log> list;

    public Logger() {
        list = new ArrayList<>();

    }

    public boolean shouldPrintMessage(int timestamp, String message) {
        boolean f = true;
        list = list.stream().filter(log -> log.time + 10 > timestamp).collect(Collectors.toList());
        for (Log log : list) {
            if (message.equals(log.message)) {
                if (log.canPrint) {
                    list.add(new Log(timestamp, message, false));
                    return false;
                }
            }
        }
        list.add(new Log(timestamp, message, true));
        return true;
    }

    private class Log {
        public int time;
        public String message;
        public boolean canPrint;

        public Log(int time, String message, boolean canPrint) {
            this.time = time;
            this.message = message;
            this.canPrint = canPrint;
        }
    }
}
