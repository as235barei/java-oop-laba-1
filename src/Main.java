public class Main {
    public static void main(String[] args) {

        String firstStr = "Hello world!";
        String secondStr = "Welcome!";

//        String firstStr = "IT_Barinio";
//        String secondStr = "Ivan_Bareiko";

        StringBuilder resultStr = new StringBuilder();

        for (char c : firstStr.toCharArray()) {
            if (secondStr.indexOf(c) != -1) {
                resultStr.append(c);
            }
        }

        System.out.print(resultStr);
    }
}
