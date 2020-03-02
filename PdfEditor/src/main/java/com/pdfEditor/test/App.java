package com.pdfEditor.test;

import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	int i=0;
        PDDocument doc=new PDDocument();        
        PDPage page=new PDPage();
        doc.addPage(page);
        PDPageContentStream contentStream=new PDPageContentStream(doc, page);
        contentStream.beginText();
        contentStream.setFont(PDType1Font.TIMES_ROMAN, 12);
        contentStream.newLineAtOffset(300, 525);
        contentStream.showText("Jai Shree Ram");
        contentStream.endText();
        contentStream.close();
        doc.save("/home/swat/krishna.pdf");        
		/*
		 * while(i<10) { PDPage page=new PDPage(); doc.addPage(page); i++; }
		 */        
        doc.close();
        System.out.println("Pdf Created");
    }
}
