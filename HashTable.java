import java.util.*;
public class HashTable
{
   private LinkedList<Employee>[] table;
   public HashTable()
   {
      table = new LinkedList[1000];
      for(int i = 0; i<table.length; i++)
      {
         table[i] = new LinkedList<>();
      }
   }
   
   public void add(Employee e)
   {
      int h = e.getName().hashCode();      
      int index = Math.abs(h) % table.length;
      table[index].add(e);
   }
   
   public int search(String name)
   {
      int h = name.hashCode();
      int index = Math.abs(h) % table.length;
   
      for(int i = 0; i < table[index].size(); i++)
      {
         Employee e = table[index].get(i);
      
         if(e.getName().equals(name))
            return e.getEmployeeNumber();
      }
      return -1;
   }
}