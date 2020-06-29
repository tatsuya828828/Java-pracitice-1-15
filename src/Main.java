
public class Main {
	public static boolean isVaildPlayerName(String name) {
		// [a-z]: a~zのいずれかの文字が含まれるかの判定
		// {n}: 直前の文字のn回の繰り返し
		return name.matches("[A-Z][A-Z0-9]{7}");
	}

	static final String FORMAT = "%-9s %-13s 所持金%,6d";
	static String s7 = String.format(FORMAT, Hero.getName(), Hero.getJob(), Hero.getGold());

	public static void main(String[] args) {
		System.out.println(isVaildPlayerName("AIUEO123"));

		System.out.println(s7);

		String s0 = "abc,def:ghi";
		// 文字列の分割
		String[] words = s0.split("[,:]");
		for(String w:words) {
			System.out.println(w+"->");
		}
		// 文字列の置換
		String w = s0.replaceAll("[beh]","X");
		System.out.println(w);

		String s1 = "スッキリJava";
		String s2 = "Java";
		String s3 = "java";
		if(s2.equals(s3)) {
			System.out.println("s2とs3は等しい");
		}
		// equalsIgnoreCase: 大文字小文字を区別せず内容が等しいか調べるメソッド
		if(s2.equalsIgnoreCase(s3)) {
			System.out.println("s2とs3はケースを区別しなければ等しい");
		}

		// isEmpty: 空文字かどうか調べるメソッド
		if(s1.isEmpty()) {
			System.out.println("s1は空文字です");
		}else {
			System.out.println("s1の長さは"+s1.length()+"です");
		}

		String s4 = "Java and JavaScript";
		// 部分文字列(ここではJava)を含むかどうか調べるメソッド
		if(s4.contains("Java")) {
			System.out.println("文字列s4は、Javaを含んでいます");
		}
		// 末尾に部分文字列があるかを調べるメソッド
		if(s4.endsWith("Java")) {
			System.out.println("文字列s4は、Javaが末尾にあります");
		}
		// 部分文字列が最初に登場する位置を調べるメソッド
		System.out.println("文字列s4で最初にJavaが登場する位置は"+s4.indexOf("Java")+"文字目です");
		// 部分文字列が最後に登場する位置を調べるメソッド
		System.out.println("文字列s4で最後にJavaが登場する位置は"+s4.lastIndexOf("Java")+"文字目です");

		String s5 = "Java programing";
		// 指定一から始まる文字列を任意の長さだけ切り取るメソッド
		System.out.println("文字列s5の4文字目以降は"+s5.substring(3));
		// 位置指定8文字目は含まれない
		System.out.println("文字列s5の4~8文字目は"+s5.substring(3,8));

		// StringBuilderクラスを用いた文字連結
		// +演算子よりも高速で処理できるが数回程度の文字連結であればあまり変わらない
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<10; i++) {
			sb.append("Java");
		}
		String s6 = sb.toString();
		System.out.println(s6);
	}
}
