package greatestDifference;

public class GreatestDifferenceFinder {
	int greatestDifference(int[] intArray) {
		int max = intArray[0];
		int min = intArray[0];
		
		if(intArray.length < 2) {
			return 0;
		}
		else {
			for(int num : intArray) {
				if(num > max) {
					max = num;
				}
				else if (num < min){
					min = num;
				}
				
			}
			return max - min;
		}
	}
	

}
