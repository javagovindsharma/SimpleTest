import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;

import com.tattva.utility.SendSMS;

/**
 * 04-Sep-20186:40:55 PM
 */

/**
 * @author Govind
 *
 */
public class FirstSendSMS {

	/**
	 * @param args
	 * @throws UnsupportedEncodingException 
	 */
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		
		//new SendSMS().executePost("8090506048","0935");// new FirstSendSMS().displayData("वहम"));
	//	new FirstSendSMS().executePost("8090506048", new FirstSendSMS().stringToHex("वहम"));
	//	System.out.println(new FirstSendSMS().displayData("वहम"));
		

		String msg=stringToHex("अगर आप हिंदी शायरी को पसंद करते हैं तो आपके लिए ये पेज बहुत ही शानदार है. और ये पेज ही नहीं बल्कि ये पूरी वेबसाइट शायरी प्रेमियों के लिए हे तयार की गयी है. उम्मीद करता हूँ आपको यह शायरी संग्रह का पेज बहुत हे पसंद आएगा");
		System.out.println("msg"+msg);
		String str=new SendSMS().executeHindiPost("9910573054",msg);
		System.out.println("SMS Response "+str);
		
		//new SendSMS().executeHindiPost("8090506048", "0935 0939 092e");
		
	}

	
	
	static String stringToHex(String string) {
		  StringBuilder buf = new StringBuilder(200);
		  for (char ch: string.toCharArray()) {
		    if (buf.length() > 0)
		      buf.append("");
		    buf.append(String.format("%04x", (int) ch));
		  }
		  return buf.toString().toUpperCase();
		}
	
	
	
	
	
	//converion start
	
	
	 public static String displayData(String msg) {
         String finalSms = "";Byte high = null,low = null;
         String text = msg;Byte[] utf16=null;
         for (int i = 0; i < text.length();i++) {
             // First work out all the tricky Unicode parts...
        	 Byte codePoint = (byte) Character.codePointAt(text, i);   //text.charCodeAt(i);
             int length = 1;
             boolean surrogate = false;
             System.out.println("codePoint"+codePoint);
             int codePoints =text.codePointAt(i);
             System.out.println("int codePoint"+codePoint);
            
             if(Character.isHighSurrogate( text.charAt(i))  &&   i < text.length() - 1  && Character.isLowSurrogate(text.charAt(i)) ) {
             //if (isHighSurrogate(codePoint) && i < text.length() - 1     && isLowSurrogate(text.charCodeAt(i + 1))) {
                  high = (byte) codePoint;
                  low = (byte) Character.codePointAt(text,i+1);//    		  text.charCodeAt(i + 1);
                 codePoint = (byte) combineSurrogates(high, low);    // combineSurrogates(high, low);
                 length = 2;
                 surrogate = true;
             }
             
             if(surrogate)
            	 utf16= new Byte[]{ high,low};
             else	   
            	 utf16=new Byte[] {codePoint};
           
             //  utf16 = surrogate ? [high, low] : [codePoint];
             
             finalSms = finalSms + joinHex(utf16, 4);
             i += length;
             
         }
        // console.log(finalSms);
         System.out.println("finalSms"+finalSms);
         return finalSms;
         
     }
	 
	
	 public static  String toHex(Byte value, int minLength) {
         String  hex = value.toString().toUpperCase();
         if (hex.length() >= minLength) {
             return hex;
         } else {
             hex = "000000" + hex;
             return hex.substring(hex.length() - minLength);
         }
     }

     public boolean isHighSurrogate(int codeUnit) {
         return codeUnit >= 0xd800 && codeUnit <= 0xdbff;
     }

     public boolean isLowSurrogate(int codeUnit) {
         return codeUnit >= 0xdc00 && codeUnit <= 0xdfff;
     }

     public static int combineSurrogates(Byte high,Byte low) {
         return 0x10000 + (high - 0xd800) * 0x400 + (low - 0xdc00);
     }

     // Takes the (count) bits starting at bit (firstBit), and returns
     // that many bits as the lowest bits of the result. Javascript treats
     // bitshifting as if all values are signed 32-bit integers, but that's
     // okay in our case: we don't use more than 21 bits.
     public int extractAndShift(Byte value, int firstBit, int  count) {
         // This has the correct bottom-most bits, but also information to remove.
         int shifted = value >> (firstBit - count);
         // This is the same as (shifted), but with the bottom-most bits all cleared.
         // In other words, this is the part to remove.
         int extra = (value >> firstBit) << count;
         return shifted - extra;
     }

     // Converts a full Unicode code point (including non-BMP) to UTF- 8 as per
     // , but only the first four
     // rows as we don't understand values above U+10FFFF anyway.
     public int[] toUtf8(Byte codePoint) {
         if (codePoint < 0x80) {
             return new int[] {codePoint};
         } else if (codePoint < 0x800) {
             return  new int[] {0xc0 | extractAndShift(codePoint, 11, 5), 0x80 | extractAndShift(codePoint, 6, 6)};
         } else if (codePoint < 0x10000) {
             return  new int[] {0xe0 | extractAndShift(codePoint, 16, 4), 0x80 | extractAndShift(codePoint, 12, 6), 0x80 | extractAndShift(codePoint, 6, 6)};
         } else {
             return  new int[] {0xf0 | extractAndShift(codePoint, 21, 3),0x80 | extractAndShift(codePoint, 18, 6),0x80 | extractAndShift(codePoint, 12, 6), 0x80 | extractAndShift(codePoint, 6, 6)};
         }
     }

     public static String joinHex(Byte array[], int hexLength) {
         String result = "";
         for (int i = 0; i < array.length; i++) {
             if (i != 0) {
                 result += " ";
             }
             result += toHex(array[i], hexLength);
         }
         return result;
     }

    
	
	
	
	
	
	//conversion stop
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String executePost(String mobileNumber, String message) throws UnsupportedEncodingException {

		System.out.println("executePost start");
		HttpURLConnection connection = null;
		StringBuilder response = null;
		String targetURL = "http://103.16.101.52:8080/sendsms/bulksms?";

		String urlParameters = "username=govinduser&password=govindpwd&type=2&dlr=1&destination=" + mobileNumber
				+ "&source=ASHAIN&message=" + message;

		String msg = "";
		try {
			// Create connection
			URL url = new URL(targetURL);
			connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("POST");
			connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
			connection.setRequestProperty("Content-Length", Integer.toString(urlParameters.getBytes().length));
			connection.setRequestProperty("Content-Language", "en-US");

			connection.setUseCaches(false);
			connection.setDoOutput(true);

			// Send request
			DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
			wr.writeBytes(urlParameters);
			wr.close();

			// Get Response
			InputStream is = connection.getInputStream();
			BufferedReader rd = new BufferedReader(new InputStreamReader(is));
			response = new StringBuilder(); // or StringBuffer if Java version 5+
			String line;
			while ((line = rd.readLine()) != null) {
				response.append(line);
				response.append('\r');
			}

			msg = response.toString();
			rd.close();

		} catch (Exception e) {
			e.printStackTrace();

			msg = "Technical SMS Problem";

		} finally {
			if (connection != null) {
				connection.disconnect();
			}
		}
		System.out.println("executePost End"+msg);
		return msg;
	}

}
