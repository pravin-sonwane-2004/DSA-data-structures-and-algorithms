// Q5. Create a POJO class BookIssue:
// bookId (int)
// studentName (String)
// daysLate (int)

// Fine rules:
// First 5 days → ₹2 per day
// After 5 days → ₹5 per day
// Calculate total fine and display details.
// Explanation:
// Apply fine logic:


// If daysLate ≤ 5 → daysLate × 2
// Else → (5 × 2) + ((daysLate - 5) × 5)


// Display fine amount.


// Input:
// Enter Book ID: 301
// Enter Student Name: Kiran
// Enter Days Late: 8
// Output:
// Book ID: 301
// Student Name: Kiran
// Days Late: 8
// Total Fine: 25
import java.util.Scanner;
class QNo7 {
	Scanner sc = new Scanner(System.in);
	void main() {
		IO.println("Enter No of Students : ");
		int size = sc.nextInt();
		BookIssue [] issue = new BookIssue[size];
		
		IO.println("Enter Detials of  : " + size + " Students");
		    assign(issue);
			IO.println(calculatePanalty(issue));
	}
	void assign (BookIssue issue[]) {
		for(int i=0;i<issue.length;i++) {
			issue[i] = new BookIssue();
			 IO.println("Enter Book ID : ");
			 int id = sc.nextInt();
			 issue[i].setBookId(id);
			 sc.nextLine();
			IO.println("Enter Student Name : ");
			String name = sc.nextLine();
			issue[i].setStudentName(name);
			IO.println("Enter Days Late : ");
			int late = sc.nextInt();
			issue[i].setDaysLate(late);
		}
	}
	int calculatePanalty(BookIssue issue []) {
					int panalty =0;
		 		  for(int i=0;i<issue.length;i++) {
					   panalty = 0;
			 if(issue[i].getDaysLate() <= 5) {
				 panalty +=  issue[i].getDaysLate()*2;
			 }
			 else {
				panalty += (5*2) + (issue[i].getDaysLate()-5)*5 ;
			 }
		}
		return panalty;
	}
}

public class BookIssue {
		private int bookId;
		private String studentName;
		private int daysLate;
		
		public void setBookId(int bookId) {
			this.bookId = bookId;
		}
		
		public int getbookId() {
			return bookId;
		}
		public String getstudentName() {
			return studentName;
		}
		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}
		public int getDaysLate() {
			return daysLate;
		}
		public void setDaysLate(int daysLate) {
			this.daysLate = daysLate;
		}
	}
	