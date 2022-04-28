import java.util.Random;

public class Main {
	//туваиос аяихлос - ма елжамифетаи выяа
	
	//амоицы йаимоуяцио PROGECT, жтиавмы Main йкасг
	//COPY PASTE TEST2, доукеуеи!!

	public static void main(String[] args) {
	
				Random rand = new Random();
				int min=1;
				int max=3;
				int random = rand.nextInt(max - min +1)+ min;

				if(random == 1) {
					System.out.println(random+" "+"еККэДА");
				} else if(random == 2) {
					System.out.println(random+" "+"аЦЦКъА");
				}else if(random == 3) {
					System.out.println(random+" "+"цЕЯЛАМъА");
				}
		}
	}

