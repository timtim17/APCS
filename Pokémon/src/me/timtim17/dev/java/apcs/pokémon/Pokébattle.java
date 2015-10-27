package me.timtim17.dev.java.apcs.pokémon;

import static java.lang.System.out;

import java.util.Random;
import java.util.Scanner;

public class Pokébattle {
	public static void main(String[] args) throws Exception {
		out.println("Pokémon\n=======");
		// battleStart();
		// damage();
		statTable("Alakazam", 40, 96, 52, 51, 121, 81, 107, new String[]{"Thunder Wave", "Hidden Power", "Psyco Cut", "Recover"});
	}
	
	public static void battleStart() {
		/*
		 * print "All the text"
		 */
		out.println("Another trainer is issuing a challenge!");
		out.println("Zebstrika appeared.");
		out.println("Which Pokémon do you choose?");
		out.println("You chose Arcanine!");
		out.println("It's a Pokémon battle between Arcanine and Zebstrika! Go!");
	}
	
	public static void damage() {
		/*
		 * damage = ((2*level+10)/250 * (attack/defense) * base + 2) * modifier
		 * modifier = SameTypeAttackBonus * random(0.85, 1.0)
		 */
		
		out.println("Zebstrika used Thunderbolt!");
		
		Scanner console = new Scanner(System.in);
		
		out.println("Zebstrika, what are your stats?");
		out.print("Level: ");
		int level = console.nextInt();
		while(level < 0) {
			out.print("Invalid Level\nLevel: ");
			level = console.nextInt();
		}
		out.print("Attack: ");
		int attack = console.nextInt();
		while(attack <= 0.0) {
			out.print("Invalid Attack\nAttack: ");
			attack = console.nextInt();
		}
		out.print("Base: ");
		int base = console.nextInt();
		while(base <= 0.0) {
			out.print("Invalid Base\nBase: ");
			base = console.nextInt();
		}
		out.print("STAB: ");
		double stab = console.nextDouble();
		while(stab <= 0.0) {
			out.print("Invalid STAB\nSTAB: ");
			stab = console.nextDouble();
		}
		out.println();
		
		out.println("Trainer, what are your Arcanine's stats?");
		out.print("Defense: ");
		int def = console.nextInt();
		while(def <= 0.0) {
			out.print("Invalid Defense\nDefense: ");
			def = console.nextInt();
		}
		out.print("HP: ");
		int hp = console.nextInt();
		while(hp <= 0.0) {
			out.print("Invalid HP\nHP: ");
			hp = console.nextInt();
		}
		out.println();
		
		console.close();
		
		// http://stackoverflow.com/questions/6078157/random-nextfloat-is-not-applicable-for-floats
		Random random = new Random();		
		
		double modifier = stab * (random.nextFloat() * 0.15 + 0.85);
		double damage = (((2 * level + 10) / 250) * (attack / def) * base + 2) * modifier;
		
		out.println("Arcanine sustained " + damage + " points damage. HP is now " + (hp - damage) + ".");
	}
	
	public static void statTable(String name, int level, int hp, int attack, int defense, int spAtk, int spDef, int speed, String[] movesLearned) throws Exception {
		/*
		 * Name		Alakazam
 		 * Level 	40
		 * ------------------------------
		 * HP		96
		 * ATTACK	52
		 * DEFENSE	51
		 * SP. ATK	121
		 * SP. DEF	81
		 * SPEED	107
		 * -------------------------------
		 * Moves Learned:	Thunder Wave, Hidden Power, Psycho Cut, Recover
		 */
		
		if(movesLearned.length < 1) throw new Exception("Not enough learned moves.");
		
		out.println("╔═══════╦═══════════════╦══════════════════════════════════════════════════╗");
		out.println("║\t║Name\t\t║" + name + "\t\t\t\t\t   ║");
		out.println("║\t║Level\t\t║" + level + "\t\t\t\t\t\t   ║");
		out.println("║\t╠═══════════════╬══════════════════════════════════════════════════╣");
		out.println("║\t║HP\t\t║" + hp + "\t\t\t\t\t\t   ║");
		out.println("║\t║ATTACK\t\t║" + attack + "\t\t\t\t\t\t   ║");
		out.println("║ (*･ω･)\t║DEFENSE\t║" + defense + "\t\t\t\t\t\t   ║");
		out.println("║\t║SP. ATK\t║" + spAtk + "\t\t\t\t\t\t   ║");
		out.println("║\t║SP. DEF\t║" + spDef + "\t\t\t\t\t\t   ║");
		out.println("║\t║SPEED\t\t║" + speed + "\t\t\t\t\t\t   ║");
		out.println("║\t╠═══════════════╩══════════════════════════════════════════════════╣");
		out.print("║\t║Moves Learned: " + movesLearned[0]);
		for(int i = 1; i < movesLearned.length; i++) {
			out.print(", " + movesLearned[i]);
		}
		out.print("\t   ║");
		out.println("\n╚═══════╩══════════════════════════════════════════════════════════════════╝");
	}
}
