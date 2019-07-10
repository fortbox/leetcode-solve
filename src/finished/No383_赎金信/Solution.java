package finished.No383_赎金信;

import java.util.ArrayList;

public class Solution {

	public static void main(String[] args) {
		String ransomNote = "fffbfg";
		String magazine = "effjfggbffjdgbjjhhdegh";
		Solution solution = new Solution();
		boolean f = solution.canConstruct(ransomNote, magazine);
		System.out.println(f);
	}

	public boolean canConstruct(String ransomNote, String magazine) {
		if (ransomNote.isEmpty() && magazine.isEmpty()) {
			return true;
		} else if (ransomNote.isEmpty() && !magazine.isEmpty()) {
			return true;
		} else if (!ransomNote.isEmpty() && magazine.isEmpty()) {
			return false;
		}
		ArrayList<String> arrayList1 = new ArrayList<>();
		ArrayList<String> arrayList2 = new ArrayList<>();
		for (int i = 0; i < ransomNote.length(); i++) {
			arrayList1.add(String.valueOf(ransomNote.charAt(i)));
		}
		for (int i = 0; i < magazine.length(); i++) {
			arrayList2.add(String.valueOf(magazine.charAt(i)));
		}
		for (String string : arrayList1) {
			if (arrayList2.contains(string)) {
				arrayList2.remove(string);
			} else {
				return false;
			}
		}
		return true;

	}
}
