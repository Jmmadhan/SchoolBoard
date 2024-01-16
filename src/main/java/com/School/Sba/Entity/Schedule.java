package com.School.Sba.Entity;

import java.time.LocalTime;

public class Schedule {
	private LocalTime opensAt;
	private LocalTime closesAt;
	private int classHourPerDay;
	private LocalTime classHourLength;
	private LocalTime breakTime;
	private LocalTime breakLength;
	private LocalTime lunchTime;
	private LocalTime lunchLength;
	public LocalTime getOpensAt() {
		return opensAt;
	}
	public void setOpensAt(LocalTime opensAt) {
		this.opensAt = opensAt;
	}
	public LocalTime getClosesAt() {
		return closesAt;
	}
	public void setClosesAt(LocalTime closesAt) {
		this.closesAt = closesAt;
	}
	public int getClassHourPerDay() {
		return classHourPerDay;
	}
	public void setClassHourPerDay(int classHourPerDay) {
		this.classHourPerDay = classHourPerDay;
	}
	public LocalTime getClassHourLength() {
		return classHourLength;
	}
	public void setClassHourLength(LocalTime classHourLength) {
		this.classHourLength = classHourLength;
	}
	public LocalTime getBreakTime() {
		return breakTime;
	}
	public void setBreakTime(LocalTime breakTime) {
		this.breakTime = breakTime;
	}
	public LocalTime getBreakLength() {
		return breakLength;
	}
	public void setBreakLength(LocalTime breakLength) {
		this.breakLength = breakLength;
	}
	public LocalTime getLunchTime() {
		return lunchTime;
	}
	public void setLunchTime(LocalTime lunchTime) {
		this.lunchTime = lunchTime;
	}
	public LocalTime getLunchLength() {
		return lunchLength;
	}
	public void setLunchLength(LocalTime lunchLength) {
		this.lunchLength = lunchLength;
	}
	
	
}
