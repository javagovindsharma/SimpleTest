/**
 * 27-Sep-201810:55:56 PM
 */

/**
 * @author Govind
 *
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test02 {

	public static final String FILENAME = "/home/tattva/empData.dat";

	public static void main(String[] args) {
		String content = "";
		content = new Test02().readData();
		System.out.println("input : " + content);
		new Test02().createFileEmp(content);
		System.out.println("-----------\n");
	}

	public String readData() {
     boolean flag=true;
		String content = "";
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Employe Details");

		while (flag) {

			System.out.println("Enter Emp No");
			String id = sc.nextLine();
			System.out.println("Enter  Employee Name");
			String name = sc.nextLine();
			System.out.println("Enter Employee Salary");
			String sal = sc.nextLine();

			content = content + id + ":" + name + ":" + sal + "\n";
			System.out.println("You Want to Exit press Y");
			String input = sc.nextLine();
			if ("Y".equalsIgnoreCase(input)) {
				System.out.println("Exit!");
				flag=false;
			}
		}
		return content;
	}

	public String createFileEmp(String content) {
		BufferedWriter bw = null;
		FileWriter fw = null;
		String msg = "failed";
		try {
			fw = new FileWriter(FILENAME);
			bw = new BufferedWriter(fw);

			bw.write(content);
			System.out.println("Done");
			msg = "done";
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null)
					bw.close();
				if (fw != null)
					fw.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}

		}
		return msg;
	}
}
