package com.vcs.BaigiamasisDarbas.BusinessLogic;

import com.vcs.BaigiamasisDarbas.ExcelReader.ExcelReader;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.io.IOException;
import java.util.ArrayList;


public class ExcelFiles {


private static String darboValandos = "DarboValandos.xls";
    private static String darbuotojai = "Darbuotojai.xlsx";

    public static ArrayList getDataFromDarboValandos() throws IOException, InvalidFormatException {


        return ExcelReader.getList(darboValandos);
    }

    public static ArrayList getDataFromDarbuotojai() throws IOException, InvalidFormatException {


        return ExcelReader.getList(darbuotojai);
    }


}
