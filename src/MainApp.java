public class MainApp {
    public static void main(String[] args) {


        AMethodClass aMethodClass = new AMethodClass("hey hey hey hey hey", "cookie");

        aMethodClass.processing(s -> String.format("Hello %s",s));

        aMethodClass.processing(s ->AnotherInterface.qoute(s));

        aMethodClass.processing(aMethodClass::sentencing);






    }

    public static void pr(){
        System.out.println("yo");
    }

}
