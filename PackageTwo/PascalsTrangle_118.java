/**
 *
 * @author chandantroughia
 * @date 07/06/2017
 * 
 */
package PackageTwo;

import java.awt.List;
import java.util.ArrayList;

public class PascalsTrangle_118 {

	public static ArrayList<ArrayList<Integer>> pascalTriangle(int nRows){
		ArrayList<ArrayList<Integer>> main = new ArrayList<ArrayList<Integer>>();
		if(nRows == 0) return main;
		
		for(int i = 0; i < nRows; i++){
			ArrayList<Integer> row = new ArrayList<Integer>();
			for(int j = 0; j < i + 1; j++){
				if(j == 0 || j == i){
					row.add(1);
				}else{
					row.add(main.get(i-1).get(j-1) + main.get(i-1).get(j));
				}
			}
			main.add(row);
		}
		
		return main;
		
	}
	
	
	
	public static void main(String[] args) {
		int n = 5;
		System.out.println(pascalTriangle(n));
	}
}
