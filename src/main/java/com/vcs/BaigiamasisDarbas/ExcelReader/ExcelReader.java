package com.vcs.BaigiamasisDarbas.ExcelReader;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExcelReader {

	public static List<List<String>> getList(String filename) throws IOException, InvalidFormatException {

		Workbook workbook = WorkbookFactory.create(new File(filename));

		workbook.sheetIterator();

		List<List<String>> sheetData = new ArrayList<>();

		Sheet sheet = workbook.getSheetAt(0);

		DataFormatter dataFormatter = new DataFormatter();

		Iterator<Row> rowIterator = sheet.rowIterator();
		while (rowIterator.hasNext()) {
			Row row = rowIterator.next();

			Iterator<Cell> cellIterator = row.cellIterator();
			List<String> data = new ArrayList<>();

			while (cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
				String cellValue = dataFormatter.formatCellValue(cell);
				// System.out.print(cellValue + "\t");
				data.add(cellValue);
			}

			sheetData.add(data);
			workbook.close();

		}

		return sheetData;

	}

}