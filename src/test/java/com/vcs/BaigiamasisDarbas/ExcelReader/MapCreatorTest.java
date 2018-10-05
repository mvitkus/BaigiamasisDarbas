package com.vcs.BaigiamasisDarbas.ExcelReader;

import org.junit.Assert;
import org.junit.Test;

import com.vcs.BaigiamasisDarbas.BusinessLogic.DataFiles;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MapCreatorTest {

    @Test
    public void printMapFromDarbuotojai() {
        ArrayList<String> rows = new ArrayList<>();
        rows.add("[193G371591, 40, ]");
    }

    @Test
    public void printMapFromDarboValandos() {
    	
    	MapCreator m = new MapCreator(new DataFiles() {
			
			@Override
			public List<List<String>> getDataFromDarbuotojai() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public List<List<String>> getDataFromDarboValandos() {
				// TODO Auto-generated method stub
				return null;
			}
		});
    	
    	m.darboValandosToMap();
    }
}