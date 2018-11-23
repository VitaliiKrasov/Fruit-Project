package main.ua.com.soft.vitalii;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Reader {
    public static String[] read(InputStream in) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        return reader.readLine().trim().split("\\s+");
    }

}
