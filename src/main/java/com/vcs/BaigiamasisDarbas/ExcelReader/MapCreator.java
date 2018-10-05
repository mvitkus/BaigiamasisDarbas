package com.vcs.BaigiamasisDarbas.ExcelReader;

import com.vcs.BaigiamasisDarbas.BusinessLogic.ExcelFiles;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;


import java.io.IOException;
import java.util.*;

public class MapCreator {

    private String atskirtasStringas;
    private ArrayList<String> atskirtasValidusStringas;

    Map<String, Double> darbuotojaiToMap() throws IOException, InvalidFormatException {

        ArrayList<String> rows = getDataDarbuotojai();
        Map<String, Double> employeeAndCountryID = new HashMap<>();
        darbuotojaiMapParser(rows, employeeAndCountryID);
        return employeeAndCountryID;
    }


    Map<String, Double> darboValandosToMap() throws IOException, InvalidFormatException {


        ArrayList<String> rows = getDataDarboValandos();
        Map<String, Double> employeeAndWorkHours = new HashMap<>();
        darboValandosMapParser(rows, employeeAndWorkHours);
        return employeeAndWorkHours;
    }


    private void darbuotojaiMapParser(ArrayList<String> rows, Map<String, Double> employeeAndCountryID) {

        for (int counter = 1; counter < rows.size(); counter++) {
            atskirtasStringas = String.valueOf(rows.get(counter));
            String[] array = atskirtasStringas.split(", ");
            atskirtasValidusStringas = new ArrayList<>(Arrays.asList(array));
            String employeeNumber = (atskirtasValidusStringas.get(0)).replace("[", "");
            Double employeeCountryID = Double.parseDouble((atskirtasValidusStringas.get(1).replace("]", "")));
            employeeAndCountryID.put(employeeNumber, employeeCountryID);
        }
    }

    private void darboValandosMapParser(ArrayList<String> rows, Map<String, Double> employeeAndWorkHours) {
        for (int counter = 1; counter < rows.size(); counter++) {
            atskirtasStringas = String.valueOf(rows.get(counter));
            String[] array = atskirtasStringas.split(", ");
            atskirtasValidusStringas = new ArrayList<>(Arrays.asList(array));
            String employeeNumber = (atskirtasValidusStringas.get(2));
            Double lastWeekWorkHours = Double.parseDouble((atskirtasValidusStringas.get(atskirtasValidusStringas.size() - 1)).replace("]", ""));

            //Patikrinam ar nepasikartoja employeeNumber ir jei pasikartoja susumuojam lastWeekHours
            if (!employeeAndWorkHours.containsKey(employeeNumber)) {
                employeeAndWorkHours.put(employeeNumber, lastWeekWorkHours);
            } else {
                employeeAndWorkHours.put(employeeNumber, employeeAndWorkHours.get(employeeNumber) + lastWeekWorkHours);
            }

        }
    }

    private ArrayList<String> getDataDarbuotojai() throws IOException, InvalidFormatException {
         ArrayList<String> rows = ExcelFiles.getDataFromDarbuotojai();
//        ArrayList<String> rows = new ArrayList<>();
//        rows.add("[ID, Valandos, ]");
//        rows.add("[91A6037A19, 41.00, ]");
//        rows.add("[370532G773, 45.00, ]");


        return rows;
    }

    private ArrayList<String> getDataDarboValandos() throws IOException, InvalidFormatException {
        ArrayList<String> rows = ExcelFiles.getDataFromDarboValandos();
        return rows;
    }

}



