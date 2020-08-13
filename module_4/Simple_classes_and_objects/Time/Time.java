package by.jonline.simple_class.time;

public class Time {
	private int hours;
	private int minutes;
	private int seconds;

	private static final int SEC_IN_DAY = 86400;
	private static final int SEC_IN_HOUR = 3600;
	private static final int SEC_IN_MINUTE = 60;
	private static final int MIN_IN_HOUR = 60;
	private static final int HOURS_IN_DAY = 24;

	public Time() {
		hours = 0;
		minutes = 0;
		seconds = 0;
	}

	public Time(int hours, int minutes, int seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		if (hours >= 0 || hours < HOURS_IN_DAY) {
			this.hours = hours;
		} else {
			this.hours = 0;
		}
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		if (minutes >= 0 || minutes < MIN_IN_HOUR) {
			this.minutes = minutes;
		} else {
			this.minutes = 0;
		}
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		if (seconds >= 0 || seconds < SEC_IN_MINUTE) {
			this.seconds = seconds;
		} else {
			this.seconds = 0;
		}
	}

	// Добавление к текущему времени заданного количество часов, минут и секунд
	public void addTime(int hours, int minutes, int seconds) {
		int currentTime;
		currentTime = SEC_IN_HOUR * this.hours + SEC_IN_MINUTE * this.minutes + this.seconds;

		int addedTime;
		addedTime = SEC_IN_HOUR * hours + SEC_IN_MINUTE * minutes + seconds;

		currentTime += addedTime;
		currentTime %= SEC_IN_DAY;
		setTime(currentTime);
	}

	// ОТнятие от текущего времени заданного количество часов, минут и секунд
	public void subTime(int hours, int minutes, int seconds) {
		int currentTime;
		currentTime = SEC_IN_HOUR * this.hours + SEC_IN_MINUTE * this.minutes + this.seconds;

		int addedTime;
		addedTime = SEC_IN_HOUR * hours + SEC_IN_MINUTE * minutes + seconds;

		currentTime -= addedTime;
		if (currentTime < 0) {
			currentTime = Math.abs(currentTime % SEC_IN_DAY);
			currentTime = SEC_IN_DAY - currentTime;

		}
		setTime(currentTime);
	}

	// Установка времени по количетсву секунд, пройденных с начала суток
	private void setTime(int timeInSec) {

		hours = timeInSec / SEC_IN_HOUR;
		timeInSec %= SEC_IN_HOUR;
		minutes = timeInSec / SEC_IN_MINUTE;
		seconds = timeInSec % SEC_IN_MINUTE;
	}

	@Override
	public String toString() {
		return "Time is " + hours + " hour(s) " + minutes + " minute(s) " + seconds + " second(s)";
	}

}
