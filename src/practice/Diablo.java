package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 * 디아블로 콘솔 게임 
 *
 */
public class Diablo {
	public static void main(String[] args) {
		String job = "";
		System.out.println("===============================================================");
		System.out.println("------------------------------디아블로---------------------------");
		System.out.println("===============================================================");
	
		System.out.println("직업을 선택하세요 : 1.야만용사 2.소서리스 3.네크로맨서 4.아마존 5.드루이드 6.어쌔신 7.팔라딘");
		Scanner input = new Scanner(System.in);
		int j = input.nextInt();
		job = setCharacterJob(job, j);
		
		// 파워, hp, 마나, 직업, 무기 및 방어구 
		GameCharacter babarian = new GameCharacter(200, 100, 50, job, new String[]{"돌격", "외치기", "강력외침"});
		GameCharacter sosuris = new GameCharacter(100, 100, 300, job, new String[] {"유성낙하", "파이어볼", "운석충돌"});
		GameCharacter necromanser = new GameCharacter(150, 150, 200, job, new String[] {"언데드 소생", "죽응의 키스", "언데드 군대"});
		GameCharacter amazon = new GameCharacter(150, 100, 150, job, new String[] {"멀티샷", "에어로샷", "은빛화살"});
		GameCharacter druid = new GameCharacter(200, 200, 100, job, new String[] {"그리즐리베어 변신", "덩쿨소환", "독수리소환"});
		GameCharacter assasin = new GameCharacter(200, 200, 60, job, new String[] {"그림자 암살", "어둠의 기습", "은폐잠입"});
		GameCharacter paladin = new GameCharacter(250, 80, 100, job, new String[] {"성스러운 임무", "성스러운 빛", "빛의 창검"});

		System.out.println("행동을 선택하세요 : 1.캐릭터 정보보기 2.회복포션 구입 3.게임진행 4.저장하기 5.불러오기 6.게임종료");
		
		while(true) {
			int play = input.nextInt();
			switch(play) {
				case 1 : 
					showCharacterInfo(j, babarian, sosuris, necromanser, amazon, druid, assasin, paladin);
					break;
				case 2 : 
					addHP(j, babarian, sosuris, necromanser, amazon, druid, assasin, paladin);
					break;
				case 3 : 
					break;
				case 4 : 
					try {
						ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Diablo.ser"));
						os.writeObject(babarian);
						os.writeObject(sosuris);
						os.writeObject(necromanser);
						os.writeObject(amazon);
						os.writeObject(druid);
						os.writeObject(druid);
						os.writeObject(paladin);
						os.close();
						System.out.println("저장되었습니다");
					} catch(IOException ex) {
						ex.printStackTrace();
					}
					break;
				case 5: 
					try {
						ObjectInputStream is = new ObjectInputStream(new FileInputStream("Diablo.ser"));
						babarian = (GameCharacter) is.readObject();
						sosuris = (GameCharacter) is.readObject();
						necromanser = (GameCharacter) is.readObject();
						amazon = (GameCharacter) is.readObject();
						druid = (GameCharacter) is.readObject();
						paladin = (GameCharacter) is.readObject();
						System.out.println("불러오기 성공");
						showCharacterInfo(j, babarian, sosuris, necromanser, amazon, druid, assasin, paladin);
					}catch(Exception ex) {
						ex.printStackTrace();
					}
					break;
				case 6 : 
					System.out.println("게임을 종료합니다.");
					System.exit(0);
					break;
				default : 
					System.out.println("다시 선택하세요.");
					break;
			}
		}
		}

