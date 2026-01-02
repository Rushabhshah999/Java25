public class Parent {

    Parent(String str){
        System.out.print(str);
    }


}

class Child extends Parent{

    Child(){
        // super can be after 1st line
        System.out.print("Child called \n");
        System.out.print("Child called \n");
        super("Parent Called");
    }

}

void main(){

     new Child();
}

