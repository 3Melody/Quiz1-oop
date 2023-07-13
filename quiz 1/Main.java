
class Main{
    public static void main(String[] args) {
        student s1 = new student("Jessadaporn");

        s1.NewID(65022409);
        s1.NewAddmission(2565);
        s1.NewGPA(3.65);
        s1.showdetails();
        
    }
}

class student{
    private int ID;
    public String Name;
    private int addmissionYear;
    private double GPA;

    student(String newName){
        this.ID = 123;
        this.Name = newName;
        this.addmissionYear = 2566;
        this.GPA = 4.00;
    }

    public int NewID(int MyID){
        this.ID = MyID;
        return ID;
    }
    
    public int NewAddmission(int MyAddmission){
        this.addmissionYear = MyAddmission;
        return addmissionYear;
    }

    public double NewGPA(double MyGPA){
        this.GPA = MyGPA;
        
        return GPA;
    }



    public void showdetails(){
        System.out.println("Your ID : "+this.ID);
        System.out.println("Your Name : "+this.Name);
        System.out.println("Your AddmissionYear : "+this.addmissionYear);
        System.out.println("Your GPA : "+String.format("%.2f", this.GPA));
    }
}