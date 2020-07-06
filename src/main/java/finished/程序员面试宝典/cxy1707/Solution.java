/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.程序员面试宝典.cxy1707;

import java.util.*;

class Solution {
    public static void main(String[] args) {
        String[] names = {"Fcclu(70)",
                "Ommjh(63)", "Dnsay(60)", "Qbmk(45)", "Unsb(26)", "Gauuk(75)", "Wzyyim(34)", "Bnea(55)", "Kri(71)", "Qnaakk(76)", "Gnplfi(68)", "Hfp(97)", "Qoi(70)", "Ijveol(46)", "Iidh(64)", "Qiy(26)", "Mcnef(59)", "Hvueqc(91)", "Obcbxb(54)", "Dhe(79)", "Jfq(26)", "Uwjsu(41)", "Wfmspz(39)", "Ebov(96)", "Ofl(72)", "Uvkdpn(71)", "Avcp(41)", "Msyr(9)", "Pgfpma(95)", "Vbp(89)", "Koaak(53)", "Qyqifg(85)", "Dwayf(97)", "Oltadg(95)", "Mwwvj(70)", "Uxf(74)", "Qvjp(6)", "Grqrg(81)", "Naf(3)", "Xjjol(62)", "Ibink(32)", "Qxabri(41)", "Ucqh(51)", "Mtz(72)", "Aeax(82)", "Kxutz(5)", "Qweye(15)", "Ard(82)", "Chycnm(4)", "Hcvcgc(97)", "Knpuq(61)", "Yeekgc(11)", "Ntfr(70)", "Lucf(62)", "Uhsg(23)", "Csh(39)", "Txixz(87)", "Kgabb(80)", "Weusps(79)", "Nuq(61)", "Drzsnw(87)", "Xxmsn(98)", "Onnev(77)", "Owh(64)", "Fpaf(46)", "Hvia(6)", "Kufa(95)", "Chhmx(66)", "Avmzs(39)", "Okwuq(96)", "Hrschk(30)", "Ffwni(67)", "Wpagta(25)", "Npilye(14)", "Axwtno(57)", "Qxkjt(31)", "Dwifi(51)", "Kasgmw(95)", "Vgxj(11)", "Nsgbth(26)", "Nzaz(51)", "Owk(87)", "Yjc(94)", "Hljt(21)", "Jvqg(47)", "Alrksy(69)", "Tlv(95)", "Acohsf(86)", "Qejo(60)", "Gbclj(20)", "Nekuam(17)", "Meutux(64)", "Tuvzkd(85)", "Fvkhz(98)", "Rngl(12)", "Gbkq(77)", "Uzgx(65)", "Ghc(15)", "Qsc(48)", "Siv(47)"};
        String[] synonyms = {"(Gnplfi,Qxabri)", "(Uzgx,Siv)", "(Bnea,Lucf)", "(Qnaakk,Msyr)", "(Grqrg,Gbclj)", "(Uhsg,Qejo)", "(Csh,Wpagta)", "(Xjjol,Lucf)", "(Qoi,Obcbxb)", "(Npilye,Vgxj)", "(Aeax,Ghc)", "(Txixz,Ffwni)", "(Qweye,Qsc)", "(Kri,Tuvzkd)", "(Ommjh,Vbp)", "(Pgfpma,Xxmsn)", "(Uhsg,Csh)", "(Qvjp,Kxutz)", "(Qxkjt,Tlv)", "(Wfmspz,Owk)", "(Dwayf,Chycnm)", "(Iidh,Qvjp)", "(Dnsay,Rngl)", "(Qweye,Tlv)", "(Wzyyim,Kxutz)", "(Hvueqc,Qejo)", "(Tlv,Ghc)", "(Hvia,Fvkhz)", "(Msyr,Owk)", "(Hrschk,Hljt)", "(Owh,Gbclj)", "(Dwifi,Uzgx)", "(Iidh,Fpaf)", "(Iidh,Meutux)", "(Txixz,Ghc)", "(Gbclj,Qsc)", "(Kgabb,Tuvzkd)", "(Uwjsu,Grqrg)", "(Vbp,Dwayf)", "(Xxmsn,Chhmx)", "(Uxf,Uzgx)"};
        String[] res = trulyMostPopular(names, synonyms);
        System.out.println("res = " + Arrays.deepToString(res));
    }

