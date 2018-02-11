package Exc_12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exc_12
{
    public static void main(String[] args)
    {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Wuddup");
        strings.add("shit");
        strings.add("Fucking Shit!");
        strings.add("oh damn");
        strings.add("meh");
        strings.add("meh");
        //strings.add("meh");
        //strings.add("Wuddup");
        strings.add("shit");
        strings.add("damn");
        //strings.add("shit");
        //strings.add("meh");
        strings.add("fuck me");
        strings.add("damn");
        strings.add("Wuddup");
        //strings.add("meh");
        strings.add("fuck me");
        System.out.println(contains3(strings));
    }

    public static boolean contains3(List<String> list)
    {
        boolean res = false;
        Map<String,Integer> map = new HashMap<>();
        for(String s: list)
        {
            if(map.containsKey(s))
            {
                int count = map.get(s);
                map.put(s,count+1);
            } else
            {
                map.put(s,1);
            }
        }
        for(String s: map.keySet())
        {
            if(map.get(s)>=3)
            {
                res = true;
                break;
            }
        }
        System.out.println(map);
        return res;
    }

}
