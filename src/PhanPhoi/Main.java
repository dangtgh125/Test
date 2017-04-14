package PhanPhoi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String str = "2.053824491620752354864127894651234012100214456";
		BufferedReader br = new BufferedReader(new FileReader("D:\\output.csv"));
		br.readLine();
		str = br.readLine();
		double d = Double.parseDouble(str);
		System.out.println(d);
		br.close();
	}

}
