import java.io.*;
import java.util.*;
public class HashTableLab
{
   public static void generateFile() throws IOException
   {
      System.setOut(new PrintStream(new FileOutputStream("hashData.txt")));
      
      for(int i = 0; i<= 9999; i++)
      {
         Employee e = new Employee(i);
         System.out.println(e);
      }
   }
   
   public static void readFile(String fileName, HashTable ht) throws IOException
   {
      Scanner input = new Scanner(new File(fileName));
      
      while(input.hasNextLine())
      {
         String line = input.nextLine();
      
         String[] parts = line.split(" ");
         int num = Integer.parseInt(parts[0]);
         String name = parts[1];
      
         ht.add(new Employee(num, name));
      }
   
      input.close();
   }
   
   public static void main(String[] args) throws IOException
   {
      Scanner input = new Scanner(System.in);
      //generateFile();
      HashTable ht = new HashTable();
   
      readFile("hashData.txt", ht);
      
      System.out.println("What is the name? ");
      String name = input.next();
      
      long start = System.currentTimeMillis();
      int employeeNum = ht.search(name);
      long end = System.currentTimeMillis();
      System.out.println(employeeNum);
      System.out.println(end-start);
   }
}
