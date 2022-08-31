package Phase1Project;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class p1class {
    public static void main(String[] args) {
        System.out.println("**********************************************");
        System.out.println("Welcome to Virtual key Repository Application:");
        System.out.println("                      Developed by O.Koundinya");
        System.out.println("**********************************************");
        firstmenuselection();
    }
    private static void closeApp() {
        System.out.println("Closing Application...Thank You!");
    }
    public static void firstmenuselection()
    {
        String[] options = {"1) I would like to retrieve a file.",
                            "2) I wish to perform Following Business Operations.",
                            "3) Close the Application."};
        int[] i = {1,2,3};
        for(int ch = 0;ch<i.length;ch++)
        {
            System.out.println(options[ch]);
        }
        Set<String> files = new HashSet<>();
        files.add("Sort.txt");
        files.add("abstract.txt");
        files.add("New.txt");
        System.out.println("\nEnter your choice:\t");
        Scanner sc = new Scanner(System.in);
        try {
            int select= sc.nextInt();
            for(int j = 0;j<=i.length;j++)
            {
                if(select == j)
                {
                    switch(select)
                    {
                    case 1:
                    	System.out.println(files);
                        firstmenuselection();
                        break;
                    case 2:
                        secondmenuselection(files);
                        break;
                    case 3:
                        closeApp();
                        break;
                    }
                }
            }
    }
        catch(Exception e)
        {
            System.out.println("Please Donot enter alpha numeric values");
        }
        }
    public static void secondmenuselection(Set<String> files)
    {
        String[] choices = {"1) I wish to Add a File",
                            "2) I wish to Delete a File",
                            "3) I wish to search for a File."};
        int i[] = {1,2,3};
        for(int c=0;c<i.length;c++)
        {
            System.out.println(choices[c]);
        }
        System.out.println("\nEnter your choice:\t");
        Scanner sc = new Scanner(System.in);
        try {
            int select = sc.nextInt();
            for(int j = 0;j<=i.length;j++)
            {
                if(select == j)
                {
                    switch(select)
                    {
                    case 1:
                        System.out.println("Enter the file you want to add :");
                        files.add(sc.next());
                        System.out.println(files);
                        secondmenuselection(files);
                        break;
                    case 2:
                        System.out.println("Enter the file you want to delete :");
                        files.remove(sc.next());
                        secondmenuselection(files);
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
                        firstmenuselection();
                        break;
                    }
                }
            }
        }
        catch(Exception e)
        {
            System.out.println("Please Donot enter alpha numeric values :");
        }
    }
}