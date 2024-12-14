import java.util.Scanner; // Importing Libraries:


public class Student implements Comparable<Student>{ 		// Defining the Student Class:

    private String name;
    private int id;

    // Getter Setter for name and id 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @Override
	public int compareTo(Student other) {   		// Comparing Two Students
    	int comparsionResult = this.name.compareTo(other.getName());
		if (comparsionResult < 0) {
			return -1;
		} else if(comparsionResult > 0) {
			return 1;
		} else {
			if(this.id > other.id) {
				return -1;
			}else return 1;
			
		}
	}

    public class Main {  								//Main Class
    	
    	public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            
            Student biggestStudent;

            // Create Student objects for the multiple cases
            Student student1 = new Student();
            Student student2 = new Student();
            Student student3 = new Student();
            Student student4 = new Student();

            System.out.println("Enter Student Detials  "); // Input and set name and ID for student1
            System.out.print("Enter Student 1 Name: ");
            student1.setName(scanner.nextLine());
            System.out.print("Enter Student 1 ID: ");
            student1.setId(scanner.nextInt());
            scanner.nextLine(); 

     
            System.out.print("Enter Student 2 Name: "); // Input and set name and ID for student2
            student2.setName(scanner.nextLine());
            System.out.print("Enter Student 2 ID: ");
            student2.setId(scanner.nextInt());
            scanner.nextLine(); 

// Compare and print results for each pair of Students   
          
            if(student1.compareTo(student2) > 0) {
            	biggestStudent = student1;
            } else {
            	biggestStudent = student2;
            }
            
            System.out.println("biggest student is " + biggestStudent.getName() + " with id " + biggestStudent.getId());
            
            System.out.print("Enter Student 3 Name: ");
            student3.setName(scanner.nextLine());
            System.out.print("Enter Student 3 ID: ");
            student3.setId(scanner.nextInt());
            scanner.nextLine();
            
            if(biggestStudent.compareTo(student3) < 0) {
            	biggestStudent = student3;
            }

            System.out.println("biggest student is " + biggestStudent.getName() + " with id " + biggestStudent.getId());
                
            scanner.close();
        }

    }
	
}
