import java.util.ArrayList;
public class Validate{

    public static boolean validate(String n) {
        StringBuilder sb = new StringBuilder(n);

        ArrayList<Integer> array = new ArrayList<>();


        for (int i = 0; i < sb.length(); i++) {
            array.add(Character.getNumericValue(sb.charAt(i)));
        }


        if(sb.length()%2 ==0){

            for (int j = 0; j < sb.length(); j += 2) {
                array.set(j, array.get(j) * 2);
                if (array.get(j) > 9) {
                    array.set(j, array.get(j) - 9);
                }
            }

            int temp = 0;
            for (int k = 0; k < sb.length(); k++) {
                temp += array.get(k);
            }

            if(temp % 10 ==0){return true;}else{return false;}

        } else{

            for (int j = 1; j < sb.length(); j += 2) {
                array.set(j, array.get(j) * 2);
                if (array.get(j) > 9) {
                    array.set(j, array.get(j) - 9);
                }
            }

            int temp = 0;
            for (int k = 0; k < sb.length(); k++) {
                temp += array.get(k);
            }
            if(temp % 10 ==0){return true;}else{return false;}

        }

    }
}