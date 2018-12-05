public class Dice{
	private int value;
	private int side;

	public Dice(){
		side = 6;
		value = (int)(Math.random()*side)+1;
	}
	public Dice(int side){
		this.side = side;
		value = (int)(Math.random()*side)+1;
	}
	public int getValue(){
		return value;
	}
	public int getSides(){
		return side;
	}
	public void roll(){
		value = (int)(Math.random()*side)+1;
	}
	public String toString(){
		return "Numebr of sides: "+side+", Value: "+value;
	}



}