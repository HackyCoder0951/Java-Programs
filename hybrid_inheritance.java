class student {
	int roll_number;
	void get_number(int n) {
		roll_number = n;
	}
	void put_number() {
		System.out.println("Roll No:  " + roll_number);
	}
}
class test extends student {
	float part1, part2;
	void get_marks(float m1, float m2) {
		part1 = m1;
		part2 = m2;
	}
	void put_marks() {
		System.out.println("Marks obtained: ");
		System.out.println("Part 1= " + part1);
		System.out.println("Part 2= " + part2);
	}
}
interface sports {
	float sportswt = 6.0F;
	void putwt();
}
class results extends test implements sports {
	float total;
	public void putwt() {
		System.out.println("Sports wt=  " + sportswt);
	}
	void display() {
		total = part1 + part2 + sportswt;
		put_number();
		put_marks();
		putwt();
		System.out.println("Total score=" + total);
	}
}
class hybrid_inheritance {
	public static void main(String[] Args) {
		results R = new results();
		R.get_number(1234);
		R.get_marks(27.5F, 33.0F);
		R.display();
	}
}
