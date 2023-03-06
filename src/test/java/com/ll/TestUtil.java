package com.ll;

import java.io.*;
import java.util.Scanner;

public class TestUtil {

    public static Scanner genScanner(String input) {
        InputStream in = new ByteArrayInputStream(input.getBytes());

        return new Scanner(in);
    }

    public static ByteArrayOutputStream setOutToByteArray() {
    }

    public static void clearSetOutToByteArray(ByteArrayOutputStream output) {
        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));
        try {
            output.close();
        } catch(IOException e) {
            throw new RuntimeException(e)
        }
    }

    public static void clearSetOutToArray(ByteArrayOutputStream output) {
    }
}
