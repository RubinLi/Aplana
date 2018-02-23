package com.Ivlev;
import java.util.*;

public class Gift {

    private HashMap map = new HashMap< CandyGroup, String>();

    public Gift() {
    }

    public void AddGroup(CandyGroup group, String name) {
        this.map.put(group,name);
    }

    public Object GetGroup(String name) {
         return this.map.get(name);
    }

    public void GetKey() {
        Set<Map.Entry<CandyGroup, String>> set = map.entrySet();

// Отобразим набор
        for (Map.Entry<CandyGroup, String> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }}}
//действия с ключом
 //   Set keys = map.keySet();
     //   for (String key: keys) {}
  //  public String Getname(){
  //
  //  }

//    public void del(CandyGroup candyGroup) {
  //      this.list.remove(candyGroup);



//}