    public static String[] trulyMostPopular(String[] names, String[] synonyms) {
        UnionFind<String> uf = new UnionFind<>();
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> nameList = new ArrayList<>();
        for (String name : names) {
            int a = name.indexOf('(');
            int b = name.indexOf(')');
            String ss = name.substring(0, a);
            nameList.add(ss);
        }
        System.out.println("nameList = " + nameList);
        uf.makeSet(nameList);
        for (String synonym : synonyms) {
            synonym = synonym.substring(1, synonym.length() - 1);
            System.out.println("synonym = " + synonym);
            String[] split = synonym.split(",");
            uf.union(split[0], split[1]);
        }
        for (String name : names) {
            int a = name.indexOf('(');
            int b = name.indexOf(')');
            String ss = name.substring(0, a);
            int c = Integer.parseInt(name.substring(a + 1, b));
            System.out.println("ss = " + ss);
            System.out.println("c = " + c);
            String head = uf.findHead(ss);
            map.put(head, map.getOrDefault(head, 0) + c);
        }

        ArrayList<String> fatherList = new ArrayList<>();
        for (Map.Entry<String, String> entry : uf.fatherMap.entrySet()) {
            if (entry.getKey().equals(entry.getValue())) {
                fatherList.add(entry.getKey());
            }
        }
        HashMap<String, List<String>> hashMap = new HashMap<>();
        for (String s : fatherList) {
            hashMap.put(s, new ArrayList<>(Arrays.asList(s)));
        }
        for (Map.Entry<String, String> entry : uf.fatherMap.entrySet()) {
            String key = entry.getKey();
            System.out.println("key1 = " + key);
            String father = uf.findHead(key);
            List<String> strings = hashMap.get(father);
            System.out.println("strings = " + strings);
            strings.add(entry.getKey());
            strings.sort(String::compareTo);
            hashMap.put(father, strings);
        }

        ArrayList<String> res = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            res.add(hashMap.get(key).get(0) + "(" + entry.getValue() + ")");
        }
        System.out.println("res = " + res);

        return res.toArray(new String[0]);
    }

    public static class UnionFind<T> {
        public HashMap<T, T> fatherMap; // 用来存放每个节点的头节点
        public HashMap<T, Integer> sizeMap; // 用来保存每个集合的大小

        public UnionFind() {
            fatherMap = new HashMap<T, T>();
            sizeMap = new HashMap<T, Integer>();
        }

        public void makeSet(List<T> nodes) {
            fatherMap.clear();
            sizeMap.clear();
            for (T node : nodes) {
                fatherMap.put(node, node); // 每个节点单独成为一个集合，头节点指向自己
                sizeMap.put(node, 1); // 初始化时每个集合的大小为1
            }
        }

        private T findHead(T node) {
            T father = fatherMap.get(node);
            System.out.println("node=" + node + " , father =" + father);
            if (father == null) return null;
            if (!father.equals(node)) return findHead(father);
            return father;
        }

        public boolean isSameSet(T aNode, T bNode) {
            return findHead(aNode) == findHead(bNode);
        }

        public void union(T aNode, T bNode) {
            if (aNode == null || bNode == null) {
                return;
            }
            T aHead = findHead(aNode);
            T bHead = findHead(bNode);
            if (aHead == null || bHead == null) return;
            if (!aHead.equals(bHead)) {
                int aSize = sizeMap.get(aHead);
                int bSize = sizeMap.get(bHead);
                if (aSize <= bSize) {
                    fatherMap.put(aHead, bHead);
                    sizeMap.put(bHead, aSize + bSize);
                } else {
                    fatherMap.put(bHead, aHead);
                    sizeMap.put(aHead, aSize + bSize);
                }
            }
        }
    }
}