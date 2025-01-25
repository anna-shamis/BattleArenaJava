package com.battleArenaOne;

public abstract class Character {
/*1. Character (Base Class)
o Attributes:
= String name
# int health
int attackPower
o Methods:
m void attack(Character target)
boolean isAlive()
= void displayStats()
*/
	public  String name;
	public int health;
	public int attackPower;

	public Character(String name) {
		this.name=name;// TODO Auto-generated constructor stub
	}
		 public void attack(Character target) {
		     System.out.println("\n\t\t=== BATTLE STATUS ===\n");
		 double missAnAttack=.2;
		 double anAttack=Math.random();
		 if (missAnAttack<anAttack) {
	        int damage=(int)(anAttack*(attackPower))+10; // Randomized attack damage
	             target.health-=damage;
	         
	         System.out.println(name+" attacks "+target.name +"! The attack power was: "+ damage + ".\n");    
				 }
		 else { System.out.println("Attention! "+name+" missed the attack");}
   
	 }
	   public boolean isAlive() {
	        return health > 0;
	    }	
	   public void displayStats() {
			    System.out.printf("%-15s %-15s %-18s%n", name, "Health: " + health, "Attack Power: " + attackPower);
		}
}
