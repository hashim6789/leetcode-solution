import java.util.HashMap;
//roman to integer
public class solution4 {
    public static int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int res = map.get(s.charAt(s.length()-1));
        for(int i=s.length()-2;i>=0;i--){
            if(map.get(s.charAt(i)) < map.get(s.charAt(i+1)))
                res -= map.get(s.charAt(i));
            else
                res += map.get(s.charAt(i));
        }


        return res;





        // int res = 0;
        // for(int i=0;i<s.length();i++){
        //     switch(s.charAt(i)){
        //         case 'I' :
        //             res += 1;
        //             break;
        //         case 'V' :
        //             res += 5;
        //             break;
        //         case 'X' :
        //             res += 10;
        //             break;
        //         case 'L' :
        //             res += 50;
        //             break;
        //         case 'C' :
        //             res += 100;
        //             break;
        //         case 'D' :
        //             res += 500;
        //             break;
        //         case 'M' :
        //             res += 1000;
        //             break;               
        //     }            
        // }
        // return res;
    }

    public static void main(String[] args) {
        String s = "MCMXCIV";
        int res = romanToInt(s);
        System.out.println(res);
    }
}
