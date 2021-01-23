/*
 * Copyright (c) 2021
 * Author: xiaoweixiang
 */

package no1242;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * // This is the HtmlParser's API interface.
 * // You should not implement it, or speculate about its implementation
 * /
 */
interface HtmlParser {
    List<String> getUrls(String url);
}

class Solution {
    public List<String> crawl(String startUrl, HtmlParser htmlParser) {
        if (startUrl == null || htmlParser == null) return null;
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<>();
        queue.add(startUrl);
        map.put(startUrl, -1);
        while (queue.size() > 0) {
            int size = queue.size();
            CountDownLatch countDownLatch = new CountDownLatch(size);
            for (int i = 0; i < size; i++) {
                Thread thread = new Thread(() -> {
                    try {
                        String url = queue.take();
                        List<String> urls = htmlParser.getUrls(url);
                        for (String s : urls) {
                            if (s != null) {
                                if (isSame(url, s) && !map.containsKey(s)) {
                                    queue.put(s);
                                    map.put(s, -1);
                                }
                            }
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        countDownLatch.countDown();
                    }
                });
                thread.start();
            }
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return new ArrayList<>(map.keySet());
    }

    private String getHost(String url) {
        if (url == null) return null;
        int startIndex = 7;
        int endIndex = url.indexOf('/', 7);
        if (endIndex == -1) endIndex = url.length();
        return url.substring(startIndex, endIndex);
    }

    private boolean isSame(String a, String b) {
        if (a == null || b == null) {
            return Objects.equals(a, b);
        }
        return getHost(a).equals(getHost(b));
    }
}
