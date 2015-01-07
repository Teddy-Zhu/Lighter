package troevil.controller;

import troevil.model.StringFinal;

public class CommonController extends StringFinal {

	public static boolean CheckNull(String i) {
		if (i.trim() == null || "".equals(i.trim()))
			return true;
		else
			return false;
	}

	public static boolean CheckNull(Integer i) {
		if (i == null || i < 0)
			return true;
		else
			return false;
	}

	public static String Sformat(String format, Object... args) {
		return String.format(format, args);
	}

	public static String Sformat2(String format1, String format2,
			Object... args) {
		return Sformat(format1, Sformat(format2, args));
	}
}
