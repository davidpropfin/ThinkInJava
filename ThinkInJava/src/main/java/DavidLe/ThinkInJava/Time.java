package DavidLe.ThinkInJava;

class Time {
	int hour, minute;
	double second;

	public Time() {
		this.hour = 0;
		this.minute = 0;
		this.second = 0.0;
	}

	public Time(int hour, int minute, double second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public static void printTime(Time t) {
		System.out.println(t.hour + ":" + t.minute + ":" + t.second);
	}

	public static void addTimeFill(Time t1, Time t2, Time sum) {
		sum.hour = t1.hour + t2.hour;
		sum.minute = t1.minute + t2.minute;
		sum.second = t1.second + t2.second;
		if (sum.second >= 60.0) {
			sum.second -= 60.0;
			sum.minute += 1;
		}
		if (sum.minute >= 60) {
			sum.minute -= 60;
			sum.hour += 1;
		}
		printTime(sum);
	}

	public static boolean isAfter(Time time1, Time time2) {
		if (time1.hour > time2.hour)
			return true;
		if (time1.hour < time2.hour)
			return false;
		if (time1.minute > time2.minute)
			return true;
		if (time1.minute < time2.minute)
			return false;
		if (time1.second > time2.second)
			return true;
		return false;
	}

	public static Time addTime(Time t1, Time t2) {
		double seconds = convertToSeconds(t1) + convertToSeconds(t2);
		return new Time(seconds);

	}

	public static double convertToSeconds(Time t) {
		int minutes = t.hour * 60 + t.minute;
		double seconds = minutes * 60 + t.second;
		return seconds;
	}

	public Time(double secs) {
		this.hour = (int) (secs / 3600.0);
		secs -= this.hour * 3600.0;
		this.minute = (int) (secs / 60.0);
		secs -= this.minute * 60;
		this.second = secs;
	}

	public static void main(String[] args) {
		// một cách lập thành và khởi tạo đối tượng Time
		Time t1 = new Time();
		t1.hour = 11;
		t1.minute = 8;
		t1.second = 3.14159;
		// printTime(t1);
		// một cách khác để thực hiện việc tương tự
		Time t2 = new Time(11, 8, 3.14159);
//		printTime(t2);
//		System.out.println(isAfter(t1, t2));
//		printTime(addTime(t1, t2));
//		 Time currentTime = new Time(9, 14, 30.0); 
//		    Time breadTime = new Time(3, 35, 0.0); 
//		    Time doneTime = addTime(currentTime, breadTime); 
//		    printTime(doneTime);
		addTimeFill(t1, t2, addTime(t1, t2));
		// bangcuuchuongthuN(3);
		printMultTable(2);
	}

	public static void printMultTable(int high) {
		int i = 1;
		while (i <= high) {
			phepnhan(high);
			i = i + 1;
		}
	}

	public static void phepnhan(int high) {
		int i = 1;
		while (i <= high) {
			for (int j = 1; j < 10; j++) {
				System.out.print(j * i + " ");
				i = i + 1;
			}
			System.out.println("");
		}

	}

}