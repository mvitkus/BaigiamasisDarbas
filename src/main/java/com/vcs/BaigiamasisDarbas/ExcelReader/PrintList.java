package com.vcs.BaigiamasisDarbas.ExcelReader;

import com.vcs.BaigiamasisDarbas.BusinessLogic.ExcelFiles;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.io.IOException;
import java.util.*;

public class PrintList {


    public PrintList() throws IOException, InvalidFormatException {
    }

    public Map<String, String> printMapFromDarbuotojai() throws IOException, InvalidFormatException {

        ArrayList<String> rows = ExcelFiles.getDataFromDarbuotojai();
        Map<String, String> employeeAndCountryID = new HashMap<>();
        for (int counter = 1; counter < rows.size(); counter++) {
            String atskirtasStringas = String.valueOf(rows.get(counter));
            String[] array = atskirtasStringas.split(", ");
            ArrayList<String> atskirtasValidusStringas = new ArrayList(Arrays.asList(array));
            String employeeNumber = (atskirtasValidusStringas.get(0)).replace("[", "");
            String employeeCountryID = (atskirtasValidusStringas.get(1).replace("]", ""));
            employeeAndCountryID.put(employeeNumber, employeeCountryID);
        }

        return employeeAndCountryID;
    }







    public Map<String, Double> printMapFromDarboValandos() throws IOException, InvalidFormatException {

        ArrayList<String> rows = ExcelFiles.getDataFromDarboValandos();

        Map<String, Double> employeeAndWorkHours = new HashMap<>();
        for (int counter = 1; counter < rows.size(); counter++) {
            String atskirtasStringas = String.valueOf(rows.get(counter));
            String[] array = atskirtasStringas.split(", ");
            ArrayList<String> atskirtasValidusStringas = new ArrayList(Arrays.asList(array));
            String employeeNumber = (atskirtasValidusStringas.get(2));
            Double lastWeekWorkHours = Double.parseDouble((atskirtasValidusStringas.get(atskirtasValidusStringas.size() - 1)).replace("]", ""));

            //Patikrinam ar nepasikartoja employeeNumber ir jei pasikartoja susumuojam lastWeekHours
            if (!employeeAndWorkHours.containsKey(employeeNumber)) {
                employeeAndWorkHours.put(employeeNumber, lastWeekWorkHours);
            } else {
                employeeAndWorkHours.put(employeeNumber, employeeAndWorkHours.get(employeeNumber) + lastWeekWorkHours);
            }

        }

        return employeeAndWorkHours;
    }


}



