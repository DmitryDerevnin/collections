package main;

import test.TestCollections;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        TestCollections testCollections = new TestCollections();
        try {
            testCollections.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
