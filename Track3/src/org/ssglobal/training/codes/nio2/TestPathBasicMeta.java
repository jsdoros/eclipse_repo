package org.ssglobal.training.codes.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;

public class TestPathBasicMeta {

	public static void main(String[] args) {
		
		Path nioPath = Paths.get("src/config/nio.txt");
		
		// Setters
		
		try {
			// modify the file's lastModifiedTime
			ZoneId zone = ZoneId.of("Asia/Manila");
			LocalDateTime electionDay = LocalDateTime.of(2022, Month.MAY, 9, 10, 0, 0);
			FileTime ft = FileTime.from(electionDay.toInstant(zone.getRules().getOffset(electionDay)));
			Files.setLastModifiedTime(nioPath, ft);
			
			// modify BasicFileAttributeView
			BasicFileAttributeView basicView = Files.getFileAttributeView(nioPath, BasicFileAttributeView.class);
			basicView.setTimes(ft, null, null);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		// Shortcut setter
		try {
			ZoneId zone = ZoneId.of("Asia/Manila");
			LocalDateTime juneDay = LocalDateTime.of(2022, Month.JUNE, 20, 13, 0, 0);
			FileTime ft = FileTime.from(juneDay.toInstant(zone.getRules().getOffset(juneDay)));
			Files.setAttribute(nioPath, "basic:creationTime", ft);
			// modify BasicFileAttributeView
			BasicFileAttributeView basicView = Files.getFileAttributeView(nioPath, BasicFileAttributeView.class);
			basicView.setTimes(null, null, ft);
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		
		// Getters
		try {
			BasicFileAttributes basicAtts = Files.readAttributes(nioPath, BasicFileAttributes.class);
			System.out.println(basicAtts.size());
			System.out.println(basicAtts.lastModifiedTime());
			System.out.println(basicAtts.creationTime());
			System.out.println(basicAtts.lastAccessTime());
			System.out.println(basicAtts.isDirectory());
			System.out.println(basicAtts.isRegularFile());
			System.out.println(basicAtts.isOther());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		// Shortcut Getter
		try {
			FileTime creationTime = (FileTime) Files.getAttribute(nioPath, "basic:creationTime");
			long fileSize = (long) Files.getAttribute(nioPath, "basic:size");
			System.out.println(creationTime);
			System.out.println(fileSize);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		
		//
		try {
			DosFileAttributes dosAtts = Files.readAttributes(nioPath, DosFileAttributes.class);
			System.out.println(dosAtts.size());
			System.out.println(dosAtts.lastModifiedTime());
			System.out.println(dosAtts.creationTime());
			System.out.println(dosAtts.lastAccessTime());
			System.out.println(dosAtts.isDirectory());
			System.out.println(dosAtts.isRegularFile());
			System.out.println(dosAtts.isOther());
			System.out.println(dosAtts.isReadOnly());
			System.out.println(dosAtts.isSystem());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
