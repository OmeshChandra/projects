package com.pdfEditor.test;

import java.awt.Font;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.text.PDFTextStripper;

public class Test {
	public static void main(String[] args) throws IOException {
		String sourcefileName = "/home/swat/sample.pdf";
		String destinationfileName = "/home/swat/sample2.pdf";
//		String fileName = "/home/swat/Downloads/github-git-cheat-sheet.pdf";
		int index = 0;
		PDDocument doc = PDDocument.load(new File(sourcefileName));
		PDFTextStripper textStripper = new PDFTextStripper();
		String fileContent = textStripper.getText(doc);		
		doc.close();
		
		System.out.println(fileContent);
		System.out.println("-----------------------------------------------------------");
		System.out.println("After modification");
		fileContent = fileContent.replaceAll("And", "Caze");
		System.out.println("-----------------------------------------------------------");
		System.out.println(fileContent);
		
		fileContent=fileContent.replace("\n", "").replace("\r", "");
		
		doc = new PDDocument();
		PDPage page = new PDPage();
		doc.addPage(page);
		PDPageContentStream contentStream = new PDPageContentStream(doc, page);
		contentStream.setFont(PDType1Font.TIMES_ROMAN, 12);
		contentStream.beginText();		
		contentStream.showText(fileContent);		
		contentStream.endText();
		contentStream.close();
		doc.save(destinationfileName);
		doc.close();
		System.out.println("Document printed");

	}
}
