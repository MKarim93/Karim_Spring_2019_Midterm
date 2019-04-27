package datastructure;

import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.Iterator;

import static databases.ConnectToSqlDB.connect;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         * Store all the sorted data into one of the databases.
         *
         */
        ArrayList<String> movies = new ArrayList<String>();
        movies.add("There Will Be Blood");
        movies.add("The Master");
        movies.add("Southpaw");
        movies.add("Game Night");
        movies.add("I'm Not Here");
        movies.add("Being Wet in the Arctic Cold");
        System.out.println("All movie titles = " + movies);
        for (int a = 1; a < 4; a++) {
            System.out.println("Specified from index to index = " + movies.get(a));
        }
        ConnectToSqlDB connect = new ConnectToSqlDB();
        connect.insertDataFromStringToSqlTable("movies", "Movies", "movieTitles");

        Iterator<String> it = movies.iterator();
        System.out.println(it.next());
        System.out.println(it.hasNext());
        while (it.hasNext())
            System.out.println("from while loop = " + it.next());
        for (Object x : movies) {
            System.out.println(x);
        }
    }

}
