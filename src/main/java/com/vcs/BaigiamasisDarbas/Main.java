package com.vcs.BaigiamasisDarbas;

import com.vcs.BaigiamasisDarbas.BusinessLogic.Printer;
import com.vcs.BaigiamasisDarbas.ExcelReader.MapPrinter;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class Main {

    public static void main(String[] args) throws IOException, InvalidFormatException {
 //       SpringApplication.run(Main.class, args);

        Printer print = new Printer();
        print.printAllevents();



    }
}
