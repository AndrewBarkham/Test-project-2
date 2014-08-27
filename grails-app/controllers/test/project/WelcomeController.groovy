package test.project

class WelcomeController {

    def index() {
        render "Concatenating 'Hello' and 'World' equals " + concatenate("Hello", "World");
        render "Multiplying 4 by 10 equals " + multiply(4, 10);
        render "Adding 2 to 3 equals " + add(2, 3);
    }

    public String concatenate(String one, String two){

        return one + two;

    }

    public int multiply(int a, int b){

        return a * b;

    }

    public int add(int a, int b){

        return a + b;

    }
}
