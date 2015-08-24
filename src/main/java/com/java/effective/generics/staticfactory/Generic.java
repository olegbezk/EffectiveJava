package com.java.effective.generics.staticfactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Oleg on 24 Aug 2015.
 * Generic static factory
 */
public class Generic {

    //Generic static factory method
    public static <K, V> Map<K, V> newHashMap() {
        return new HashMap<K, V>();
    }

    //Parameterized type instance creation with static factory
    Map<String, List<String>> anagrams = newHashMap();

}
