package edu.face.basics;
import java.util.Map;
import java.util.HashMap;
public class Strobo {
    public static Boolean strobo(String input)
    {
        Map<Character, Character> map=new HashMap<>();
        map.put('6','9');
        map.put('0','0');
        map.put('1','1');
        map.put('9','6');
        map.put('8','8');
        int l=0,r=input.length()-1;
        while(l<=r)
        {
            if(!map.containsKey(input.charAt(l)))
            return false;
            if(map.get(input.charAt(l))!=input.charAt(r))
            return false;
            l++;
            r--;
        }
        return true;
    }
    public static void main(String args[])
    {
        String input;
        input="108";
        Boolean result=strobo(input);
        if(result==true)
        System.out.println("Its a Strobo");
        else
        System.out.println("not a strobo");
    }
    
}
