package org.example.volunteers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Searcher {

    public Searcher() {
    }

    public static List<Integer> searchSimilar(String[] lineToSearch, List<String[]> lines)
    {
        List<Integer> listOfSimilarIndexes = new ArrayList<>();

        for (String[] line : lines) {
            if(lineToSearch.equals(line))
            {
                listOfSimilarIndexes.add(lines.indexOf(line));
            }
            //Recherche nom/prénom
            else if(lineToSearch[0].equalsIgnoreCase(line[0]) && lineToSearch[1].equalsIgnoreCase(line[1]))
            {
                listOfSimilarIndexes.add(lines.indexOf(line));
            }
            else if(lineToSearch[0].equalsIgnoreCase(line[1]) && lineToSearch[1].equalsIgnoreCase(line[0]))
            {
                listOfSimilarIndexes.add(lines.indexOf(line));
            }
            //Recherche pseudo
            else if(!lineToSearch[2].isEmpty() && lineToSearch[2].equalsIgnoreCase(line[2]))
            {
                listOfSimilarIndexes.add(lines.indexOf(line));
            }
            //Recherche mail
            else if(lineToSearch[3].equalsIgnoreCase(line[3]))
            {
                listOfSimilarIndexes.add(lines.indexOf(line));
            }
            //Recherche numéro
            else if(lineToSearch[4].equalsIgnoreCase(line[4]))
            {
                listOfSimilarIndexes.add(lines.indexOf(line));
            }
        }

        return listOfSimilarIndexes;
    }
}
