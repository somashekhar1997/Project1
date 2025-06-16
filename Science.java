package login;

public class Science {
public static void main(String[] args) {
	
	int maths=85;
	int science=90;
	int english=88;
	
	int total=maths+science+english;
	
	double average=total/3.0;
	
	System.out.println("total marks :" +total);
	System.out.println("average marks (double):" +average);
	
	int averageint= total/3;
	System.out.println("Average Marks (int): " + averageint);
	
	
}
}
