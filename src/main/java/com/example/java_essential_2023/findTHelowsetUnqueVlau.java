package com.example.java_essential_2023;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class findTHelowsetUnqueVlau {

public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;

        while ((line = in.readLine()) != null) {
        String[] numbers = line.split(" ");
        List<String> uniqueNum = new ArrayList<>();
        Map<String, Integer> map = new LinkedHashMap<>();

        for (String number : numbers) {
        map.put(number, map.getOrDefault(number, 0) + 1);
        if (map.get(number).equals(1)) {
        uniqueNum.add(number);
        } else {
        uniqueNum.remove(number);
        }
        }

        int lowestUniqueNumber = 0;
        for (String uniqueNumber : uniqueNum) {
        if (map.get(uniqueNumber).equals(1)) {
        lowestUniqueNumber = Integer.parseInt(uniqueNumber);
        break;
        }
        }

        System.out.println(lowestUniqueNumber);
        }
        }
}
