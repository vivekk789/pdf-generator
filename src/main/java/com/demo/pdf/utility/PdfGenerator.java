package com.demo.pdf.utility;

import java.io.File;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class PdfGenerator {
	 private static final String FILE_NAME = "C:\\springboot1\\code\\pdf_generator\\pdfdocs\\sample2.pdf";

	   

	    public void writeUsingIText() {

	        Document document = new Document();

	        try {

	            PdfWriter.getInstance(document, new FileOutputStream(new File(FILE_NAME)));

	            //open
	            document.open();

	            Paragraph p = new Paragraph();
	            p.add("Ticket");
	            p.setAlignment(Element.ALIGN_CENTER);

	            document.add(p);

	          

	            Font f = new Font();
	            f.setStyle(Font.BOLD);
	            f.setSize(8);

	            document.add(new Paragraph("Ticket details", f));

	            PdfPTable table = new PdfPTable(2);
	            
	            table.setWidthPercentage(100);
	            
	            table.setSpacingBefore(10f);
	            table.setSpacingAfter(10f);
	            
	            PdfPCell cell1 = new PdfPCell(new Paragraph("cell 1"));
	            PdfPCell cell2 = new PdfPCell(new Paragraph("cell 2"));
	            
	            table.addCell(cell1);
	            table.addCell(cell2);
	            
	            document.add(table);
	            
	            document.close();

	            System.out.println("Done");
	         
	        } catch (Exception e) {
	            e.printStackTrace();
	        
	        }

	    }
	}

