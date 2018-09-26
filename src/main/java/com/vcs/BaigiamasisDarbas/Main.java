package com.vcs.BaigiamasisDarbas;

import com.vcs.BaigiamasisDarbas.ExcelReader.MapCreator;
import com.vcs.BaigiamasisDarbas.ExcelReader.MapPrinter;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.io.IOException;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException, InvalidFormatException {


        MapPrinter print = new MapPrinter();
        print.printDarboValandosMap();
        System.out.println("-----------------");
        print.printDarbuotojaiMap();


    }
}
