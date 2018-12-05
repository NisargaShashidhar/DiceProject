import java.util.*;

public class DiceHolder{

	private ArrayList<Dice> holder;

	public DiceHolder(){
		holder = new ArrayList<Dice>();
	}

	public int addDie(Dice die){
		if(holder.size() < 6){
			holder.add(die);
			return 1;
		}
		else
			return 1;
	}

	public void shake(){
		for(int i = 0; i < holder.size(); i++){
			holder.get(i).roll();
		}
	}

	public String toString(){
		String output;
		for(int i = 0; i < holder.size(); i++){
			output += holder.get(i).toString()+"\n";
		}
		return output;
	}

}