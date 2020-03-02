package com.pdfEditor.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;


public class App {
	public static void main(String[] args) throws DocumentException, IOException {
		String sourceFileName = "/home/swat/dummy.pdf";
		String destinationFileName = "/home/swat/dummy2.pdf";		
		String story = "";
		int numberOfPages=0;
		List<Paragraph> paragraphList=new ArrayList<Paragraph>();
		PdfReader reader=new PdfReader(sourceFileName);
		numberOfPages=reader.getNumberOfPages();
		
		for(int i=1;i<=numberOfPages;i++) {
			Paragraph paragraph=new Paragraph();
			String pageContent=PdfTextExtractor.getTextFromPage(reader, i);
			pageContent=pageContent.replace("Dummy", "swat");
			paragraph.add(pageContent);
			paragraphList.add(paragraph);
		}

//		FileOutputStream fos = new FileOutputStream(new File(destinationFileName));
		FileOutputStream fos=new FileOutputStream(new File(sourceFileName));
		Document doc = new Document();
		Font font = new Font(Font.FontFamily.TIMES_ROMAN, 11, Font.NORMAL, new BaseColor(0, 0, 0));
		PdfWriter.getInstance(doc, fos);
		doc.open();
		for(Paragraph p:paragraphList) {
			p.setFont(font);			
			doc.add(p);
			doc.newPage();
		}		
		doc.close();
		System.out.println("Printing completed.");
	}
}
