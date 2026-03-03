interface University {
    void hostelBlocks();
}
interface CSE {
    void academicBlocks();
	
	}
abstract class College implements University{
    public abstract void messes();
}
abstract class Hh implements CSE {
    public abstract void fests();
}
class Aaa extends College implements CSE  {
  
    public void hostelBlocks() {
	System.out.println(" IN OUR UNIVERSITY\n Hostel blocks are:");
        System.out.println("K1,K2,K3");
    }
 public void academicBlocks() {
	System.out.println(" Academic blocks are:");
        System.out.println("AB-1,AB-2");
    }
 public void messes() {
	System.out.println(" Messes are:");
    System.out.println("D-1,D-2,D-3");
    }
public void fests() {
	System.out.println(" fests are:");
    System.out.println("TECHZITE and cygnus");
    }
}
class Lab5 {

    public static void main(String[] args) {
	Aaa ob1= new Aaa();
	Aaa ref;
	ref=ob1;
	ref.hostelBlocks();
        ref.academicBlocks();
        ref.messes();
	ref.fests();
    }
}














