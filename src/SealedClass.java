public sealed interface SealedClass permits Child1 , Child2{

   default void m1(){

    }
}

non-sealed class Child1 implements SealedClass{

}

final class Child2 implements SealedClass{

}



