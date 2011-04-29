   package mylibrary.mydatastructures;
/**
 *
 * @author nieschri125
 */
    public class StudentRecord extends Record {
   
      private String firstName;
      private String lastName;
      private int studentNumber;
   
       public StudentRecord(String fname, String lname, int number) {
         firstName = fname;
         lastName = lname;
         studentNumber = number;
      }
   
       public StudentRecord() {
         firstName = "";
         lastName = "";
         studentNumber = 0;
      }
       public String getRecord()
      {	
         String number = Integer.toString(studentNumber);
         String record =( firstName + " " + lastName + " " + number);
         return record;
      }
       public void setNull()
      {
         firstName = "";
         lastName = "";
         studentNumber = -1;
      }
       public String getFirstName() {
         return firstName;
      }
   
       public int getStudentNumber() {
         return studentNumber;
      }
   
       public String getLastName() {
         return lastName;
      }
   
       public void setFirstName(String fName) {
         firstName = fName;
      }
       public void setLastName(String lName)
      {
         lastName = lName;
      }
       public void setStudentNumber(int n)
      {
         studentNumber = n;
      }
   }
