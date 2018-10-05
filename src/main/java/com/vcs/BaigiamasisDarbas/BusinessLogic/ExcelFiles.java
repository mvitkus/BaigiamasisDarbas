package com.vcs.BaigiamasisDarbas.BusinessLogic;

import com.vcs.BaigiamasisDarbas.ExcelReader.ExcelReader;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelFiles implements DataFiles {

	private static String darboValandos = "DarboValandos.xls";
	private static String darbuotojai = "Darbuotojai.xlsx";

	public List<List<String>> getDataFromDarboValandos() {

		try {
			return ExcelReader.getList(darboValandos);
		} catch (InvalidFormatException | IOException e) {
			throw new RuntimeException(e);
		}
	}

	public List<List<String>> getDataFromDarbuotojai() {

		try {
			return ExcelReader.getList(darbuotojai);
		} catch (InvalidFormatException | IOException e) {
			throw new RuntimeException(e);
		}
	}

}
