class Test {
	

    public static void main(String[] args) {

        Test outer = new Test();        // Step 1
        Test.B inner = outer.new B();   // Step 2
        inner.show();                   // Step 3
    }
}