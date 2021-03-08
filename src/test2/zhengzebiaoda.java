package test2;

public class zhengzebiaoda {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="\\xe5\\xb0\\x8f\\xe7\\xb1\\xb3\\xe7\\xa4\\xbe\\xe5\\x8c\\xba";
		str=str.replaceAll("\\\\x","");
		zhengzebiaoda cs=new zhengzebiaoda();
		System.out.println(cs.hexToStringGBK(str));
	}
	public  String hexToStringGBK(String s) {
		byte[] baKeyword = new byte[s.length() / 2];
		for (int i = 0; i < baKeyword.length; i++) {
		try {
		baKeyword[i] = (byte) (0xff & Integer.parseInt(s.substring(i * 2, i * 2 + 2), 16));
		} catch (Exception e) {
		e.printStackTrace();
		return "";
		}
		}
		try {
		s = new String(baKeyword, "utf-8");// UTF-16le:Not
		} catch (Exception e1) {
		e1.printStackTrace();
		return "";
		}
		return s;
		}
}
