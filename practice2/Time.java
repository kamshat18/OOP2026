package practice2;

public class Time {
	private int hour;
	private int min;
	private int sec;

	public  Time(int hour,int min,int sec) {
		if(hour<0 || hour>23) {
			this.hour =0;
		} else this.hour = hour;
		if(min<0 ||min>59) {
			this.min =0;
		}else this.min = min;
		if(sec<0 || sec>59) {
			this.sec = 0;
		}else this.sec = sec;
	}
	public String toUni() {
		String h = (hour<10) ? "0" + hour : "" + hour;
		String m = (min<10) ? "0" + min : "" + min;
		String s = (sec<10) ? "0" + sec : "" + sec;
		return h + ":" + m + ":" + s;
	}
	public String toSt() {
		int sthour ;
		String period ;
		if(hour==0) {
			sthour = 12;
			period = "AM";	
		}
		else if(hour <12) {
			sthour = hour;
			period = "AM";
		}
		else if (hour == 12) {
	        sthour = 12;
	        period = "PM";}
		else sthour  = hour - 12; period = "PM";
		String h = (sthour<10) ? "0" + sthour : "" + sthour;
		String m = (min<10) ? "0" + min : "" + min;
		String s = (sec<10) ? "0" + sec : "" + sec;
		return h + ":" + m + ":" + s +" " + period;
	}
	
	
	public Time add(Time other) {
	    int nhour = this.hour + other.hour;
	    int nmin = this.min + other.min;
	    int nsec = this.sec + other.sec;

	    if(nsec >= 60) {
	        nsec -= 60;
	        nmin++;
	    }
	    if(nmin >= 60) {
	        nmin -= 60;
	        nhour++;
	    }
	    if(nhour >= 24) {
	        nhour -= 24;
	    }

	    return new Time(nhour, nmin, nsec);
	}

	public static void main(String[] args) {
	Time t = new Time(23,5,6);
	System.out.println(t.toUni());// prints "23:05:06"
	System.out.println(t.toSt());//prints"11:05:06 PM"
	Time t2 = new Time(4,24,33);
	Time t3 = t.add(t2);
	System.out.println(t3.toUni());
//	System.out.println(t3.toSt());
	}

}
