package com.loonandroid.pc.handler;

import java.text.DecimalFormat;

public class Handler_Number {
	/** 把传入的字符串型的浮点数保留指定的位数，以字符串的方式返回 */
	public static String formatStrDecimal(String price, int len) {
		try {
			Float pri = Float.parseFloat(price);
			return formatDecimal(pri, len);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		return price;
	}

	/** 把传入的浮点数保留指定的位数，以字符串的方式返回 */
	public static String formatDecimal(float price, int len) {
		String dec = "";
		for (int i = 0; i < len; i++) {
			dec += "0";
		}
		DecimalFormat decimalFormat = new DecimalFormat("." + dec);// 构造方法的字符格式这里如果小数不足2位,会以0补足.
		String p = decimalFormat.format(price);// format 返回的是字符串
		return p;
	}

}
