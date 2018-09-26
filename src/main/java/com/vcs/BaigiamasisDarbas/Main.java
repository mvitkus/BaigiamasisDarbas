package com.vcs.BaigiamasisDarbas;

import com.vcs.BaigiamasisDarbas.ExcelReader.PrintList;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import java.io.IOException;
import java.util.HashMap;
public class Main {

    public static void main(String[] args) throws IOException, InvalidFormatException {



        PrintList list = new PrintList();
        HashMap<String, String> mapFromDarbuotojai = (HashMap<String, String>) list.printMapFromDarbuotojai();

        mapFromDarbuotojai.forEach((key, value) -> System.out.println(key + " : " + value));



        System.out.println("");


        HashMap<String, Double> mapFromDarboValandos = (HashMap<String, Double>) list.printMapFromDarboValandos();

        mapFromDarboValandos.forEach((key, value) -> System.out.println(key + " : " + value));


    }
}
