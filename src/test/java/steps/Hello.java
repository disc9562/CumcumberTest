package steps;

/**
 * Created by JAY on 2017/2/27.
 */
public class Hello {
    private String greeting = null;

    public Hello(String greeting){
        this.greeting = greeting;
    }
    public String sayHi(){
        return greeting + " World";
    }
}
