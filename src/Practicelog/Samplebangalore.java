package Practicelog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Samplebangalore {

	public class RemoveConsecutiveDuplicates {
		public static void main(String[] args) {
			String input = "java java is easy easy programming language language";
			String[] words = input.split(" ");
			ArrayList<String> result = new ArrayList<>();

			for (int i = 0; i < words.length - 1; i++) {
				if (!words[i].equals(words[i + 1])) {
					result.add(words[i]);
				}
			}

			result.add(words[words.length - 1]);

			String output = String.join(" ", result);
			System.out.println(output);
		}
	}

}
