// Generic union method and program to exercise it - pages 129 - 130
package org.effectivejava.examples.chapter05.item27.kodcu.questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class KelimeBirlestirmece {


    public static Set birlestir(Set s1, Set s2) {
        Set result = new HashSet(s1);
        result.addAll(s2);
        return result;

    }


    public static void main(String[] args) {
        Set<String> isimler = new HashSet<String>(Arrays.asList("Tom", "Mehmet",
                "Cuneyt"));
        Set<String> soyadlar = new HashSet<String>(Arrays.asList("Sonmez", "Ates",
                "Ot"));

        // TODO
/*
        Set<Integer> ints = new HashSet<Integer>(Arrays.asList(12, 13, 14));
        Set<Integer> go = birlestir(isimler, ints);
        for (Integer intValue : go) {
            System.out.println(intValue);
        }

*/


        Set<String> aflCio = birlestir(isimler, soyadlar);
        System.out.println(aflCio);
    }
}
