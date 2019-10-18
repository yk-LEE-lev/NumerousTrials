import com.opencsv.CSVReader;

import java.io.*;
import java.util.*;
public class Function1_merge {
	public boolean ready(String a) {
		try {
			InputStream inputS = new FileInputStream(a);
			InputStreamReader inputSR;
			inputSR = new InputStreamReader(inputS, "UTF-8");
			CSVReader reader = new CSVReader(inputSR);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}
	public boolean merge_Start(String a, String b, String c) {
			
		return true;
	}
}
