import java.util.Objects;
import java.util.Optional;

/**
 * 2017/11/27
 * Created by JackLee.
 */
public class NullPointerExceptionTest {

    //static Object object;

    public static void main(String[] args) {
        //System.out.println( object.hashCode());

        //doSomething(null);

        doSomething(null,"generalArgs");

    }

    private static void doSomething(String args,String generalArgs){
        //assert (arg > -100) && (arg < 100) : "arg is out of range(-100,100) ";


        Objects.requireNonNull(args,"args值非法");
        Objects.requireNonNull(generalArgs,"generalArgs not null");
        System.out.println(args);


    }
}
