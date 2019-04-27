package datastructure;

import databases.ConnectToSqlDB;

import java.util.*;

public class UseMap {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         */

        List<String> walmartEmployees = new ArrayList();
        walmartEmployees.add("W-emp1");
        walmartEmployees.add("W-emp2");
        walmartEmployees.add("W-emp3");

        List<String> targetEmployees = new ArrayList();
        targetEmployees.add("T-emp1");
        targetEmployees.add("T-emp2");
        targetEmployees.add("T-emp3");

        List<String> amazonEmployees = new ArrayList();
        amazonEmployees.add("A-emp1");
        amazonEmployees.add("A-emp2");
        amazonEmployees.add("A-emp3");

        Map<String, List<String>> map = new HashMap<String, List<String>>();
        map.put("Walmart", walmartEmployees);
        map.put("Target", targetEmployees);
        map.put("Amazon", amazonEmployees);

        for (Map.Entry key : map.entrySet()) {
            System.out.println(key.getKey() + " " + key.getValue());
        }

        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
