package jd13_state;

public class StateClients {

    public static void main(String[] args) {

State virginia = new Virginia("VA", "republican",
        "Glenn Youngkin", "Mark Warmer", 8_715_698);
State california = new California("CA","democrate", "Gavin Newsom", "Laphonza Butler", 38_940_000);
State texas = new Texas("TX", "Republican", "Greg Abbott", "Ted Cruz", 30_000_000 );
State florida = new Florida("FL", "Republican", "Tallahassee", "Ron DeSantis", 22_610_000);
        System.out.println("Virginia:");
        System.out.println(virginia);

        System.out.println("\nCalifornia:");
        System.out.println(california);

        System.out.println("\nTexas:");
        System.out.println(texas);

        System.out.println("\nFlorida:");
        System.out.println(florida);
    }
}


