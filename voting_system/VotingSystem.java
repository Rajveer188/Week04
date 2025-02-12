package com.tit.week04.day02.voting_system;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import static java.lang.System.out;

public class VotingSystem {
    private Map<String, Integer> voteMap = new HashMap<>();
    private Map<String, Integer> orderedVotes = new LinkedHashMap<>();


    public void vote(String candidate) {
        voteMap.put(candidate, voteMap.getOrDefault(candidate, 0) + 1);
        orderedVotes.put(candidate, voteMap.get(candidate));
    }

    //method to display voting order
    public void displayVoteOrder() {
        out.println("vote order - ");
        for (Map.Entry<String, Integer> entry : orderedVotes.entrySet()) {
            out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
    //method to display result
    public void displayResults() {
        TreeMap<String, Integer> sortedResults = new TreeMap<>(voteMap);
        out.println("sorted voting result - ");
        for (Map.Entry<String, Integer> entry : sortedResults.entrySet()) {
            out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        //create a object of voting system
        VotingSystem system = new VotingSystem();

        system.vote("Rajveer");
        system.vote("Darshan");
        system.vote("Rajveer");
        system.vote("Ankit");
        system.vote("Darshan");
        system.vote("Rajveer");

        system.displayVoteOrder();
        System.out.println();
        system.displayResults();
    }
}
