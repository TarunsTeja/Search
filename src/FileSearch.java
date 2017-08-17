
import java.io.File;
//import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;

public class FileSearch {
	static Scanner sc = new Scanner(System.in);
	static String a ="";
   
    	public static void main(String[] args) {

    		SearchProcess fileSearch = new SearchProcess();
    		System.out.println("Enter the search item :");
    		a = sc.nextLine();

    	       
    		fileSearch.searchFolder(new File("D:/redis-unstable/"), a);
    		int count = fileSearch.getResult().size();
    		if(count ==0){
    		    System.out.println("\nNo result found!");
    		}else{
    		    System.out.println("\nFound " + count + " result!\n");
    		    for (String matched : fileSearch.getResult()){
    			System.out.println("Found : " + matched);
    		    }
    		}
    	  }

    	    	}
