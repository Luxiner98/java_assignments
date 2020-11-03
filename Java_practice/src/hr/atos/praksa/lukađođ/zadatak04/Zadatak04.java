package hr.atos.praksa.lukaðoð.zadatak04;

public class Zadatak04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers={1,2,3,4,5};
		
		for(int i=0;i<numbers.length;i++){
			if(numbers[i] % 2 == 0){
				System.out.println(numbers[i]+" je paran broj");
			}else if(numbers[i] % 2 != 0){
				System.out.println(numbers[i]+" je neparan broj");
			}
		}
	}

}
