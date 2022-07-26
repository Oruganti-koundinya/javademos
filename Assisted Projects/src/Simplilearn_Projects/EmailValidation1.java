package Simplilearn_Projects;

class EmailValidation1 { 
    public static void main(String[] args) 
    { 
      String[] email = { "torentson.sort@little.com", "oruganti.koundinya@gmail.com", "bharath.kumar@gmail.com", "radha.krishna@yahoo.com", "krishna.chaitanya@outlook.com" };
     
      //Giving boolean statement to search email_id  
      boolean searchmailid = false; 
        String searchemail = "torentson.sort@little.com";
       
        //condition for checking email id
        for (int i = 0; i <email.length; i++) {
       if(searchemail == (email[i])) {
           
    	   //check condition for string entered by user 
    	   searchmailid = true; 
          
            }
        }
       //Condition if true returns 1st print statement.
       if(searchmailid)
          System.out.println(searchemail +"-> Email_id found ");
        else
          System.out.println(searchemail +"-> Unable to find your email_id");
    }
}