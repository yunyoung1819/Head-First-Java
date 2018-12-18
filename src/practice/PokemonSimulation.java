package practice;

public class PokemonSimulation {
	
	public static void main(String[] args) {
		Pikachu p = new Pikachu();
		p.makeNoise();
		p.useSkill();
		
		Charmander c = new Charmander();
		c.makeNoise();
		c.useSkill();
		
		Squirtle s = new Squirtle();
		s.makeNoise();
		s.useSkill();
	}
}
