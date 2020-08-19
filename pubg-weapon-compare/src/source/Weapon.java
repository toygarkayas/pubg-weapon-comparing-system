package source;

public class Weapon {
	private String name;
	private String type;
	private String ammunition;
	private int clip_capacity;
	private double hurt_0;
	private double hurt_1;
	private double hurt_2;
	private double hurt_3;
	private double hurt_0head;
	private double hurt_1head;
	private double hurt_2head;
	private double hurt_3head;
	private double rate;
	private int max_range;
	private boolean is_Sniper;
	private boolean is_Special;//airdrop loot
	private double reloadTime;
	private double bulletSpeed;
	
	public Weapon(String name,String type,String ammunition,int clip,double f0,double f1,double f2,double f3,double fh0,double fh1,double fh2,double fh3,double rate,int max_range,boolean is_Sniper,boolean is_Special,double reloadTime,double bulletSpeed) {
		this.name=name; this.type=type; this.ammunition=ammunition; this.clip_capacity=clip;
		this.hurt_0=f0; this.hurt_1=f1; this.hurt_2=f2;
		this.hurt_3=f3;
		this.hurt_0head=fh0;
		this.hurt_1head=fh1;
		this.hurt_2head=fh2;
		this.hurt_3head=fh3;
		this.rate=rate;
		this.max_range=max_range;
		this.is_Sniper=is_Sniper;
		this.is_Special=is_Special;
		this.reloadTime=reloadTime;
		this.bulletSpeed=bulletSpeed;
	}
	
	public int kac_Mermi(double time) {
		int sonuc=(int)(time/this.rate);
		double remainingTime=time - (this.getClip_capacity()*this.getRate()) - this.getReloadTime();
		if(sonuc > this.getClip_capacity()) {
			sonuc=this.getClip_capacity();
			while(remainingTime > this.getClip_capacity()*this.getRate()+this.getReloadTime()) {
				 remainingTime-=(this.getClip_capacity()*this.getRate());
				 remainingTime-=this.getReloadTime();
				 sonuc+=this.getClip_capacity();
			}
			if(remainingTime > this.getClip_capacity()*this.getRate())
				sonuc+=this.getClip_capacity();
			else
				sonuc+=(int)(remainingTime/this.rate);
		}
		return sonuc;
	}
	
	public double kac_Saniye(int count,int distance) {
		if(count == 1)
			return (distance/this.getBulletSpeed());
		double sonuc=count*this.getRate();
		if(count > this.getClip_capacity()) {
			while(count > this.getClip_capacity()) {
				sonuc+=(this.getClip_capacity()*this.getRate()+this.getReloadTime());
				count-=this.getClip_capacity();				
			}
			sonuc+=count*this.getRate();
		}
		sonuc+=(distance / this.getBulletSpeed());
		return sonuc;
	}
	
	public double helmetDamage(int n) {
		switch(n) {
		case 0:
			return this.hurt_0head;
		case 1:
			return this.hurt_1head;
		case 2:
			return this.hurt_2head;
		case 3:
			return this.hurt_3head;
		}
		return -1;
	}

	public double vestDamage(int n) {
		switch(n) {
		case 0:
			return this.hurt_0;
		case 1:
			return this.hurt_1;
		case 2:
			return this.hurt_2;
		case 3:
			return this.hurt_3;
		}
		return -1;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAmmunition() {
		return ammunition;
	}

	public void setAmmunition(String ammunition) {
		this.ammunition = ammunition;
	}

	public int getClip_capacity() {
		return clip_capacity;
	}

	public void setClip_capacity(int clip_capacity) {
		this.clip_capacity = clip_capacity;
	}

	public double getHurt_0() {
		return hurt_0;
	}

	public void setHurt_0(double hurt_0) {
		this.hurt_0 = hurt_0;
	}

	public double getHurt_1() {
		return hurt_1;
	}

	public void setHurt_1(double hurt_1) {
		this.hurt_1 = hurt_1;
	}

	public double getHurt_2() {
		return hurt_2;
	}

	public void setHurt_2(double hurt_2) {
		this.hurt_2 = hurt_2;
	}

	public double getHurt_3() {
		return hurt_3;
	}

	public void setHurt_3(double hurt_3) {
		this.hurt_3 = hurt_3;
	}

	public double getHurt_0head() {
		return hurt_0head;
	}

	public void setHurt_0head(double hurt_0head) {
		this.hurt_0head = hurt_0head;
	}

	public double getHurt_1head() {
		return hurt_1head;
	}

	public void setHurt_1head(double hurt_1head) {
		this.hurt_1head = hurt_1head;
	}

	public double getHurt_2head() {
		return hurt_2head;
	}

	public void setHurt_2head(double hurt_2head) {
		this.hurt_2head = hurt_2head;
	}

	public double getHurt_3head() {
		return hurt_3head;
	}

	public void setHurt_3head(double hurt_3head) {
		this.hurt_3head = hurt_3head;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public int getMax_range() {
		return max_range;
	}

	public void setMax_range(int max_range) {
		this.max_range = max_range;
	}

	public boolean isIs_Sniper() {
		return is_Sniper;
	}

	public void setIs_Sniper(boolean is_Sniper) {
		this.is_Sniper = is_Sniper;
	}

	public boolean isIs_Special() {
		return is_Special;
	}

	public void setIs_Special(boolean is_Special) {
		this.is_Special = is_Special;
	}

	public double getReloadTime() {
		return reloadTime;
	}

	public void setReloadTime(double reloadTime) {
		this.reloadTime = reloadTime;
	}

	public double getBulletSpeed() {
		return bulletSpeed;
	}

	public void setBulletSpeed(double bulletSpeed) {
		this.bulletSpeed = bulletSpeed;
	}
	
	
}


