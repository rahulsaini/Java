import java.sql.Date;
import java.time.LocalDate;

public class SqlDateDemo1
{
	public static void main(String[] args) throws InterruptedException
	{
		long millis = System.currentTimeMillis();
		java.sql.Date date = new Date(millis);
		System.out.println(date);

		/*
		 * Returns:
		 * 
		 * a LocalDate object representing the same date value
		 */
		LocalDate localDate = date.toLocalDate();
		System.out.println(localDate);
	}

}
