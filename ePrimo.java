package sergio;
/**
 * check if the number is Prime Or not
 * @author Sergio Coniglio
 * @version 1.0
 * @since oct-2024
 * 
 */

import java.util.ArrayList;
import java.util.Scanner;


public class ePrimo {

	public static boolean x(String y) {
		try {
			int x = Integer.parseInt(y);
			return true;
		}catch (Exception ex) {
		System.err.println("non e numero primo");
			return false;
		}
	}
	
	public static boolean bol(int x) {
		boolean answer = false;
		ArrayList<Integer> ls = new ArrayList<>();
		ls.add(1);
		ls.add(x);
		if (x>0) {
			for(int i =2; i<x;i++) {
				if ((x%i)!=0) {
					//answer = true;
				}else {
					ls.add(i);
					//answer = false;
				}
			}
		}
		ls.sort(null);
		for (int i : ls)
			System.out.print(i + " ");
		System.out.println();
		if((ls.size())>2){
			answer = false;
		}else
			answer = true;
		return answer;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("insert a numerb");
		String an = in.next();
		int x = 0;
		if (!x(an)){
			System.out.println("non numero");
		}else {
			x = Integer.parseInt(an);
		}
		
		if(bol(x)) {
			System.out.println("Numero Primo");
		}else {
			System.out.println("Non numero primo");
		}
		
		System.out.println("----------------------------------------------------------");
		System.out.println("-------------------------THE END!!------------------------");
		System.out.println("----------------------------------------------------------");
		
	}

}
