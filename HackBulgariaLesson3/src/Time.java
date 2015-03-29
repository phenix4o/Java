public class Time {
	private int hour, min, sec, day, m, year;

	public Time(int hour, int min, int sec, int day, int m, int year) {
		this.hour = hour;
		this.min = min;
		this.sec = sec;
		this.day = day;
		this.m = m;
		this.year = year;
	}

	public String toString() {
		year = year % 100;

		return String.format("%02d:%02d:%02d %02d.%02d.%02d", hour, min, sec,
				day, m, year);

	}
}
