import java.util.Scanner;
	abstract class Aliment {
		int amount, calorie;
		
		Aliment(int amount) {
			this.amount = amount;
		}
		
		void setCaloriePerGram(int calorie) {
			this.calorie = calorie;
		}
		
		int getAmount() {
			return amount;
		}
		
		int getCalorie() {
			return calorie * amount;
		}
	}

	class Riz extends Aliment {
		Riz(int amount) {
			super(amount);
			setCaloriePerGram(1);
		}
	}

	class Egg extends Aliment {
		Egg(int amount) {
			super(amount);
			setCaloriePerGram(2);
		}
	}

	
	class Baouf extends Aliment
	{
		Baouf(int amount) {
			super(amount);
			setCaloriePerGram(10);
		}
	}

	class Carrot extends Aliment
	{
		Carrot(int amount) {
			super(amount);
			setCaloriePerGram(1);
		}
	}

