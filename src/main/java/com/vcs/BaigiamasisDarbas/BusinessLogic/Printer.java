package com.vcs.BaigiamasisDarbas.BusinessLogic;

import com.vcs.BaigiamasisDarbas.ExcelReader.MapPrinter;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.io.IOException;

public class Printer {

   public void printAllevents() throws IOException, InvalidFormatException {

       MapPrinter newPrinter = new MapPrinter();
       System.out.println("Darbuotojai, kurie nesuvedė valandų: ");
       System.out.println();
       newPrinter.getNullHours();
       System.out.println();
       System.out.println("Darbuotojai, kurie supildė per daug valandų, nei jiems yra leidžiama:");
       System.out.println();
       newPrinter.getOvertime();
       System.out.println();
       System.out.println("Darbuotojai, kurie supildė teisingai:");
       System.out.println();
       newPrinter.getValidHours();
       System.out.println();
       System.out.println("Darbuotojai, kurių nebuvo sąraše:");
       System.out.println();
       newPrinter.getNewID();

    }





}
