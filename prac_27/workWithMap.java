package ru.maksim.ikbo2021.new_pracs.prac_27;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class workWithMap {
    Map<String, ArrayList<String>> map = new HashMap();

    public void addValues(String key, String value) {
        ArrayList tempList = null;
        if (this.map.containsKey(key)) {
            tempList = (ArrayList)this.map.get(key);
            if (tempList == null) {
                tempList = new ArrayList();
            }

            tempList.add(value);
        } else {
            tempList = new ArrayList();
            tempList.add(value);
        }

        this.map.put(key, tempList);
    }

    public HashMap<String, ArrayList<String>> createMap() {
        return (HashMap)this.map;
    }

    public int getSameFirstNameCount() {
        int count = 0;
        Iterator var2 = this.map.entrySet().iterator();

        while(var2.hasNext()) {
            Entry<String, ArrayList<String>> item = (Entry)var2.next();
            if (((ArrayList)item.getValue()).size() > 1) {
                ++count;
            }
        }

        return count;
    }

    public int getSameLastNameCount() {
        Map<String, Integer> tmp = new HashMap();
        Iterator var2 = this.map.entrySet().iterator();

        while(var2.hasNext()) {
            Entry<String, ArrayList<String>> item = (Entry)var2.next();
            Iterator var4 = ((ArrayList)item.getValue()).iterator();

            while(var4.hasNext()) {
                String name = (String)var4.next();
                if (tmp.containsKey(name)) {
                    tmp.replace(name, (Integer)tmp.get(name) + 1);
                } else {
                    tmp.put(name, 1);
                }
            }
        }

        int count = 0;
        Iterator var7 = tmp.entrySet().iterator();

        while(var7.hasNext()) {
            Entry<String, Integer> item = (Entry)var7.next();
            if ((Integer)item.getValue() > 1) {
                ++count;
            }
        }

        return count;
    }
}
