class Person
{
  String name="Bharath";
  int adr=97453;
  int address=445;
  public void show()
  {
    System.out.println("Person Name is ="+ name);
    System.out.println("Person adr is ="+ adr);
    System.out.println("Person address is ="+ address);
  }
}
class Student extends Person
  {
    int std_Id=86895;
    char g='B';
        public void message()
      {
    System.out.println("Person student id  is ="+ std_Id);
    System.out.println("Person blood group is ="+ g);
    
      }
  }
class CollegeStudent extends Student
  {
    int clg_Id=7484;
    String clg_Name="Madanapalli Institute of Technology and Science";
        public void display()
      {
    System.out.println("Person clg id is ="+ clg_Id);
    System.out.println("Person  is clg name ="+ clg_Name);
      }
  }
      class Multi
        {
          public static void main(String []args)
          {
            CollegeStudent s=new CollegeStudent();
             s.show();
             s.message();
             s.display();
          }
        }
            

     
    

      
      
  
