package source;

public class Result2 {
	private Weapon silah;
	private int totalBullet;
	private double time;
	private boolean canKill;
	
	public Result2(Weapon w,int t,double time,boolean c) {
		this.silah=w;
		this.totalBullet=t;
		this.time=time;
		this.canKill=c;
	}
	
	public String toString() {
		return "You can use " + this.silah.getName()+" to kill. With average "+totalBullet+" bullets.  \t Time:"+time;
	}

	public Weapon getSilah() {
		return silah;
	}

	public void setSilah(Weapon silah) {
		this.silah = silah;
	}

	public int getTotalBullet() {
		return totalBullet;
	}

	public void setTotalBullet(int totalBullet) {
		this.totalBullet = totalBullet;
	}

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}

	public boolean isCanKill() {
		return canKill;
	}

	public void setCanKill(boolean canKill) {
		this.canKill = canKill;
	}
	
}
