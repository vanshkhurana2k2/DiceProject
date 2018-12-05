import java.util.ArrayList;
public class DiceHolder{
	private ArrayList <Integer> holder;
	private Die die;
	public DiceHolder(){
		ArrayList <Integer> holder = new ArrayList <> ();
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
			holder.get(i) = (int)(Math.random()*6);
		}
	}
	public String toString(){
		for(int i = 0; i < holder.size(); i++){
			System.out.println(holder.get(i));
		}
	}
}