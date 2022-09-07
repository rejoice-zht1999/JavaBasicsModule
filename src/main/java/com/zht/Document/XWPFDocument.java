package com.zht.Document;

import org.apache.poi.xwpf.usermodel.*;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocument1;

import java.io.*;
import java.util.List;

public class XwpfDocument {

    public static void main(String[] args) throws IOException {
        System.out.println("hello git");
        /*// 获取文件输入流
        FileInputStream fileInputStream = getFileInputStream("666.docx");
        dealDocx(fileInputStream, "副本.docx");*/

    }

    private static FileInputStream getFileInputStream(String name) throws FileNotFoundException {
        String dir = XwpfDocument.class.getResource("").getPath() + name;
        FileInputStream fileInputStream = new FileInputStream(dir);
        return fileInputStream;
    }

    private static void dealDocx(InputStream inputStream, String newFileName) throws IOException {
        // 创建输出文件
        File file = new File(XwpfDocument.class.getResource("").getPath() + newFileName);

        // 获取文件输出流
        FileOutputStream fileOutputStream = new FileOutputStream(file);

        // 创建操作word的对象
        XWPFDocument wordInput = new XWPFDocument(inputStream);
        XWPFDocument wordOutput = new XWPFDocument();

        // 获取所有段落
        List<XWPFParagraph> xwpfParagraphs = wordInput.getParagraphs();

        // 迭代每一个段落
        for (XWPFParagraph xwpfParagraph : xwpfParagraphs) {

            // 原文档有多少个段落 我就创建多少个
            XWPFParagraph wordOutputParagraph = wordOutput.createParagraph();

            // 获取当前段落的所有run
            List<XWPFRun> runs = xwpfParagraph.getRuns();

            for (XWPFRun run : runs) {
                XWPFRun wordOutputParagraphRun = wordOutputParagraph.createRun();
                // 赋值
                //wordOutputParagraphRun.setText("哈哈哈哈~我修改过了");
                // 添加回车 硬回车
                //wordOutputParagraphRun.addCarriageReturn();
                //wordOutputParagraphRun.addBreak(); // 软回车
                wordOutputParagraphRun.setText(run.getText(run.getCharacterSpacing()));
            }

        }

        // 获取所有表格
        List<XWPFTable> xwpfTables = wordInput.getTables();
        for (XWPFTable xwpfTable : xwpfTables) {
            XWPFTable wordOutputTable = wordOutput.createTable();
            // 获取一个表格中的所有行
            List<XWPFTableRow> xwpfTableRows = xwpfTable.getRows();
            System.out.println("xwpfTableRows个数"+xwpfTableRows.size());
            for (XWPFTableRow xwpfTableRow : xwpfTableRows) {

                XWPFTableRow wordOutputTableRow = wordOutputTable.createRow();
                // 获取一行的所有列
                List<XWPFTableCell> xwpfTableCell = xwpfTableRow.getTableCells();
                System.out.println("xwpfTableCell个数"+xwpfTableCell.size());
                int index = 0;
                for (XWPFTableCell tableCell : xwpfTableCell) {
                    index++;
                    XWPFTableCell wordOutputTableRowCell = wordOutputTableRow.createCell();
                    // 获取单个列
                    //wordOutputTableRowCell.setText("哈哈哈哈~我修改过了");
                    System.out.println(tableCell.getText());
                    wordOutputTableRowCell.setText(tableCell.getText());
                    System.out.println("index:"+index);
                }

                wordOutputTable.removeRow(0);
            }
            //wordOutputTable.removeBorders(); 虚线边框

        }

        CTDocument1 document = wordInput.getDocument();
        System.out.println();


        wordOutput.write(fileOutputStream);
        wordInput.close();
        wordOutput.close();
        inputStream.close();
        fileOutputStream.close();

    }

}
