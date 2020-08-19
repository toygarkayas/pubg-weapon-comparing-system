package source;
import java.util.*;

public class Test {

	public static void main(String[] args){
		Weapon[] Weapons=new Weapon[24];
		Weapons[0]=new Weapon("P18C","pistol","9mm",17,19,13.3,11.4,8.55,47.5,33.25,28.5,21.375,0.06,25,false,false,2.0,375);
		Weapons[1]=new Weapon("P1911","pistol","0.45",7,35,24.5,21,15.75,87.5,61.25,52.5,39.375,0.09,25,false,false,2.1,250);
		Weapons[2]=new Weapon("P92","pistol","9mm",15,29,20.3,17.4,13.05,72.5,50.75,43.5,32.625,0.11,25,false,false,2.0,380);	
		Weapons[3]=new Weapon("R1895","pistol","7.62",7,46,32.2,27.6,31.5,115,80.5,69,51.75,0.4,25,false,false,7.5,330);
		Weapons[4]=new Weapon("AKM","Assault rifle","7.62",30,48,33.6,28.8,21.6,120,84,72,54,0.1,400,false,false,3.22,715);
		Weapons[5]=new Weapon("Groza","Assault rifle","7.62",30,48,33.6,28.8,21.6,120,84,72,54,0.08,400,false,false,3.0,715);	
		Weapons[6]=new Weapon("M16A4","Assault rifle","5.56",30,41,28.7,24.6,18.45,102.5,71.75,61.5,46.125,0.075,600,false,false,2.86,900);
		Weapons[7]=new Weapon("M416","Assault rifle","5.56",30,41,28.7,24.6,18.45,102.5,71.75,61.5,46.125,0.086,600,false,false,2.73,880);
		Weapons[8]=new Weapon("SCAR-L","Assault rifle","5.56",30,41,28.7,24.6,18.45,102.5,71.75,61.5,46.125,0.096,600,false,false,2.86,870);	
		Weapons[9]=new Weapon("Crossbow","CrossBow","bolt",1,105,73.5,63,47.25,262.5,183.75,157.5,118.125,5,30,false,false,3.55,160);	
		Weapons[10]=new Weapon("Micro Uzi","Submachine gun","9mm",25,23,16.1,13.8,10.35,57.5,40.25,34.5,25.875,0.048,200,false,false,3.1,350);
		Weapons[11]=new Weapon("Tommy Gun","Submachine gun","0.45",30,38,26.6,22.8,17.1,95,66.5,57,42.75,0.086,200,false,false,3.45,280);
		Weapons[12]=new Weapon("UMP9","Submachine gun","9mm",30,35,24.5,21,15.75,87.5,61.25,52.5,39.375,0.092,300,false,false,3.1,400);
		Weapons[13]=new Weapon("Vector","Submachine gun","0.45",13,31,21.7,18.6,13.95,77.5,54.25,46.5,34.875,0.055,50,false,false,2.2,350);
		Weapons[14]=new Weapon("S12K","Shotgun","12",5,198,138.6,118.8,89.1,495,346.5,297,222.75,0.25,25,false,false,3.0,350);
		Weapons[15]=new Weapon("S1897","Shotgun","12",5,225,157.5,135,101.25,562.5,393.75,337.5,253.125,0.75,25,false,false,5.8,360);
		Weapons[16]=new Weapon("S686","Shotgun","12",2,225,157.5,135,101.25,562.5,393.75,337.5,253.125,0.2,25,false,false,2.4,370);	
		Weapons[17]=new Weapon("AWM","Sniper rifle","0.3",5,132,92.4,79.2,59.4,330,231,198,148.5,1.85,1000,false,false,4.6,945);
		Weapons[18]=new Weapon("Kar98K","Sniper rifle","7.62",5,72,50.4,43.2,32.4,180,126,108,81,1.9,600,false,false,4.0,760);
		Weapons[19]=new Weapon("M24","Sniper rifle","7.62",5,84,58.8,50.4,37.8,210,147,126,94.5,1.8,800,false,false,4.2,853);
		Weapons[20]=new Weapon("VSS","Sniper rifle","9mm",10,35,24.5,21,15.75,87.5,61.25,52.5,39.375,0.086,100,false,false,2.9,330);
		Weapons[21]=new Weapon("SKS","Sniper rifle","7.62",10,55,38.5,33,24.75,137.5,96.25,82.5,61.875,0.09,800,false,false,2.9,800);
		Weapons[22]=new Weapon("MINI-14","Sniper rifle","5.56",20,60,42,36,27,150,105,90,67.5,0.1,600,false,false,3.6,990);		
		Weapons[23]=new Weapon("M249","Light machine gun","5.56",100,44,30.8,26.4,19.8,110,77,66,49.5,0.075,500,false,false,8.2,915);
		Result[] sonuc=new Result[24];
		Result[] sonuc2=new Result[24];
		Result2[] sonuc3=new Result2[24];
		boolean flag=true,flag2=true;
		int distance = 0,helmet = 0,vest = 0,choice;
		int bodyShotCount,headShotCount;
		double vestDamage,helmetDamage,totalDamage;
		Scanner in=new Scanner(System.in);
		while(flag) {
			System.out.println("1)Totalde en iyi silah\n2)Erisiminiz olan en iyi silah\n3)Istatistiklerinize gore erisiminiz olan en iyi silah\n4)Istatistiklerinize gore en iyi silah\n5)Cikis.");
			choice = in.nextInt();	
			
			
			switch(choice) {
			
			
			
			case 1:
				
				for(int i2=0;i2<24;i2++)
					sonuc[i2]=new Result(Weapons[i2],0,0,9999,false);
				flag2=true;
				while(flag2) {
					System.out.println("Hedef ile aranizdaki uzaklik(metre):");
					distance=in.nextInt();
					if(distance < 0) {
						System.out.println("Gecerli bir deger giriniz.( > 0 )\n");
					}
					else
						flag2=false;
				}
				flag2=true;
				while(flag2) {
					System.out.println("Hedefinizin kaskinin seviyesi(0-3):");
					helmet=in.nextInt();
					if(helmet < 0 || helmet > 3) {
						System.out.println("Gecerli bir deger giriniz.(0,1,2 veya 3)\n");
					}
					else
						flag2=false;
				}
				flag2=true;
				while(flag2) {
					System.out.println("Hedefinizin zirhinin seviyesi(0-3):");
					vest=in.nextInt();
					in.nextLine();
					if(vest < 0 || vest > 3) {
						System.out.println("Gecerli bir deger giriniz.(0,1,2 veya 3)\n");
					}
					else
						flag2=false;
				}
				flag2=true;
				headShotCount=1;
				for(int i=0;i<24;i++) {
					bodyShotCount=0;
					if(distance > Weapons[i].getMax_range()) {
						sonuc[i]=new Result(Weapons[i],0,0,9999,false);
						System.out.println("You cannot kill with "+Weapons[i].getName()+". Out of range. >"+Weapons[i].getMax_range());
					}
					else {
						vestDamage=Weapons[i].vestDamage(vest);
						helmetDamage=Weapons[i].helmetDamage(helmet);
						if(distance <= 0.2*Weapons[i].getMax_range()) {
							vestDamage=vestDamage*1;
							helmetDamage=helmetDamage*1;
						}else if(distance  <= 0.4*Weapons[i].getMax_range()) {
							vestDamage=vestDamage*0.8;
							helmetDamage=helmetDamage*0.8;
						}else if(distance  <= 0.6*Weapons[i].getMax_range()) {
							vestDamage=vestDamage*0.6;
							helmetDamage=helmetDamage*0.6;
						}else if(distance < Weapons[i].getMax_range()) {
							vestDamage=vestDamage*0.4;
							helmetDamage=helmetDamage*0.4;
						}
						totalDamage=helmetDamage;
						while(totalDamage < 100) {
							totalDamage+=vestDamage;
							bodyShotCount++;
						}
						sonuc[i]=new Result(Weapons[i],headShotCount,bodyShotCount,Weapons[i].kac_Saniye(headShotCount+bodyShotCount,distance),true);
						System.out.println(sonuc[i]);					
					}
				}
				int min=0,i;
				for(i=1;i<24;i++) {
					if(sonuc[i]!=null) {
						if(sonuc[i].getTime() < sonuc[min].getTime() && sonuc[i].isCanKill()) 
							min=i;						
					}
				}
				for(i=0;i<24;i++) {
					if(sonuc[min].getTime()==sonuc[i].getTime() && sonuc[min].isCanKill())
						System.out.println("Best Weapon:"+Weapons[i].getName()+" bodyShot:"+ sonuc[i].getBody_Sayi()+" headShot:"+sonuc[i].getHs_Sayi());
				}
				System.out.println("************************************************************************\nKILLING ENEMY WITHOUT HEADSHOT");
				
				for(i=0;i<24;i++) {
					bodyShotCount=0;
					headShotCount=0;
					if(distance > Weapons[i].getMax_range()) {
						sonuc[i]=new Result(Weapons[i],0,0,9999,false);
						System.out.println("You cannot kill with "+Weapons[i].getName()+". Out of range. > "+Weapons[i].getMax_range());
					}
					else {
						vestDamage=Weapons[i].vestDamage(vest);
						helmetDamage=Weapons[i].helmetDamage(helmet);
						if(distance <= 0.2*Weapons[i].getMax_range()) {
							vestDamage=vestDamage*1;
							helmetDamage=helmetDamage*1;
						}else if(distance  <= 0.4*Weapons[i].getMax_range()) {
							vestDamage=vestDamage*0.8;
							helmetDamage=helmetDamage*0.8;
						}else if(distance  <= 0.6*Weapons[i].getMax_range()) {
							vestDamage=vestDamage*0.6;
							helmetDamage=helmetDamage*0.6;
						}else if(distance < Weapons[i].getMax_range()) {
							vestDamage=vestDamage*0.4;
							helmetDamage=helmetDamage*0.4;
						}
						totalDamage=0;
						while(totalDamage < 100) {
							totalDamage+=vestDamage;
							bodyShotCount++;
						}
						sonuc[i]=new Result(Weapons[i],headShotCount,bodyShotCount,Weapons[i].kac_Saniye(headShotCount+bodyShotCount,distance),true);
						System.out.println(sonuc[i]);					
					}
				}
			    min=0;
				for(i=1;i<24;i++) {
					if(sonuc[i]!=null) {
						if(sonuc[i].getTime() < sonuc[min].getTime() && sonuc[i].isCanKill()) 
							min=i;						
					}
				}
				for(i=0;i<24;i++) {
					if(sonuc[min].getTime()==sonuc[i].getTime() && sonuc[min].isCanKill())
						System.out.println("Best Weapon:"+Weapons[i].getName()+" bodyShot:"+ sonuc[i].getBody_Sayi()+" headShot:"+sonuc[i].getHs_Sayi());
				}
				break;
			
			
			
			case 2:
				
				for(i=0;i<24;i++)
					sonuc[i]=new Result(Weapons[i],0,0,9999,false);
				for(i=0;i<24;i++)
					sonuc2[i]=new Result(Weapons[i],0,0,9999,false);
				flag2=true;
				int[] dizi = new int[24];
				while(flag2) {
					System.out.println("Hedef ile aranizdaki uzaklik(metre):");
					distance=in.nextInt();
					if(distance < 0) {
						System.out.println("Gecerli bir deger giriniz.( > 0 )\n");
					}
					else
						flag2=false;
				}
				flag2=true;
				while(flag2) {
					System.out.println("Hedefinizin kaskinin seviyesi(0-3):");
					helmet=in.nextInt();
					if(helmet < 0 || helmet > 3) {
						System.out.println("Gecerli bir deger giriniz.(0,1,2 veya 3)\n");
					}
					else
						flag2=false;
				}
				flag2=true;
				while(flag2) {
					System.out.println("Hedefinizin zirhinin seviyesi(0-3):");
					vest=in.nextInt();
					in.nextLine();
					if(vest < 0 || vest > 3) {
						System.out.println("Gecerli bir deger giriniz.(0,1,2 veya 3)\n");
					}
					else
						flag2=false;
				}
				flag2=true;
				String name;
				for(i=0;i<24;i++)
					dizi[i]=0;
				while(flag2) {
					System.out.println("Erisiminiz olan silah adlarini giriniz:");
					name=in.nextLine();
					boolean flag3=true;
					int tmp=0;
					for(i=0;i<24;i++) {
						if(Weapons[i].getName().equals(name)) {
							while(flag3) {
								System.out.println(Weapons[i].getName()+" silahina ait kac adet merminiz var ?");
								tmp=in.nextInt();
								in.nextLine();
								if(tmp < 0)
									System.out.println("Gecerli mermi sayisi giriniz. ( > 0)");
								else
									flag3=false;
							}
							dizi[i]=tmp;
						}
					}
					if(name.equals("exit"))
						flag2=false;
				}
				flag2=true;
				headShotCount=1;
				i=0;
				while(i< 24) {
					bodyShotCount=0;
					if(dizi[i] > 0) {
						if(distance > Weapons[i].getMax_range()) {
							sonuc[i]=new Result(Weapons[i],0,0,9999,false);
							System.out.println("You cannot kill with "+Weapons[i].getName()+". Out of range. > "+Weapons[i].getMax_range());
						}
						else {
							vestDamage=Weapons[i].vestDamage(vest);
							helmetDamage=Weapons[i].helmetDamage(helmet);
							if(distance <= 0.2*Weapons[i].getMax_range()) {
								vestDamage=vestDamage*1;
								helmetDamage=helmetDamage*1;
							}else if(distance  <= 0.4*Weapons[i].getMax_range()) {
								vestDamage=vestDamage*0.8;
								helmetDamage=helmetDamage*0.8;
							}else if(distance  <= 0.6*Weapons[i].getMax_range()) {
								vestDamage=vestDamage*0.6;
								helmetDamage=helmetDamage*0.6;
							}else if(distance < Weapons[i].getMax_range()) {
								vestDamage=vestDamage*0.4;
								helmetDamage=helmetDamage*0.4;
							}
							totalDamage=helmetDamage;
							while(totalDamage < 100) {
								totalDamage+=vestDamage;
								bodyShotCount++;
							}
							int totalDamage2=0,count=0;
							while(totalDamage2 < 100) {
								totalDamage2+=vestDamage;
								count++;
							}
							sonuc[i]=new Result(Weapons[i],headShotCount,bodyShotCount,Weapons[i].kac_Saniye(headShotCount+bodyShotCount,distance),true);
							System.out.println(sonuc[i]);
							sonuc2[i]=new Result(Weapons[i],0,count,Weapons[i].kac_Saniye(count,distance),true);
							System.out.println(sonuc2[i]);
						}						
					}
					else {
						for(int k=0;k<24;k++) {
							if(dizi[k]==0)
								sonuc[k]=null;
						}
					}
					i++;
				}
				min=0;
				int min2=0;
				boolean devam=true;
				int k=0;
				while(k<24 && devam) {
					if(sonuc[k]!=null) {
						min=k;
						devam=false;
					}
					k++;
				}
				k=0;
				devam=true;
				while(k<24 && devam) {
					if(sonuc2[k]!=null) {
						min2=k;
						devam=false;
					}
					k++;
				}
				for(int l=0;l<24;l++) {
					if(sonuc[l]!=null) {
						if(sonuc[l].getHs_Sayi()+sonuc[l].getBody_Sayi() > dizi[l])
							sonuc[l].setCanKill(false);
					}
				}
				for(int l=0;l<24;l++) {
					if(sonuc2[l]!=null) {
						if(sonuc2[l].getHs_Sayi()+sonuc2[l].getBody_Sayi() > dizi[l])
							sonuc2[l].setCanKill(false);
					}
				}
				for(i=1;i<24;i++) {
					if(sonuc[i]!=null) {
						if((sonuc[i].getTime() < sonuc[min].getTime() && sonuc[i].isCanKill()) || (!sonuc[min].isCanKill() && sonuc[i].isCanKill())) 
							min=i;
					}
					if(sonuc2[i]!=null) {
						if((sonuc2[i].getTime() < sonuc2[min2].getTime() && sonuc2[i].isCanKill()) || (!sonuc2[min2].isCanKill() && sonuc2[i].isCanKill())) 
							min2=i;						
					}
				}
				System.out.print("Best Weapon with 1 HeadShot\t");
				for(i=0;i<24;i++) {
					if(sonuc[i]!=null) {
						if(sonuc[min].getTime()==sonuc[i].getTime() && sonuc[min].isCanKill())
							System.out.println("Best Weapon:"+Weapons[i].getName()+" bodyShot:"+ sonuc[i].getBody_Sayi()+" headShot:"+sonuc[i].getHs_Sayi());						
					}
				}
				if(!sonuc[min].isCanKill())
					System.out.println("Not enough ammo to kill enemy.");
				System.out.print("Best Weapon without HeadShot\t");
				for(i=0;i<24;i++) {
					if(sonuc2[i]!=null) {
						if(sonuc2[min2].getTime()==sonuc2[i].getTime() && sonuc2[min2].isCanKill())
							System.out.println("Best Weapon:"+Weapons[i].getName()+" bodyShot:"+ sonuc2[i].getBody_Sayi()+" headShot:"+sonuc2[i].getHs_Sayi());
					}
				}
				if(!sonuc2[min2].isCanKill())
					System.out.println("Not enough ammo to kill enemy.");
				for(i=0;i<24;i++)
					dizi[i]=0;
				break;
				
				
			case 3:
				
				flag2=true;
				for(i=0;i<24;i++)
					sonuc3[i]=new Result2(Weapons[i],0,9999,false);
				int[] dizi2 = new int[24];
				while(flag2) {
					System.out.println("Hedef ile aranizdaki uzaklik(metre):");
					distance=in.nextInt();
					if(distance < 0) {
						System.out.println("Gecerli bir deger giriniz.( > 0 )\n");
					}
					else
						flag2=false;
				}
				flag2=true;
				while(flag2) {
					System.out.println("Hedefinizin kaskinin seviyesi(0-3):");
					helmet=in.nextInt();
					if(helmet < 0 || helmet > 3) {
						System.out.println("Gecerli bir deger giriniz.(0,1,2 veya 3)\n");
					}
					else
						flag2=false;
				}
				flag2=true;
				while(flag2) {
					System.out.println("Hedefinizin zirhinin seviyesi(0-3):");
					vest=in.nextInt();
					in.nextLine();
					if(vest < 0 || vest > 3) {
						System.out.println("Gecerli bir deger giriniz.(0,1,2 veya 3)\n");
					}
					else
						flag2=false;
				}
				flag2=true;
				String name2;
				for(i=0;i<24;i++)
					dizi2[i]=0;
				while(flag2) {
					System.out.println("Erisiminiz olan silah adlarini giriniz:");
					name2=in.nextLine();
					boolean flag3=true;
					int tmp=0;
					for(i=0;i<24;i++) {
						if(Weapons[i].getName().equals(name2)) {
							while(flag3) {
								System.out.println(Weapons[i].getName()+" silahina ait kac adet merminiz var ?");
								tmp=in.nextInt();
								in.nextLine();
								if(tmp < 0)
									System.out.println("Gecerli mermi sayisi giriniz. ( > 0)");
								else
									flag3=false;
							}
							dizi2[i]=tmp;
						}
					}
					if(name2.equals("exit"))
						flag2=false;
				}
				flag2=true;
				boolean flag3=true;
				double bodyRate=0,headRate=0;
				double generalrate=0,hsrate=0;
				while(flag2) {
					flag3=true;
					while(flag3) {
						System.out.println("Oyunlardaki isabet oraniniz(% X þeklinde):");
						generalrate=in.nextInt();
						if(generalrate <= 100 && generalrate >= 0)
							flag3=false;
						else
							System.out.println("0-100 arasi gecerli bir deger giriniz.");
					}
					flag3=true;
					while(flag3) {
						System.out.println("Oyunlardaki headshot oraniniz(% X þeklinde):");
						hsrate=in.nextInt();
						if(hsrate <= 100 && hsrate >= 0)
							flag3=false;
						else
							System.out.println("0-100 arasi gecerli bir deger giriniz.");
					}
					flag2=false;
				}
				if(generalrate == 0) {
					System.out.println("With %0 shoot rate you can not kill anyone. ");
					break;
				}
				else {
					generalrate=generalrate/100;
					hsrate=hsrate/100;
					headRate=generalrate*hsrate;
					bodyRate=generalrate-hsrate;
					double avgDamage;
					int totalBullet=0;
					i=0;
					while(i<24) {
						if(dizi2[i] > 0) {
							if(distance > Weapons[i].getMax_range()) {
								sonuc3[i]=new Result2(Weapons[i],0,9999,false);
								System.out.println("You cannot kill with "+Weapons[i].getName()+". Out of range. > "+Weapons[i].getMax_range());
							}
							else {
								vestDamage=Weapons[i].vestDamage(vest);
								helmetDamage=Weapons[i].helmetDamage(helmet);
								if(distance <= 0.2*Weapons[i].getMax_range()) {
									vestDamage=vestDamage*1;
									helmetDamage=helmetDamage*1;
								}else if(distance  <= 0.4*Weapons[i].getMax_range()) {
									vestDamage=vestDamage*0.8;
									helmetDamage=helmetDamage*0.8;
								}else if(distance  <= 0.6*Weapons[i].getMax_range()) {
									vestDamage=vestDamage*0.6;
									helmetDamage=helmetDamage*0.6;
								}else if(distance < Weapons[i].getMax_range()) {
									vestDamage=vestDamage*0.4;
									helmetDamage=helmetDamage*0.4;
								}
								totalDamage=0;
								avgDamage=(vestDamage*bodyRate)+(helmetDamage*headRate);
								totalBullet=0;
								while(totalDamage < 100) {
									totalDamage+=avgDamage;
									totalBullet++;
								}
								sonuc3[i]=new Result2(Weapons[i],totalBullet,Weapons[i].kac_Saniye(totalBullet,distance),true);
								System.out.println(sonuc3[i]);
							}						
						}
						else {
							for(k=0;k<24;k++) {
								if(dizi2[k]==0)
									sonuc3[k]=null;
							}
						}
						i++;
					}
					min=0;
					devam=true;
					k=0;
					while(k<24 && devam) {
						if(sonuc3[k]!=null) {
							min=k;
							devam=false;
						}
						k++;
					}
					for(int l=0;l<24;l++) {
						if(sonuc3[l]!=null) {
							if(sonuc3[l].getTotalBullet() > dizi2[l])
								sonuc3[l].setCanKill(false);
						}
					}
					for(i=1;i<24;i++) {
						if(sonuc3[i]!=null) {
							if((sonuc3[i].getTime() < sonuc3[min].getTime() && sonuc3[min].isCanKill()) || (!sonuc3[min].isCanKill() && sonuc3[i].isCanKill()))
								min=i;
						}
					}
					System.out.println("Best Weapon(s) for this Rates is(are):");
					for(i=0;i<24;i++) {
						if(sonuc3[i]!=null) {
							if(sonuc3[min].getTime()==sonuc3[i].getTime() && sonuc3[min].isCanKill())
								System.out.println("Best Weapon:"+Weapons[i].getName()+" Total Bullet You Need to Fire:"+ sonuc3[i].getTotalBullet());						
						}
					}
					if(!sonuc3[min].isCanKill())
						System.out.println("Not enough ammo to kill enemy.");
				}

				for(i=0;i<24;i++)
					dizi2[i]=0;
				
				break;
				
			
			case 4:
				
				flag2=true;
				for(i=0;i<24;i++)
					sonuc3[i]=new Result2(Weapons[i],0,9999,false);
				
				while(flag2) {
					System.out.println("Hedef ile aranizdaki uzaklik(metre):");
					distance=in.nextInt();
					if(distance < 0) {
						System.out.println("Gecerli bir deger giriniz.( > 0 )\n");
					}
					else
						flag2=false;
				}
				flag2=true;
				while(flag2) {
					System.out.println("Hedefinizin kaskinin seviyesi(0-3):");
					helmet=in.nextInt();
					if(helmet < 0 || helmet > 3) {
						System.out.println("Gecerli bir deger giriniz.(0,1,2 veya 3)\n");
					}
					else
						flag2=false;
				}
				flag2=true;
				while(flag2) {
					System.out.println("Hedefinizin zirhinin seviyesi(0-3):");
					vest=in.nextInt();
					in.nextLine();
					if(vest < 0 || vest > 3) {
						System.out.println("Gecerli bir deger giriniz.(0,1,2 veya 3)\n");
					}
					else
						flag2=false;
				}
				flag2=true;
				flag3=true;
				bodyRate=0;headRate=0;
				generalrate=0;hsrate=0;
				while(flag2) {
					flag3=true;
					while(flag3) {
						System.out.println("Oyunlardaki isabet oraniniz(% X þeklinde):");
						generalrate=in.nextInt();
						if(generalrate <= 100 && generalrate >= 0)
							flag3=false;
						else
							System.out.println("0-100 arasi gecerli bir deger giriniz.");
					}
					flag3=true;
					while(flag3) {
						System.out.println("Oyunlardaki headshot oraniniz(% X þeklinde):");
						hsrate=in.nextInt();
						if(hsrate <= 100 && hsrate >= 0)
							flag3=false;
						else
							System.out.println("0-100 arasi gecerli bir deger giriniz.");
					}
					flag2=false;
				}
				if(generalrate == 0) {
					System.out.println("With % 0 shoot rate you can not kill anyone. ");
				}
				else {
					generalrate=generalrate/100;
					hsrate=hsrate/100;
					headRate=generalrate*hsrate;
					bodyRate=generalrate-hsrate;
					double avgDamage=0;
					int totalBullet=0;
					i=0;
					while(i<24) {
							if(distance > Weapons[i].getMax_range()) {
								sonuc3[i]=new Result2(Weapons[i],0,9999,false);
								System.out.println("You cannot kill with "+Weapons[i].getName()+". Out of range. > "+Weapons[i].getMax_range());
							}
							else {
								vestDamage=Weapons[i].vestDamage(vest);
								helmetDamage=Weapons[i].helmetDamage(helmet);
								if(distance <= 0.2*Weapons[i].getMax_range()) {
									vestDamage=vestDamage*1;
									helmetDamage=helmetDamage*1;
								}else if(distance  <= 0.4*Weapons[i].getMax_range()) {
									vestDamage=vestDamage*0.8;
									helmetDamage=helmetDamage*0.8;
								}else if(distance  <= 0.6*Weapons[i].getMax_range()) {
									vestDamage=vestDamage*0.6;
									helmetDamage=helmetDamage*0.6;
								}else if(distance < Weapons[i].getMax_range()) {
									vestDamage=vestDamage*0.4;
									helmetDamage=helmetDamage*0.4;
								}
								totalDamage=0;
								avgDamage=(vestDamage*bodyRate)+(helmetDamage*headRate);
								totalBullet=0;
								while(totalDamage < 100) {
									totalDamage+=avgDamage;
									totalBullet++;
								}
								sonuc3[i]=new Result2(Weapons[i],totalBullet,Weapons[i].kac_Saniye(totalBullet,distance),true);
								System.out.println(sonuc3[i]);
							}						
						i++;
					}
					min=0;
					devam=true;
					k=0;
					while(k<24 && devam) {
						if(sonuc3[k]!=null) {
							min=k;
							devam=false;
						}
						k++;
					}
					for(i=1;i<24;i++) {
						if(sonuc3[i]!=null) {
							if((sonuc3[i].getTime() < sonuc3[min].getTime() && sonuc3[min].isCanKill()) || (!sonuc3[min].isCanKill() && sonuc3[i].isCanKill()))
								min=i;
						}
					}
					System.out.println("Best Weapon(s) for this Rates is(are):");
					for(i=0;i<24;i++) {
						if(sonuc3[i]!=null) {
							if(sonuc3[min].getTime()==sonuc3[i].getTime() && sonuc3[min].isCanKill())
								System.out.println(Weapons[i].getName()+" Total Bullet You Need to Fire: "+ sonuc3[i].getTotalBullet());						
						}
					}
					if(!sonuc3[min].isCanKill())
						System.out.println("Not enough ammo to kill enemy.");	
				}
				break;
		
				
			case 5:
				System.out.println("Bye.");
				flag=false;
				break;
			default:
				System.out.println("1-5 arasi bir sayi giriniz.");
			}
			
		}
		
	}

}
