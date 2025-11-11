

   void main() {

        Object obj = 100;

        switch (obj) {
            case Integer i -> System.out.println("It's an int: " + i);
            default -> System.out.println("Something else: " + obj);
        }
    }

