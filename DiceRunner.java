public class DiceRunner{
	public static void main(String[]args){
		Dice one = new Dice();
		Dice two = new Dice();
		boolean snakeEyes = false;
		int tries = 0;
		//Test 1
		do{
			one.roll();
			System.out.println("Dice 1 " +one);
			two.roll();
			System.out.println("Dice 2 "+ two);
			if(one.getValue() == 1 && two.getValue() == 1){
				snakeEyes = true;
				break;
			}
			tries++;
			System.out.println();
		}while(snakeEyes == false);
		System.out.println("\nIt took "+tries+" rolls for each die to get snake eyes");

	}

}