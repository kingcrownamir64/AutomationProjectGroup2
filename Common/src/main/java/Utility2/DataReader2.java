package Utility2;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataReader2 {
    HSSFWorkbook wb = null;
    HSSFSheet sheet = null;
    Cell cell = null;
    FileOutputStream fio = null;
    int numberOfRows, numberOfCol, rowNum;

    public String[][] fileReader1(String path, int sheetIndex) throws IOException {
        String[][] data = {};
        File file = new File(path);
        FileInputStream fis = new FileInputStream(file);
        wb = new HSSFWorkbook(fis);
        sheet = wb.getSheetAt(sheetIndex);
        numberOfRows = sheet.getLastRowNum();
        numberOfCol = sheet.getRow(0).getLastCellNum();
        data = new String[numberOfRows + 1][numberOfCol + 1];

        for (int i = 1; i < data.length; i++) {
            HSSFRow rows = sheet.getRow(i);
            for (int j = 0; j < numberOfCol; j++) {
                HSSFCell cell = rows.getCell(j);
//                String cellData = getCellValue(cell);
//                data[i][j] = cellData;
            }
        }
        return data;
    }


    public String[] fileReader3(String path, int sheetIndex) throws IOException {
        String[] data = {};

        try {
            File file = new File(path);
            FileInputStream fis = new FileInputStream(file);
            wb = new HSSFWorkbook(fis);
            sheet = wb.getSheetAt(sheetIndex);
            int numberOfRows = sheet.getLastRowNum() + 1;
            int numberOfColumns = sheet.getRow(0).getLastCellNum();
            data = new String[numberOfRows - 1];

            for (int i = 1; i < numberOfRows; i++) {
                HSSFRow row = sheet.getRow(i);
                for (int j = 0; j < numberOfColumns; j++) {
                    HSSFCell cell = row.getCell(j);
// String cellData = getCellValue(cell);
                    data[i - 1] = cell.getStringCellValue();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}

// public String getCellValue(HSSFCell cell) {
// Object value = null;
//