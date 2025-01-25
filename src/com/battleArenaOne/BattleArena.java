package com.battleArenaOne;
import java.util.Scanner;
public class BattleArena {

	void startBattle(Character player, Character enemy) {
	       
		     Scanner scan = new Scanner(System.in);	
			  	String gameOver="\nThank you for playing! See you next time.\n\n\t\t=== GAME OVER ===";
			  	int countAttacks=1;
	       while (player.isAlive()&&enemy.isAlive()) {
	    	    showMenu(player, enemy);
	    	
	    	    if (scan.hasNextInt()) {
	                int action = scan.nextInt();
	                
			  	if (action==1) {
			   player.attack(enemy);
			  		  	if (!enemy.isAlive()) {
			  		  		System.out.println("\nCongratulations! "+enemy.name + " is dead! You won the battle in round "+countAttacks+".\n"+gameOver);
			  		  		break;}
				enemy.attack(player);
				countAttacks++;
					if (!player.isAlive()) {
						System.out.println("Sorry, you are dead! Your health: "+player.health+" .\n"+gameOver);
						break;}				}
	
			  	else if (action==0) {
	        	System.out.println(gameOver);
	        	break;
	    	    } else if (action==2) {
	    	    	addHealth(player);
	    	    }
	    	    else {
	                System.err.println("Invalid input. Please enter a valid action (0,1 or 2).");
	                scan.next(); }
	        }
	       }
	     scan.close();
	}
	public void showMenu(Character player, Character enemy) {
	        System.out.println("\n\t\t=== CHARACTERS STATUS ===\n");    
	       player.displayStats();
            enemy.displayStats();
            System.out.println("\n\t\t === BATTLE MENU ===\n");
	        System.out.println("\t\tChoose your action:\n\t\t0. Quit\n\t\t1. Attack\n\t\t2. Add +10 to health");
       }
		
	public void addHealth( Character player) {
		player.health+=10;}
	}

	