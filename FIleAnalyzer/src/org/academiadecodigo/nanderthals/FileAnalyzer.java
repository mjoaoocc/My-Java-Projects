package org.academiadecodigo.nanderthals;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileAnalyzer {

    public static void main(String[] args) {
        FileAnalyzer analyzer = new FileAnalyzer();
        String file = "/Users/codecadet/Desktop/GitRepos/MyBrilliantWork/FIleAnalyzer/src/org/academiadecodigo/nanderthals/file.txt";
        String file2 = "/Users/codecadet/Desktop/GitRepos/MyBrilliantWork/FIleAnalyzer/src/org/academiadecodigo/nanderthals/file2.txt";


        try {

            int wordCount = analyzer.countWords(file);
            System.out.println("Word count in " + file + ": " + wordCount);


            int n = 5;
            Optional<String> longWord = analyzer.findLongWord(file, n);
            longWord.ifPresent(word -> System.out.println("First word longer than " + n + " characters in " + file + ": " + word));


            List<String> longestWords = analyzer.getLongestWords(file);
            System.out.println("Longest words in " + file + ": " + longestWords);


            Set<String> commonWords = analyzer.findCommonWords(file, file2);
            System.out.println("Common words between " + file + " and " + file2 + ": " + commonWords);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int countWords(String filename) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            return (int) reader.lines()
                    .flatMap(line -> Stream.of(line.split("\\s+")))
                    .count();
        }
    }

    public Optional<String> findLongWord(String filename, int minLength) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            return reader.lines()
                    .flatMap(line -> Stream.of(line.split("\\s+")))
                    .filter(word -> word.length() > minLength)
                    .findFirst();
        }
    }

    public List<String> getLongestWords(String filename) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            return reader.lines()
                    .flatMap(line -> Stream.of(line.split("\\s+")))
                    .collect(Collectors.groupingBy(
                            String::length,
                            TreeMap::new,
                            Collectors.toList()))
                    .lastEntry()
                    .getValue();
        }
    }

    public Set<String> findCommonWords(String filename1, String filename2) throws IOException {
        Set<String> wordsFromFile1 = getWords(filename1);
        Set<String> wordsFromFile2 = getWords(filename2);

        return wordsFromFile1.stream()
                .filter(wordsFromFile2::contains)
                .collect(Collectors.toSet());
    }

    private Set<String> getWords(String filename) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            return reader.lines()
                    .flatMap(line -> Stream.of(line.split("\\s+")))
                    .collect(Collectors.toSet());
        }
    }
}












/*

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileAnalyzer {
    public static void main(String[] args) {
        FileAnalyzer fileAnalyzer = new FileAnalyzer();
        String file1 = "text.txt";
        try {
            int wordCount = fileAnalyzer.countWords(file1);
            System.out.println("Word count is: " + file1 + ": " + wordCount);

            int n = 5;
            Optional<String> longWord = fileAnalyzer.findLongWord(file1, n);
            longWord.ifPresent(word -> System.out.println("First word longer than " + n + " characters in " + file1 + ": " + word));

            List<String> longestWords = fileAnalyzer.getLongestWords(file1);
            System.out.println("The longest words in " + file1 + " are: " + longestWords);




        };

        public int countWords(String fileName) throws IOException {
            try (BufferedReader reader = new BufferedReader(new BufferedReader(filename))) {
                return (int) reader.lines()
                        .flatMap(line -> Stream.of(line.split("\\s+")))
                        .count();
            }
        }

        public Optional<String> findLongWord(String filename, int minLength) throws IOException{
            try(BufferedReader reader = new BufferedReader(new FileReader(filename))){
                return reader.lines()
                        .flatMap(line -> Stream.of(line.split("\\s+")))
                        .filter(word -> word.length() > minLength)
                        .findFirst();
            }
        }

        public List<String> getLongestWords(String filename) throws IOException{
            try(BufferedReader reader = new BufferedReader(new FileReader(filename))){
                return reader.lines()
                        .flatMap(line -> Stream.of(line.split("\\s+")))
                        .collect(Collectors.groupingBy(String::length, TreeMap:: new, Collectors.toList()))
                            .lastEntry()
                            .getValue();
        }
    }
}
*/

