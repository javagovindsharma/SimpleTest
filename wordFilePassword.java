package test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.record.crypto.Biff8EncryptionKey;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.usermodel.Range;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class WordTest {

       public static void main(String[] args) throws IOException {
	   FileInputStream in = new FileInputStream("D:\\govind.doc");    

	   BufferedInputStream bin = new BufferedInputStream(in);            
	   POIFSFileSystem poiFileSystem = new POIFSFileSystem(bin);

	   Biff8EncryptionKey.setCurrentUserPassword("P@ssw0rd");
	   HWPFDocument doc = new HWPFDocument(poiFileSystem);            
	   Range range = doc.getRange();

	   FileOutputStream out = new FileOutputStream("D:\\govind.doc");
	   doc.write(out);
	   out.close();
    }
}
	
