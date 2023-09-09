import java.util.ArrayList;
import java.util.List;

public class Tests {
    public void doSomething(){
        System.out.println("Hello");
    }

    public List<String> doSomethingPart2(){
        return new ArrayList<>(
            List.of(
                "1", "2",
                "3", "4",
                "5"                
            )
        );
    }

    public void doSomethingPart3(){
        // Just a comment
        // Another one
    }

    public void imEmpty(){}
}
