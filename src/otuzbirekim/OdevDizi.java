package otuzbirekim;

public class OdevDizi {

	public static void main(String[] args) {

		

		// bir dizide 13 var ise 13 ve bir sonraki eleman
				// toplama eklenmeden toplam sonucu bulan kod
				

				int toplam = 0;
		        int nums[] = { 13 , 12 , 8 , 13 , 14 , 28 , 13 , 12 , 3 , 13 , 13 , 5 , 7 , 13 };

		        for (int i = 0; i < nums.length; i++) {
		            if (nums[i] == 13) {
		                if (i != nums.length - 1) {
		                    i++;
		                    if(nums[i]==nums[i-1]) {
		                        i--;
		                    }
		                }
		            } else {
		                toplam += nums[i];
		            }
		        }
		        System.out.println("Toplam : " + toplam);

	}
}
