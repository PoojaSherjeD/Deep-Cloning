

	

	public class Student implements Cloneable {
	    int roll;
	    String name;
	    Address address;

	    public Student() {
	    }

	    public Student(int roll, String name, Address address) {
	        this.roll = roll;
	        this.name = name;
	        this.address = address;
	    }

	    @Override
		protected Object clone() throws CloneNotSupportedException {
			Student s=(Student)super.clone();
			Address add=(Address)address.clone();
			s.address=add;
			return s;
			
		}

		@Override
	    public String toString() {
	        return "Student{" +
	                "roll=" + roll +
	                ", name='" + name + '\'' +
	                ", address=" + address +
	                '}';
	    }

		
		  public static void main(String[] args) throws CloneNotSupportedException {
		  Address addr = new Address("Pune","IND",411033); 
		  Student s1 = new
		  Student(10, "Ram", addr);
		  System.out.println("before S1 = "+s1);
		  Student s2 = (Student) s1.clone();
		  System.out.println("before S2 = "+s2);
		  System.out.println(">>>> changing addr of s1 <<<<<");
		  s1.address.city ="Mumbai"; 
		  System.out.println("After S1 = "+s1); 
		  System.out.println("After S2 = "+s2); 
		  }
		 
	}

