	class demo {
		void main() throws Exception {
				try{
					int a=10/0;
				}
				catch (Exception e) {
					throw new CustomeException("Cant do that bro");
				}
			finally {
				IO.println("I Executed");
			}
		}
	}


	class CustomeException extends Exception {
		CustomeException(String message) {
			super(message);
		}
	}



// class PropagationDemo {
    // public static void main(String[] args) {
        // try {
            // methodA(); // 6. main() catches and handles the exception
        // } catch (ArithmeticException e) {
            // System.out.println("Exception caught in main(): " + e.getMessage());
        // }
    // }

    // static void methodA() {
        // methodB(); // 5. methodA has no catch block; drops to main()
    // }

    // static void methodB() {
        // 3. Exception occurs here
        // 4. methodB has no catch block; drops to methodA()
        // int result = 10 / 0; 
    // }
// }
