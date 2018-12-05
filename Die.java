import java.lang.Math;
public class Die{
	public int sides;
	public int value;

	public Die(){
		sides = 6;
		value = (int)(Math.random()*6)+1;
	}
	public Die(int sides, int value){
		this.sides = sides;
		this.value = value;
	}
}