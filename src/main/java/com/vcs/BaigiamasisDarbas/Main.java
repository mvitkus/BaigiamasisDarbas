package com.vcs.BaigiamasisDarbas;

import com.vcs.BaigiamasisDarbas.ExcelReader.PrintList;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import java.io.IOException;
import java.util.HashMap;
public class Main {

    public static void main(String[] args) throws IOException, InvalidFormatException {



        PrintList list = new PrintList();
        HashMap<String, String> example = (HashMap<String, String>) list.printMapFromDarbuotojai();

        example.forEach((key, value) -> System.out.println(key + " : " + value));



        System.out.println("");


        HashMap<String, Double> example1 = (HashMap<String, Double>) list.printMapFromDarboValandos();

        example1.forEach((key, value) -> System.out.println(key + " : " + value));


    }
}
