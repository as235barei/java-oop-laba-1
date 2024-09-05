public class Task2 {
    public static void main(String[] args) {
//        String firstStr = "Ванюша любить одну...";
//        String secondStr = "Ванюшу любить одна...";

        String firstStr = "mamamia sanntaluchia";
        String secondStr = "otsutsuki momoshika rinegan";

        StringBuilder resultStr = new StringBuilder();

        for (char c : firstStr.toUpperCase().toCharArray()) {
            if (firstStr.toUpperCase().indexOf(c) != firstStr.toUpperCase().lastIndexOf(c) &&
                    secondStr.toUpperCase().indexOf(c) != secondStr.toUpperCase().lastIndexOf(c) &&
                    resultStr.indexOf(String.valueOf(c)) == -1) {
                resultStr.append(c);
            }
        }

        System.out.print(resultStr);
    }
}


