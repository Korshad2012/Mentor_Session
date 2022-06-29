package GroupStudy;

import java.util.ArrayList;
import java.util.Arrays;

public class LameDb {

    public static void main(String[] args) {



    }

    public static String lameDb(String db, String op, String id, String data) {

        char[] array = db.toCharArray();
        String result = "";

        for (char each : array) {
            if (!Character.isDigit(each)) {
                result += each;
            }

        }
        String[] words = result.split("#");

        ArrayList<String> list = new ArrayList<>(Arrays.asList(words));
        String finalResult = "";

        String[] delete = db.split("#");
        ArrayList<String> listDelete = new ArrayList<>(Arrays.asList(delete));


        switch (op) {

            case "add":
                for (int i = 0; i <= words.length; i++) {
                    if (i == Integer.parseInt(id) - 1) {
                        list.add(i, data);
                    }

                }
                for (int i = 0; i < list.size(); i++) {

                    finalResult += (i + 1) + list.get(i) + "#";

                }
                break;

            case "edit":
                for (int i = 0; i < list.size(); i++) {
                    if (i == Integer.parseInt(id) - 1) {
                        list.set(i, data);
                    }
                }
                for (int i = 0; i < list.size(); i++) {
                    finalResult += (i + 1) + list.get(i) + "#";
                }
                break;

            case "delete":
                for (int i = 0; i < listDelete.size(); i++) {
                    if (i == Integer.parseInt(id) - 1) {
                        listDelete.remove(i);
                    }
                }

                for (int i = 0; i < listDelete.size(); i++) {
                    finalResult += listDelete.get(i) + "#";
                }

                break;

        }

        return finalResult.substring(0, finalResult.length() - 1);
    }
}

