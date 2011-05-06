   package mylibrary.myio.myfiles;
   
   import mylibrary.mydatastructures.StudentRecord;
   import java.io.*;
   import java.util.*;
   
    public class RandomFile implements DataFile{
      final static int FIELD_SIZE = 20;
      private final long RECLEN;
      private String fileName;
      private RandomAccessFile raf;
      private long numRecords;
       
       public RandomFile (String fn, long length)
      {
         this.fileName = fn;
         this.RECLEN = length;
      }
       public void prepareInputFile ()
      {
         try
         {
            raf=new RandomAccessFile(fileName, "rw"); 
         }
             catch (FileNotFoundException e)
            {
               System.out.println ("Error - this RandomAccess input file does not exist");
            }
         try
         {
            numRecords = raf.length() /RECLEN;
         }
             catch(IOException e)
            {
               System.out.println("error=" + e.toString());
            }
      } 
       public void prepareOutputFile ()
      {
         try
         {
            raf = new RandomAccessFile (fileName,"rw"); 
             
         }
             catch (IOException e)
            {
               System.out.println ("error=" + e.toString ());
            } // close catch
      
      }
     
       public StudentRecord getNextRecord ()
      {
         StudentRecord newRecord = new StudentRecord ();
         try
         {
            raf.seek(0);
         
            newRecord.setStudentNumber(raf.readInt());
         	
            //String Buffers allow String building
            StringBuffer fn = new StringBuffer ("");
            String firstName;
          
            StringBuffer ln = new StringBuffer ("");
            String lastName;
         
         	//Read in first name one char at a time
            for(int i = 0; i < FIELD_SIZE; i++)
               fn.append(raf.readChar());
         	
            //Trims any blank space if there are empty characters
            firstName = fn.toString ().trim ();
         
         
         	//Read in last name one char at a time
            for(int i = 0; i < FIELD_SIZE; i++)
               ln.append(raf.readChar());
         	
            lastName = ln.toString ().trim ();
         
            newRecord.setFirstName(firstName);
            newRecord.setLastName(lastName);
         
            
         
            raf.close(); 
         
           
         } 
             catch (IOException e)
            {
               System.out.println ("error=" + e.toString ());
            } // close catch
      
         return newRecord;      
      } 
       public StudentRecord getNextRecord (long recordNumber)
      {
         StudentRecord newRecord = new StudentRecord ();
      
         try
         {
            raf.seek(RECLEN * recordNumber);
         
            newRecord.setStudentNumber(raf.readInt());
         	
            //String Buffers allow String building
            StringBuffer fn = new StringBuffer ("");
            String firstName;
          
            StringBuffer ln = new StringBuffer ("");
            String lastName;
         
         	//Read in first name one char at a time
            for(int i = 0; i < FIELD_SIZE; i++)
               fn.append(raf.readChar());
         	
            //Trims any blank space if there are empty characters
            firstName = fn.toString ().trim ();
         
         
         	//Read in last name one char at a time
            for(int i = 0; i < FIELD_SIZE; i++)
               ln.append(raf.readChar());
         	
            lastName = ln.toString ().trim ();
         
            newRecord.setFirstName(firstName);
            newRecord.setLastName(lastName);
         
            
         
            raf.close(); 
         
           
         } 
             catch (IOException e)
            {
               System.out.println ("error=" + e.toString ());
            } // close catch
      
         return newRecord;      
      }
   
       public void writeNextRecord (StudentRecord record)
      {
         try
         {
          	//Write the student number
				raf.seek(raf.length());
            raf.writeInt(record.getStudentNumber());
         
            StringBuffer fn = new StringBuffer ("");
         
            String firstName = record.getFirstName();
            for( int j = 0; j < FIELD_SIZE; j++ )
            {
               if(j < firstName.length())
               {
                  raf.writeChar( firstName.charAt( j ) );
               }	
               else
               {
               
                  raf.writeChar(' ');
               }
            }//end for
         
            StringBuffer ln = new StringBuffer ("");
         
            String lastName = record.getLastName();
            for( int j = 0; j < FIELD_SIZE; j++ )
            {
               if(j < lastName.length())
               {
                  raf.writeChar( lastName.charAt( j ) );
               }	
               else
               {
               
                  raf.writeChar(' ');
               }
            
            }//end for
         }//end try
         
             catch (IOException e)
            {
               System.out.println ("error=" + e.toString ());
            } // close catch
      
      }
      
       public void writeNextRecord (StudentRecord record, long recordNumber)
      {
      
      }
   
       public String getNext ()
      {
         return "";
         
      } 
       public void writeNext (String field)
      {
      }
      
       public void close ()
      {
         try
         {
            raf.close();
         }             
             catch (IOException e)
            {
               System.out.println ("error=" + e.toString ());
            } // close catch
      
      }
      
   	
        
       public void closeInput()throws IOException {
         raf.close();
      }
    
   
   }