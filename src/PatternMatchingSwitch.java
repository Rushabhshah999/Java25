//primitive types in switch and instanceof statements.
   void main() {

        Object obj = 100;

        switch (obj) {

            // && i > 5 preview
            case Integer i  -> System.out.println("It's an switch int: " + i);
            default -> System.out.println("Something else: " + obj);
        }

       if (obj instanceof int i) {
           System.out.println("It's an instanceof int: " + i);
       }
    }

