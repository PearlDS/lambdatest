import java.util.Locale;

public class AMethodClass {

    private String sentence;

    private String c;

    public AMethodClass(String sentence, String c) {
        this.sentence = sentence;
        this.c = c;
    }

    public void processing(AnInterface anInterface){

        for(String word : sentence.split(" ")){
            System.out.println(anInterface.process(word));
        }


    }

public String sentencing (String s){

        return s.toUpperCase(Locale.ROOT);
}


}
