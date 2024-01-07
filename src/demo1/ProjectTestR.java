package demo1;

import java.util.ArrayList;

public class ProjectTestR {
	public static void main(String[] args) {

		ArrayList<String> str1 = new ArrayList<String>();
		// add element to the ArryList
		str1.add("z");
		str1.add("y");
		str1.add("s");
		str1.add("r");
		System.out.println(str1);

		//remove z
		str1.remove(0);
		System.out.println(str1);

	}

}