	private static void addHP(int j, GameCharacter babarian, GameCharacter sosuris, GameCharacter necromanser,
			GameCharacter amazon, GameCharacter druid, GameCharacter assasin, GameCharacter paladin) {
		if(j == 1) {
			int hp = babarian.getHp() + 100;
			babarian.setHp(hp);
			System.out.println("체력이 100만큼 증가하였습니다. 체력: " + babarian.getHp());
		}else if(j == 2) {
			int hp = sosuris.getHp() + 100;
			sosuris.setHp(hp);
			System.out.println("체력이 100만큼 증가하였습니다. 체력: " + sosuris.getHp());
		}else if(j == 3) {
			int hp = necromanser.getHp() + 100;
			necromanser.setHp(hp);
			System.out.println("체력이 100만큼 증가하였습니다. 체력: " + necromanser.getHp());
		}else if(j == 4) {
			int hp = amazon.getHp() + 100;
			amazon.setHp(hp);
			System.out.println("체력이 100만큼 증가하였습니다. 체력: " + amazon.getHp());
		}else if(j == 5) {
			int hp = druid.getHp() + 100;
			druid.setHp(hp);
			System.out.println("체력이 100만큼 증가하였습니다. 체력: " + druid.getHp());
		}else if(j == 6) {
			int hp = assasin.getHp() + 100;
			assasin.setHp(hp);
			System.out.println("체력이 100만큼 증가하였습니다. 체력: " + assasin.getHp());
		}else {
			int hp = paladin.getHp() + 100;
			paladin.setHp(hp);
			System.out.println("체력이 100만큼 증가하였습니다. 체력: " + paladin.getHp());
		}
	}

	public static void showCharacterInfo(int j, GameCharacter babarian, GameCharacter sosuris,
			GameCharacter necromanser, GameCharacter amazon, GameCharacter druid, GameCharacter assasin,
			GameCharacter paladin) {
		if(j == 1) {
			System.out.println("character : " + babarian.getJob());
			System.out.println("power : " + babarian.getPower());
			System.out.println("hp : " + babarian.getHp());
			System.out.println("mana : " + babarian.getMana());
			System.out.println("weapons: " + babarian.getWeapons());
		}else if(j == 2) {
			System.out.println("character : " + sosuris.getJob());
			System.out.println("power : " + sosuris.getPower());
			System.out.println("hp : " + sosuris.getHp());
			System.out.println("mana : " + sosuris.getMana());
			System.out.println("weapons: " + sosuris.getWeapons());
		}else if(j == 3) {
			System.out.println("character : " + necromanser.getJob());
			System.out.println("power : " + necromanser.getPower());
			System.out.println("hp : " + necromanser.getHp());
			System.out.println("mana : " + necromanser.getMana());
			System.out.println("weapons: " + necromanser.getWeapons());
		}else if(j == 4) {
			System.out.println("character : " + amazon.getJob());
			System.out.println("power : " + amazon.getPower());
			System.out.println("hp : " + amazon.getHp());
			System.out.println("mana : " + amazon.getMana());
			System.out.println("weapons: " + amazon.getWeapons());
		}else if(j == 5) {
			System.out.println("character : " + druid.getJob());
			System.out.println("power : " + druid.getPower());
			System.out.println("hp : " + druid.getHp());
			System.out.println("mana : " + druid.getMana());
			System.out.println("weapons: " + druid.getWeapons());
		}else if(j == 6) {
			System.out.println("character : " + assasin.getJob());
			System.out.println("power : " + assasin.getPower());
			System.out.println("hp : " + assasin.getHp());
			System.out.println("mana : " + assasin.getMana());
			System.out.println("weapons: " + assasin.getWeapons());
		} else {
			System.out.println("character : " + paladin.getJob());
			System.out.println("power : " + paladin.getPower());
			System.out.println("hp : " + paladin.getHp());
			System.out.println("mana : " + paladin.getMana());
			System.out.println("weapons: " + paladin.getWeapons());
		}
	}

	public static String setCharacterJob(String job, int j) {
		switch(j) {
			case 1:
				job = "야만용사"; 
				System.out.println(job + "를 선택하였습니다.");
				break;
			case 2:
				job = "소서리스";
				System.out.println(job + "를 선택하였습니다.");
				break;
			case 3:
				job = "네크로맨서"; 
				System.out.println(job + "를 선택하였습니다.");
				break;
			case 4:
				job = "아마존";
				System.out.println(job + "를 선택하였습니다.");
				break;
			case 5:
				job = "드루이드";
				System.out.println(job + "를 선택하였습니다.");
				break;
			case 6:
				job = "어쌔신";
				System.out.println(job + "를 선택하였습니다.");
				break;
			case 7:
				job = "팔라딘";
				System.out.println(job + "를 선택하였습니다.");
				break;
			default :
				System.out.println("없는 캐릭터입니다.");
		}
		return job;
	}
}
