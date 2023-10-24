package org.example.Hashmap;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

// TODO ; FIX THIS !!
class GroupAnagramsTest {
    @Test
    public void testGroupAnagrams() {
        GroupAnagrams groupAnagrams = new GroupAnagrams();

        String[] input1 = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> expectedOutput1 = new ArrayList<>();
        expectedOutput1.add(Arrays.asList("bat"));
        expectedOutput1.add(Arrays.asList("nat", "tan"));
        expectedOutput1.add(Arrays.asList("ate", "eat", "tea"));

        List<List<String>> result1 = groupAnagrams.groupAnagrams(input1);
        for (List<String> list : expectedOutput1) {
            assertTrue(result1.contains(list));
        }
        for (List<String> list : result1) {
            assertTrue(expectedOutput1.contains(list));
        }

        String[] input2 = {""};
        List<List<String>> expectedOutput2 = new ArrayList<>();
        expectedOutput2.add(Arrays.asList(""));

        List<List<String>> result2 = groupAnagrams.groupAnagrams(input2);
        for (List<String> list : expectedOutput2) {
            assertTrue(result2.contains(list));
        }
        for (List<String> list : result2) {
            assertTrue(expectedOutput2.contains(list));
        }

        String[] input3 = {"a"};
        List<List<String>> expectedOutput3 = new ArrayList<>();
        expectedOutput3.add(Arrays.asList("a"));

        List<List<String>> result3 = groupAnagrams.groupAnagrams(input3);
        for (List<String> list : expectedOutput3) {
            assertTrue(result3.contains(list));
        }
        for (List<String> list : result3) {
            assertTrue(expectedOutput3.contains(list));
        }
    }

}