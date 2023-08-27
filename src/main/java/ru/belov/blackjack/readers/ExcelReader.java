/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.belov.blackjack.readers;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Xiaomi
 */
public class ExcelReader {

    private XSSFWorkbook workbook;
    private final String fileName = System.getProperty("user.dir") + "/blackJackInfo.xlsx";

    public int[] readStartInfo() throws IOException, InvalidFormatException {
        int[] information = new int[3];
        workbook = new XSSFWorkbook(fileName);
        XSSFSheet sheet = workbook.getSheet("statistics");
        Row row = sheet.getRow(1);
        information[0] = (int) row.getCell(0).getNumericCellValue();
        information[1] = (int) row.getCell(1).getNumericCellValue();
        information[2] = (int) row.getCell(2).getNumericCellValue();
        workbook.close();
        return information;
    }

    public void saveStatistics(int winnings, int losses, int bank) throws IOException, InvalidFormatException {
        XSSFWorkbook book = new XSSFWorkbook();
        XSSFSheet sheet = book.createSheet("statistics");
        XSSFRow r = sheet.createRow(0);
        r.createCell(0).setCellValue("Победы");
        r.createCell(1).setCellValue("Поражения");
        r.createCell(2).setCellValue("Банк");

        XSSFRow r2 = sheet.createRow(1);
        r2.createCell(0).setCellValue(winnings);
        r2.createCell(1).setCellValue(losses);
        r2.createCell(2).setCellValue(bank);
        File f = new File(fileName);
        book.write(new FileOutputStream(f));
        book.close();
    }
}
