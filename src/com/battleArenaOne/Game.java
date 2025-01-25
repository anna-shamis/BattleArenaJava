package com.battleArenaOne;

import java.util.Scanner;

public class Game{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("\n\t\tWelcome to the game!\n\n\t\t=== BATTLE ARENA ===\n");
		System.out.println("\t\tChoose your character:");
		System.out.println("\t\t1. Warrior\n\t\t2. Mage\n\t\t3. Archer");
		
		int choice = scanner.nextInt();
		Character player=null;

		switch (choice) {
		case 1:
		player = new Warrior("Player Warrior");
		break;
		case 2:
		player = new Mage("Player Mage");
		break;
		case 3:
		player = new Archer("Player Archer");
		break;
		default:
			extracted();}
		
		Character enemy = createRandomEnemy();

		System.out.println("\n\t\t Let the game begin!\n\tAn enemy has appeared! Good luck!!! "+"\uD83D\uDE04");

		BattleArena arena = new BattleArena();
		arena.startBattle(player, enemy);
		scanner.close();
	}
		private static void extracted() {
		throw new IllegalArgumentException("Invalid choice");
	}  
		public static Character createRandomEnemy() {
        int enemyChoice = (int)(Math.random() * 3);  // Random number between 0 and 2
        switch (enemyChoice) {
            case 0:
                return new Warrior("Enemy Warrior");
            case 1:
                return new Mage("Enemy Mage");
            case 2:
                return new Archer("Enemy Archer");
            default:
                throw new IllegalArgumentException("Invalid enemy choice");
        }}
}
