package org.ssglobal.training.codes.io;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.print.Book;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.attribute.AttributeSet;
import javax.print.attribute.HashAttributeSet;
import javax.print.attribute.standard.ColorSupported;

public class PrintEpsonData {

	public static void main(String[] args) {
		
	    try {
			Printing.printer("Hello World", true, "EPSON L360 Series");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (PrinterException e) {
			e.printStackTrace();
		}

	}
	
}

class Printing implements Printable {
	private String stringToPrint;

	public Printing(String stringToPrint) {
		this.stringToPrint = stringToPrint;
	}

	@Override
	public int print(Graphics g, PageFormat pf, int pageIndex) throws PrinterException {
		if (pageIndex >= 1) {
			return Printable.NO_SUCH_PAGE;
		}
		Paper paper = new Paper();
		double margin = 0;
		paper.setImageableArea(margin, margin, 612.0, 792.0);
		pf.setPaper(paper);
		g.setColor(Color.black);
		g.setFont(new Font(Font.MONOSPACED, Font.BOLD, 13));
		g.translate(0, 0);
		String printers = paper.getImageableHeight() + " " + paper.getImageableWidth() + "---" + pf.getHeight() + " "
				+ pf.getWidth();
		Writer fw = null;
		try {
			fw = new OutputStreamWriter(new FileOutputStream("printingData.txt"), StandardCharsets.UTF_8);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter writer = new PrintWriter(bw);
		writer.print(printers);
		writer.close();
		int x = 0;
		int y = 100;
		for (String line : stringToPrint.split("\n")) {
			g.drawString(line, x, y += g.getFontMetrics().getHeight());
		}
		return Printable.PAGE_EXISTS;
	}

	public static void printer(String printerData, Boolean bill, String designatedPrinter)
			throws IOException, PrinterException {
		try {

			PrintService printService = PrintServiceLookup.lookupDefaultPrintService();
			PrintService designatedService = null;
			PrintService[] printServices = PrintServiceLookup.lookupPrintServices(null, null);
			AttributeSet aset = new HashAttributeSet();
			aset = new HashAttributeSet();
			aset.add(ColorSupported.NOT_SUPPORTED);
			String printers = "";
			for (int i = 0; i < printServices.length; i++) {
				printers += " service found " + printServices[i].getName() + "\n";
			}
			for (int i = 0; i < printServices.length; i++) {
				System.out.println(" service found " + printServices[i].getName());
				if (printServices[i].getName().equalsIgnoreCase(designatedPrinter)) {
					System.out.println("I want this one: " + printServices[i].getName());
					designatedService = printServices[i];
					break;
				}
			}
			Writer fw = new OutputStreamWriter(new FileOutputStream("printing.txt"), StandardCharsets.UTF_8);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter writer = new PrintWriter(bw);
			writer.print(printers);
			writer.close();
			PrinterJob pj = PrinterJob.getPrinterJob();
			pj.setPrintService(designatedService);
			Printable painter;

			// Specify the painter
			painter = new Printing(printerData);
			pj.setPrintable(painter);
			PageFormat pf0 = pj.defaultPage();
			Paper p = pf0.getPaper();
			p.setImageableArea(0, 0, pf0.getWidth(), pf0.getHeight());
			pf0.setPaper(p);
			pj.validatePage(pf0);
			Book book = new Book();
			book.append(painter, pj.validatePage(pf0));
			pj.setPageable(book);
			pj.print();

		} catch (PrinterException e) {
			Writer fw = new OutputStreamWriter(new FileOutputStream("log.txt", true), StandardCharsets.UTF_8);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter writer = new PrintWriter(bw);
			e.printStackTrace(writer);
			writer.close();
		}
	}
}