
import java.util.Arrays;

public class Tester{

    public static void main(String[] args) {
        String [] r = {"count","flip","flip","flip","count","flip","flip","count"};
        System.out.println(Arrays.toString(solution("10010110",r)));
    }

    public static int[] solution(String binaryString, String[] requests){
     //SOLUTION IS INSIDE HERE
        int [] ans = new int[requests.length];
        String [] a =binaryString.split("");
        for (int i = 0; i < requests.length; i++) {
            if(requests[i].equalsIgnoreCase("count")){

                ans[i]= (int) Arrays.stream(a)
                        .filter(e -> e.equals("1"))
                        .count();
            } else if (requests[i].equalsIgnoreCase("flip")) {
               int index = binaryString.indexOf("1");
               ans[i]=index;
               a=flip(a,index);
               binaryString=String.join("",a);
            }


        }
        return ans;
    }


    // THIS IS METHOD STANDING ON ITS OWN
    public static int count(String[]arr){
        return (int) Arrays.stream(arr)
                .filter(e-> e.equals("1"))
                .count();
    }
    //  THIS IS METHOD STANDING ON ITS OWN
    public  static String[] flip(String[]arr,int index){
        for (int i = 0; i <= index; i++) {
            if(arr[i].equals("0")){arr[i]="1";}
            else if(arr[i].equals("1")){arr[i]="0";}
        }

        return arr;
    }


}