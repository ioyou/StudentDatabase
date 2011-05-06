   package mylibrary.myalgorithms;
    public class Search
   {
   
       public static int binary (int[] data, int key)
      {
         int bottom = 0;
         int top = data.length - 1;
         int middle;
         int count;
         boolean found = false;
         while ((bottom <= top) && (found == false))
         {
            middle = (bottom + top) / 2;
            if (data [middle] == key)
            {
               found = true;
               return middle;
            }
            else
            {
               if (data [middle] < key)
                  bottom = middle + 1;
               else
                  top = middle - 1;
            }
         }
         return -1;
      }
       public static int binary (String [] data, String key)
      {
      
         int bottom = 0;
         int top = data.length - 1;
         int middle;
         int count;
         boolean found = false;
         while ((bottom <= top) && (found == false))
         {
            middle = (bottom + top) / 2;
            if (data [middle].equals( key))
            {
               found = true;
               return middle;
            }
            else
            {
               if (data [middle].compareTo(key) >0)
                  bottom = middle + 1;
               else
                  top = middle - 1;
            }
         }
         return -1;
      }
   
      
       public static int sequential (int []data, int key)
      {
         int length = data.length;
         int count = 0;
         for (int i = 0 ; i < length ; i++)
         {
            if (data [i] == key)
            {
               count = i + 1;
               break;
            }
            else
               count = -1;
         }
         return count;
      }
   
      
       public static int sequential (String [] data, String key)
      {
      
         int length = data.length;
         int count = 0;
         for (int i = 0 ; i < length ; i++)
         {
            if (data [i].equals(key))
            {
               count = i + 1;
               break;
            }
            else
               count = -1;
         }
         return count;
      }
   
   }

