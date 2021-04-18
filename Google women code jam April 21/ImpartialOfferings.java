import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ImpartialOfferings {
	public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int testCount = scanner.nextInt();
        List<String> finalDistribution = new ArrayList<String>();
        for(int test=1;test<=testCount;test++) {
        	int totalMinimumTreats = 0;
        	if(scanner.hasNextInt()) {
        		int petCount = scanner.nextInt();
        		
        		int[] petSize = new int[petCount];
        		
        		for(int pet=0;pet<petCount;pet++) {
        			if(scanner.hasNextInt())
        				petSize[pet] = scanner.nextInt();
        		}
        		
        		totalMinimumTreats = distributeMinimunTreats(petSize);
        		
        	}
        	finalDistribution.add("Case #"+test+": "+totalMinimumTreats);
        }
        
        for(int test=1;test<=testCount;test++) {
        	System.out.println(finalDistribution.get(test-1));
        }
        scanner.close();
    }
	
	private static int distributeMinimunTreats(int[] petSize) {
		int totalTreats = 0;
		int currentTreat = 1;
		Arrays.sort(petSize);
		int previousPetSize = 0;
		for(int pet=0;pet<petSize.length;pet++) {
			if(pet == 0)
				totalTreats+=currentTreat;
			if(pet>0 && petSize[pet]== previousPetSize) {
				totalTreats+=currentTreat;
			} else if(pet>0 && petSize[pet]!= previousPetSize) {
				currentTreat+=1;
				totalTreats+=currentTreat;
			}
			previousPetSize = petSize[pet];
		}
		
		return totalTreats;
	}
}
