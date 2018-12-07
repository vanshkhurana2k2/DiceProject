import java.lang.Math;
public class DiceRunner{
	public static void main(String[]args){
		Die die1 = new Die();
		Die die2 = new Die();
		int c = 0;
		do{
			c++;
			System.out.println("Roll "+c+":");
			die1.roll();
			die2.roll();
			System.out.println(die1.toString());
			System.out.println(die2.toString());
		}while((die1.getValue()!= 1)||(die2.getValue()!= 1));
		System.out.println("Hey, look! You got snake eyes!\n\n");

		int r = 0;
		DiceHolder holder = new DiceHolder();
		for(int i = 0; i < 6; i++){
			r = (int)(Math.random()*17)+1;
			holder.addDie(new Die(r));
			System.out.println(holder);
		}
		holder.shake();
		System.out.println(holder);
	}
}