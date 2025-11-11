public class FlexibleConstructors {

    FlexibleConstructors(String str){
        System.out.print(str);
    }


}

class Child extends FlexibleConstructors{

    Child(){
        // super can be after 1st line
        System.out.print("Child called \n");
        super("Parent Called");
    }

}

void main(){

     new Child();
}

