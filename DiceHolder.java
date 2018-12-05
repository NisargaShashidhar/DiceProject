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

}