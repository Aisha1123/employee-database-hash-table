public class Employee implements Comparable 
{ 
   private int employeeNumber;  
   private String name;
    
   public Employee(int n)
   {
      employeeNumber = n;
      name = generateRandomName();
   }
   
   public Employee(int n, String name)
   {
      employeeNumber = n;
      this.name = name;
   }
   
   public int getEmployeeNumber()
   {
      return employeeNumber;
   }
   
   public String getName()
   {
      return name;
   }
   
   public String toString()
   {
      return employeeNumber + " " + name;
   }
   
   public int hashCode()
   {
      return name.hashCode();
   }
   
   public boolean equals(Object o)
   {
      if(o==this)
         return true;
      if(!(o instanceof Employee))
         return false;
      Employee other = (Employee)o;
      return this.name.equals(other.name);
   }
   
   public int compareTo(Object o)
   {
      Employee other = (Employee)o;
      return this.name.compareTo(other.name);
   }
   
   public String generateRandomName()
   {
      String vowels = "aeiou";
      String consonants = "bcdfghjklmnpqrstvwxyz";
      int randLength = (int)(Math.random()*(8-3+1))+3;
            
      String name = "";
      
      for(int i = 0; i<randLength; i++)
      {
         if(i%2 == 0)
         {
            int randConsonant = (int)(Math.random()*21);
            String consonant = consonants.substring(randConsonant, randConsonant+1);
            name+=consonant;//use consonant
         }
         else
         {
            int randVowel = (int)(Math.random()*5);
            String vowel = vowels.substring(randVowel, randVowel+1);
            name+=vowel;//use vowel 
         }
      }
      return name;
   }
}
