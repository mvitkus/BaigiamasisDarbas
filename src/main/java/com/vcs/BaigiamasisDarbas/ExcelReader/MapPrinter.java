package com.vcs.BaigiamasisDarbas.ExcelReader;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.io.IOException;
import java.util.HashMap;

public class MapPrinter {

    private MapCreator list = new MapCreator();

    public void printDarbuotojaiMap() throws IOException, InvalidFormatException {


        HashMap<String, String> mapFromDarbuotojai = (HashMap<String, String>) list.printMapFromDarbuotojai();
        System.out.println("Darbuotojai : Salis");
        mapFromDarbuotojai.forEach((key, value) -> System.out.println(key + " : " + value));
    }

    public void printDarboValandosMap() throws IOException, InvalidFormatException {
        HashMap<String, Double> mapFromDarboValandos = (HashMap<String, Double>) list.printMapFromDarboValandos();
        System.out.println("Darbuotojai : Valandos");
        mapFromDarboValandos.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
