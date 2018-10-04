package com.vcs.BaigiamasisDarbas.BusinessLogic;

import com.vcs.BaigiamasisDarbas.ExcelReader.ExcelReader;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.io.IOException;
import java.util.ArrayList;


public class ExcelFiles {




    private static String DarboValandos = "src\\main\\resources\\DarboValandos.xls";
    private static String Darbuotojai = "src\\main\\resources\\Darbuotojai.xlsx";


    public static ArrayList<String> getDataFromDarboValandos() throws IOException, InvalidFormatException {


        return ExcelReader.getList(DarboValandos);
    }

    public static ArrayList<String> getDataFromDarbuotojai() throws IOException, InvalidFormatException {


        return ExcelReader.getList(Darbuotojai);
    }


}
