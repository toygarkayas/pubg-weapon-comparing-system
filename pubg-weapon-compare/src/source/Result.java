package source;

public class Result {
	private Weapon silah;
	private int hs_Sayi;
	private int body_Sayi;
	private double time;
	private boolean canKill;
	
	public Result(Weapon silah,int sayi,int sayi2,double time,boolean canKill) {
		this.silah=silah;
		this.body_Sayi=sayi2;
		this.hs_Sayi=sayi;
		this.time=time;
		this.canKill=canKill;
	}
	
	public Result(Weapon w,boolean canKill) {
		this.canKill=canKill;
		this.silah=w;
	}
	
	public String toString() {
		return "You can use " + this.silah.getName()+" to kill. With "+hs_Sayi+" headshot(s) "+body_Sayi+" bodyshot(s) \t Time:"+time;
	}

	public Weapon getSilah() {
		return silah;
	}

	public void setSilah(Weapon silah) {
		this.silah = silah;
	}

	public int getHs_Sayi() {
		return hs_Sayi;
	}

	public void setHs_Sayi(int hs_Sayi) {
		this.hs_Sayi = hs_Sayi;
	}

	public int getBody_Sayi() {
		return body_Sayi;
	}

	public void setBody_Sayi(int body_Sayi) {
		this.body_Sayi = body_Sayi;
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
