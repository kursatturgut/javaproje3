package halukhocadersarray;

public class array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /*
         * write a java program that calculates the average value of array elements
         * Print elements that are greater than avarage
         * (dizi elemanlarinin ortalama degerini hesaplayan ve
         * ortalamadan b�y�k olan elemanlari yazd�ran bir java programi yazin)
         * input[]= {1,2,3,4,5,6,7}
         * Output : 4
         */
	
		int input[]= {1,2,3,4,5,6,7};
	double toplam=0;
		
	
	for (int i = 0; i < input.length; i++) {
		toplam+=input[i];
	}
	
	System.out.println(toplam);
	double ortalama=toplam/input.length;
	System.out.println(ortalama);
	for (int i = 0; i < input.length; i++) {
		if (input[i]>ortalama) {
			System.out.print(input[i]);
		}
	}
	
	

	
	
	
	
	
	
	}

}
