package inheritance;

public class singleinheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student sc = new Student(1152262243,1234567890,"indian",101,"kiran","CSE","kumar");
		
		//loose coupling
		citizen two = new Student(1234567890,1242677677,"indian",102,"kumar","ECE","karan");
		System.out.println(two);
		
		citizen three = new Employee(1243521222,234567890,"indian","kiran",52222,"CSE",101);
		System.out.println(three);
	}

}
