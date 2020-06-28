
public class Main {
	public static void main(String[] args) {
		String s1 = "スッキリJava";
		String s2 = "Java";
		String s3 = "java";
		if(s2.equals(s3)) {
			System.out.println("s2とs3は等しい");
		}
		// equalsIgnoreCase: 大文字小文字を区別せず内容が等しいか調べるAPI
		if(s2.equalsIgnoreCase(s3)) {
			System.out.println("s2とs3はケースを区別しなければ等しい");
		}

		// isEmpty: 空文字かどうか調べるAPI
		if(s1.isEmpty()) {
			System.out.println("s1は空文字です");
		}else {
			System.out.println("s1の長さは"+s1.length()+"です");
		}
	}

}
