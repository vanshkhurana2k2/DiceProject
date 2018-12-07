import java.util.ArrayList;
public class DiceHolder{
	private ArrayList <Die> holder;
	private Die die;
	public DiceHolder(){
		holder = new ArrayList <> ();
	}
	public int addDie(Die die){
		holder.add(die);
		if(holder.size() > 6){
			return -1;
		}
		else
			return 1;
	}
	public void shake(){
		for(int i = 0; i < holder.size(); i++){
			(holder.get(i)).roll();
		}
	}
	public String toString(){
		String list = "";
		for(int i = 0; i < holder.size(); i++){
			list += ""+holder.get(i).toString()+"\n";
		}
		return list;
	}
}