package Phase1Project;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

 

public class VirtualKey {

 

    public static void main(String[] args) {
        
        System.out.println("**********************************************");
        System.out.println("Welcome to Virtual key Repository Application:");
        System.out.println("--------------------> Developed by O.Koundinya");
        System.out.println("**********************************************");
        optionSelection();
    }
        public static void optionSelection()
        {
            String[] choice = {"1) I would like to retrive a file.",
                               "2) I wish to perform Following Business Operations.",
                               "3) Close the Application."};
            int [] arr = {1,2,3};
            for(int i=0; i<choice.length;i++)
            {
                System.out.println(choice[i]);
            }
            Set<String> files = new TreeSet<>();
            files.add("New.txt");
            files.add("Sort.txt");
            files.add("Abstract.txt");
            //System.out.println(files);
            System.out.println("\nEnter Your choice");
            Scanner sc = new Scanner(System.in);
            try
	            {
	            int options = sc.nextInt();
	            for(int c=0; c<=choice.length;c++)
	            {
	            	if(c == options)
	            	{
	                    switch(options)
	                    {
	                    case 1 : 
	                        System.out.println("Files Present in directory are :" +files);
	                        optionSelection();
	                        break;
	                    case 2:
	                        chooseOption(files);    
	                    case 3 :
	                          closeApp();
	                          break;
	                      }
	                  }
	              }
	                }
            catch(Exception e)
            {
            	System.out.println("Please Do not Enter alpha-numeric values");
            }
        }
        private static void closeApp() {
            System.out.println("Closing the Application...Thank You");            
        }
        private static void chooseOption(Set<String>files)
        {
            String[] str = {"1) I wish to Add a File",
                    "2) I wish to Delete a File",
                    "3) I wish to search for a File."};
            int ch[] = {1,2,3};
            for(int s= 0; s<ch.length; s++)
            {
                System.out.println(str[s]);
            }
            Scanner sc= new Scanner(System.in);
            System.out.println("\nEnter your choice");
            int select = sc.nextInt();
            try
            {
            for(int s =0;s<=ch.length;s++)
            {
            	if(s == select)
            	{
                    switch(select)
                    {
                    case 1:
                        System.out.println("Enter the file you wish to add.");
                        files.add(sc.next());
                        System.out.println(files);
                        break;
                    case 2:
                        System.out.println("Contents in file are:"+files);
                        System.out.println("\nEnter the file name you want to remove.");
                        String rf= sc.next();
                        files.remove(rf);
                        System.out.println(files);
                        break;
                    case 3:
                        System.out.println("Enter the file you want to search:");
                        String filename = sc.next();
                        if(files.contains(filename))
                        {
                            System.out.println("File found in arraylist");
                        }
                        else
                        {
                            System.out.println("File Not Found");
                        }
                    default :
                    	System.out.println("Taking Back to main menu");
                    	optionSelection();
                    }
            	}
            }
        }
            catch(Exception e)
            {
            	System.out.println("Please Do not Enter alpha-numeric values");
            }
            }
        }