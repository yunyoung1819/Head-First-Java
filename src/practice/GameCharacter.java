package practice;

import java.io.Serializable;
/**
 * GameCharacter 클래스 
 *
 */
public class GameCharacter implements Serializable {
	int power;  // 파워
	int hp;     // HP
	int mana;   // 마나
	String job; // 직업
	String[] weapons; // 무기 및 방어구
	
	public GameCharacter(int p, int h, int m, String j, String[] w) {
		power = p;
		hp = h;
		mana = m;
		job = j;
		weapons = w;
	}

	public int getPower() {
		return power;
	}

	public int getHp() {
		return hp;
	}

	public int getMana() {
		return mana;
	}

	public String getJob() {
		return job;
	}

	public String getWeapons() {
		String weaponList = "";
		
		for(int i = 0; i < weapons.length; i++) {
			weaponList += weapons[i] + " ";
		}
		return weaponList;
	}
	
	public void setPower(int power) {
		this.power = power;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public void setWeapons(String[] weapons) {
		this.weapons = weapons;
	}
}
