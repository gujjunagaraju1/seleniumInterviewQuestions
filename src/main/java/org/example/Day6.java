package org.example;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Day6 {
    //How to read the propertie file
    public static void main(String[] args) {
        Properties properties=new Properties();
        try {
            properties.load(new FileInputStream("src/main/resources/abc.properties"));
            System.out.println(properties.getProperty("browser"));
        }catch(IOException e){
            throw new RuntimeException("Doesn't exist");
        }

    }

}
