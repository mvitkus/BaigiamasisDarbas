package com.vcs.BaigiamasisDarbas.BusinessLogic;

import com.vcs.BaigiamasisDarbas.ExcelReader.ExcelReader;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.io.IOException;
import java.util.ArrayList;


public class ExcelFiles {




    private static String darboValandos = "src\\main\\resources\\darboValandos.xls";
    private static String darbuotojai = "src\\main\\resources\\darbuotojai.xlsx";


    public static ArrayList<String> getDataFromDarboValandos() throws IOException, InvalidFormatException {


        return ExcelReader.getList(darboValandos);
    }

    public static ArrayList<String> getDataFromDarbuotojai() throws IOException, InvalidFormatException {


        return ExcelReader.getList(darbuotojai);
    }


}
