public class FlexibleConstructors {

    FlexibleConstructors(String str){

    }

}

class Child extends FlexibleConstructors{

    Child(){
        // super can be after 1st line
        System.out.print("test good");
        super("");
    }

}