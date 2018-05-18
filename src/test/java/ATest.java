import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by chances on 2018/5/18.
 */
public class ATest {
	@Test
	public void test() {
		String pattern = "yyyy-MM-dd HH:mm:ss";
		Calendar calendar = Calendar.getInstance();
		calendar.set(2015, Calendar.JUNE, 5, 13, 45, 23);
		String format = new SimpleDateFormat(pattern).format(calendar.getTime());
		System.out.println(format);
	}
}
