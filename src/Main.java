import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
public class Main {
	public static void main(String[] args){
		Instant i1 = Instant.now();
		Instant i2 = Instant.ofEpochMilli(1600705425827L);
		long l = i2.toEpochMilli();
		// 現在日時を取得
		ZonedDateTime z1 = ZonedDateTime.now();
		// 東京時間2020年1月2日3時4分5秒6ナノ秒を指定して取得
		ZonedDateTime z2 = ZonedDateTime.of(2020, 1,2,3,4,5,6, ZoneId.of("Asia/Tokyo"));

		// InstantとZonedDateTimeの相互変換
		Instant i3 = z2.toInstant();
		ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));

		System.out.println("東京:"+z2.getYear()+z2.getMonth()+z2.getDayOfMonth());
		System.out.println("ロンドン:"+z3.getYear()+z3.getMonth()+z3.getDayOfMonth());
		if(z2.isEqual(z3)) {
			System.out.println("これらは同じ瞬間を指しています");
		}

		LocalDate d1 = LocalDate.of(2020, 1, 1);
		LocalDate d2 = LocalDate.of(2020, 1, 4);

		// 3日間を表すPeriodを2通りの方法で生成
		Period p1 = Period.ofDays(3);
		Period p2 = Period.between(d1, d2);

		// d2のさらに3日後を計算する
		LocalDate d3 = d2.plus(p2);
	}
}
