package geekforgeeksEasy;

import java.util.ArrayList;

public class LoopOne {
	/*
	 * For a given N, prints the sum of even and odd integers of the first N natural
	 * numbers. Input: N = 6 Output: 12 9 Explanation: Natural numbers less than 6
	 * are 1 2 3 4 5 6  
	 * So the sum of even number = 2 + 4 + 6 = 12. 
	 * and the sum of odd number = 1 + 3 + 5 = 9. 
	 */

	public static void main(String[] args) {
		
		System.out.println(getSum(6));
	}
	
	public static ArrayList<Integer> getSum(int N){
        ArrayList<Integer> areven = new ArrayList<Integer>();
        ArrayList<Integer> arodd = new ArrayList<Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        int sumofeven =0;
        int sumofodd =0;
        for(int i=0;i<=N;i++){
            if(i%2==0 & i!=1){
                areven.add(i);
            }else{
                arodd.add(i);
            }
        }
        
        for(int j=0;j<areven.size();j++){
             sumofeven = sumofeven + areven.get(j);
        }
        
        for(int k=0;k<arodd.size();k++){
             sumofodd = sumofodd + arodd.get(k);
        }
        
        result.add(sumofeven);
        result.add(sumofodd);
        return result;
        
        
    }

}
