package com.vcs.BaigiamasisDarbas.ExcelReader;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.util.*;


@RestController
public class MapPrinter {

    private MapCreator list = new MapCreator();
    private Map<String, Double> darboValandos = list.printMapFromDarboValandos();
    private Map<String, Double> darbuotojai = list.printMapFromDarbuotojai();

    public MapPrinter() throws IOException, InvalidFormatException {
    }


    public void overtime(){


        final Map<String, Double> overtimeList = new HashMap<>();

        for (final String key : darbuotojai.keySet()) {
            if (darboValandos.containsKey(key) && darbuotojai.get(key) < darboValandos.get(key) && darboValandos.get(key) != 0) {
                overtimeList.put(key, darboValandos.get(key));
            }
        }
        for (Map.Entry entry : overtimeList.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " Valandos: " + entry.getValue());
        }


    }


    public void nullHours(){


        final Map<String, Double> nullHoursList = new HashMap<>();

        for (final String key : darbuotojai.keySet()) {
            if (darboValandos.containsKey(key) && darboValandos.get(key) == 0) {
                nullHoursList.put(key, darboValandos.get(key));
            }
        }
        for (Map.Entry entry : nullHoursList.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " Valandos: " + entry.getValue());
        }


    }

    public void validHours(){


        final Map<String, Double> validHoursList = new HashMap<>();
        for (final String key : darbuotojai.keySet()) {
            if (darboValandos.containsKey(key) && darbuotojai.get(key) >= darboValandos.get(key) && darboValandos.get(key) != 0) {
                validHoursList.put(key, darboValandos.get(key));
            }
        }
        for (Map.Entry entry : validHoursList.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " Valandos: " + entry.getValue());
        }


    }

    public void newID(){


        final Map<String, Double> newIdList = new HashMap<>();
        for (final String key : darboValandos.keySet()) {
            if (!darbuotojai.containsKey(key)) {
                newIdList.put(key, darboValandos.get(key));
            }

        }
        for (Map.Entry entry : newIdList.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " Valandos: " + entry.getValue());
        }

        writeNewIdToExcel(newIdList);


    }

    private void writeNewIdToExcel(Map<String, Double> newIdList) {

        Scanner input = new Scanner(System.in);

        printMsg();

        String a = input.next();


        switch (a) {
            case "Taip":
                updateCell(newIdList);
                break;
            case "Ne":
                System.out.println("Ne. tai ne");
                break;
            default:
                System.out.println("Ne ta ivedei " + a);
                break;
        }
    }

    private void printMsg() {
        System.out.println();
        System.out.println("Ar norite įrašyti naujus ID ir darbo valandas į Darbuotojų sąrašą? Taip/Ne");
    }

    private void updateCell(Map<String, Double> hm3) {

        //TODO Excel Darbuotojai sąrašo atnaujinimas.

    }


}
