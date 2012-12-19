package unittests;

public class MyClock implements Clock {

	private int[] time;
	
	public MyClock() {
		this(0,0,0);
	}
	
	public MyClock(int hour, int minute, int second) throws IllegalArgumentException {
		if (hour>=0 && hour<24 && minute>=0 && minute<60 && second>=0 && second<60) {
			this.time = new int[3];
			this.time[0] = hour;
			this.time[1] = minute;
			this.time[2] = second;
		} else {
			throw new IllegalArgumentException("Not a valid time!");
		}
	}
	
	@Override
	public void setTime(int hour, int minute, int second) throws IllegalArgumentException{
		if (hour>=0 && hour<24 && minute>=0 && minute<60 && second>=0 && second<60) {
			this.time[0] = hour;
			this.time[1] = minute;
			this.time[2] = second;
		} else {
			throw new IllegalArgumentException("Not a valid time!");
		}		
	}

	@Override
	public void tick() {
		this.time[2]++;
		if (this.time[2] == 60) {
			this.time[2] = 0;
			this.time[1]++;
			if (this.time[1] == 60) {
				this.time[1] = 0;
				this.time[0]++;
				
			}
		}
	}

	@Override
	public String showTime() {
		return this.time[0]+":"+this.time[1]+":"+this.time[2];
	}

	@Override
	public int[] getTime() {
		return this.time;
	}

}
