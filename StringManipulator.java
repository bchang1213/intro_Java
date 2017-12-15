public class StringManipulator {
	public String trimAndConcat(String str1, String str2){
		String strA = str1.trim();
		String strB = str2.trim();
		String strC = strA + strB;
		return strC;
	}
	public Integer getIndexOrNull(String instr, char letter){
		String letterString = Character.toString(letter);
		if(instr.contains(letterString) == true){
		int a = instr.indexOf(letter);
		return a;			
		}
		else{
			return null;
		}

	}
	public Integer getIndexOrNull(String mainstring, String substring){;
		if(mainstring.contains(substring) == true){
			int b = mainstring.indexOf(substring);
			return b;
		}
		else{
			return null;
		}
	}
	public String concatSubstring(String firststr, int c, int d, String secondstr){
		String str1 = firststr;
		String str2 = secondstr;
		String str3 = str1.substring(c,d);
		String finalstring = str3 + str2;
		return finalstring;
	}
}