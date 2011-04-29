   package mylibrary.myalgorithms;
   import mylibrary.mydatastructures.StudentRecord;
     
    public class Sort
   {
       public static void bubble(String[] data)
      {
         int length = data.length;
         int last = length - 1;
         for (int i = 0; i < length; i++) {
            for (int j = 0; j < last; j++) {
               if (data[j].compareTo( data[j + 1])> 0) {
                  swapString(data, (j + 1), j);
               }
            }
            last--;
         }
      
      }
       public static void bubble(int [] data)
      {
       
         int length = data.length;
         int last = length - 1;
         for (int i = 0; i < length; i++) {
            for (int j = 0; j < last; j++) {
               if (data[j] > data[j + 1]) {
                  swapInt(data, (j + 1), j);
               }
            }
            last--;
         }
      
      }
    
       public static void bubble(StudentRecord [] data)
      {
         int length = data.length;
         int last = length - 1;
         String temp1;
         String temp2;
         for (int i = 0; i < length; i++) {
            for (int j = 0; j < last; j++) {
               temp1 = data[j].getLastName();
               temp2 = data[j+1].getLastName();
               if (temp1.compareTo( temp2)> 0) {
                  swapRecord(data, (j + 1), j);
               }
            }
            last--;
         }
      
      
      }
   
   
       public static void insertion (String [] data)
      {
         int length = data.length;
         for (int i = 1; i < length; i++) {
            for (int j = 0; j < length; j++) {
               if (data[i].compareTo(data[j])>0) {
                  shiftString(data, i, j);
                  break;
               }
            }
         }
      
      
      }
    
       public static void insertion(int[] data)
      {
         int length = data.length;
         for (int i = 1; i < length; i++) {
            for (int j = 0; j < length; j++) {
               if (data[i] <= data[j]) {
                  shiftInt(data, i, j);
                  break;
               }
            }
         }
      
      
      }
      
       public static void insertion (StudentRecord [] data)
      {
         int length = data.length;
         String temp1;
         String temp2;
         for (int i = 1; i < length; i++) {
            for (int j = 0; j < length; j++) {
               temp1 = data[j].getLastName();
               temp2 = data[j+1].getLastName();
               if (temp1.compareTo(temp2)>0) {
                  shiftRecord(data, i, j);
                  break;
               }
            }
         }
      
      }
   	
   	
       public static void swapInt(int[] array, int index, int index2) {
         int temp = array[index];
         array[index] = array[index2];
         array[index2] = temp;
      }   //swap
      
       public static void swapString(String[] array, int index, int index2) {
         String temp = array[index];
         array[index] = array[index2];
         array[index2] = temp;
      }   //swap
      
       public static void swapRecord(StudentRecord[] array, int index, int index2) {
         StudentRecord temp = array[index];
         array[index] = array[index2];
         array[index2] = temp;
      }   //swap
   
   
       public static void shiftInt(int[] array, int index, int insert) {
      
         int temp = array[index];
         for (int i = index; i > insert; i--) {
            array[i] = array[i - 1];
         }
         array[insert] = temp;
      
      }
       public static void shiftString(String[] array, int index, int insert) {
      
         String temp = array[index];
         for (int i = index; i > insert; i--) {
            array[i] = array[i - 1];
         }
         array[insert] = temp;
      
      }
       public static void shiftRecord(StudentRecord[] array, int index, int insert) {
      
         StudentRecord temp = array[index];
         for (int i = index; i > insert; i--) {
            array[i] = array[i - 1];
         }
         array[insert] = temp;
      
      }
   
   
   
   }