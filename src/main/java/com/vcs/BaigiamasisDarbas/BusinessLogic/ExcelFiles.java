package com.vcs.BaigiamasisDarbas.BusinessLogic;

import com.vcs.BaigiamasisDarbas.ExcelReader.ExcelReader;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.io.IOException;
import java.util.ArrayList;


public class ExcelFiles {


    private static String DarboValandos = "DarboValandos.xls";
    private static String Darbuotojai = "Darbuotojai1.xlsx";


    public static ArrayList<String> getDataFromDarboValandos() throws IOException, InvalidFormatException {


        ArrayList<String> manopvz = ExcelReader.GetList(DarboValandos);

        return manopvz;
    }

    public static ArrayList<String> getDataFromDarbuotojai() throws IOException, InvalidFormatException {


        ArrayList<String> manopvz2 = ExcelReader.GetList(Darbuotojai);
        return manopvz2;
    }



}
