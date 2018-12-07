public class DiceRunner{
	public static void main(String[]args){
		Dice one = new Dice();
		Dice two = new Dice();
		boolean snakeEyes = false;
		int tries = 0;
		//Test 1
		System.out.println("Test 1:");
		do{
			tries++;
			one.roll();
			System.out.println("Die 1 " +one);
			two.roll();
			System.out.println("Die 2 "+ two);
			if(one.getValue() == 1 && two.getValue() == 1){
				snakeEyes = true;
				break;
			}
			System.out.println();
		}while(snakeEyes == false);
		System.out.println("\nIt took "+tries+" rolls for each die to get snake eyes");

		//Test 2
		System.out.println("Test 2:");
		DiceHolder cup = new DiceHolder();
		for(int i = 0; i < 6; i++){
			cup.addDie(new Dice((int)(Math.random()*20)+1));
			System.out.println(cup);
		}

		System.out.println("Dice after shaking the cup:");
		cup.shake();
		System.out.println(cup);
	}

}