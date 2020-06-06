package com.company;

import java.util.*;

public class Main {
/*
    public static void main(String[] args) {
        String example = "In a dishwasher far far away";
        String example2 = example.replace("dishwasher", "galaxy");
        System.out.println(example2);
         */
    /*
    public static void main(String[] args) {
        String url = "https//www.reddit.com/r/nevertellmethebots";
        String url2 = url.replace("bots", "odds");
        url = url2.substring(0,5) + ':' + url2.substring(5);
        System.out.println(url);
     */
    /*
    public static void main(String... args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
        int position = quote.indexOf("It you");
        // When saving this quote a disk error has occurred. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)
        StringBuilder sbQuote = new StringBuilder(quote);
        sbQuote.insert(position + 2, " always takes longer than");
        System.out.println(sbQuote);
    */

/*
public static void main(String... args){
    String todoText = " - Buy milk\n";
    todoText = todoText + " - Download games\n - Download games\n     - Diablo";

    // Add "My todo:" to the beginning of the todoText
    // Add " - Download games" to the end of the todoText
    // Add " - Diablo" to the end of the todoText but with indention

    // Expected output:

    // My todo:
    //  - Buy milk
    //  - Download games
    //      - Diablo

    System.out.println(todoText);
*/
    /*
    public static void main(String... args) {
        String toBeReversed =
            ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
        String reversedString = reverse(toBeReversed);
        System.out.println(reversedString);
    }
    public static String reverse(String toBeReversed) {
        // Create a method that can reverse a String, which is passed as the parameter
        // Use it on this reversed string to check it!
        // Try to solve this using charAt() first, and optionally anything else after.

        StringBuilder sbToBeReversed = new StringBuilder(toBeReversed);
        StringBuilder sbReverse = new StringBuilder(sbToBeReversed.reverse());
        String reversedString = sbReverse.toString();
        //I know that it is not necessary to do toString before sout...
        return(reversedString);
     */

    /*
    public static void main(String... args) {
        ArrayList<String> people = new ArrayList<String>();
        System.out.println(people.size());
        people.add("William");
        System.out.println(people.isEmpty());
        people.add("John");
        people.add("Amanda");
        System.out.println(people.size());
        System.out.println(people.get(2));

        for (String name : people) {
            System.out.println(name);
        }

        for (int i = 0; i < people.size(); i++) {
            System.out.println(i+1 + ". " + people.get(i));
        }

        people.remove(1);
        for (int i = people.size()-1; i >= 0; i--) {
            System.out.println(people.get(i));
        }

        people.clear();
    */

    /*
    public static void main(String... args) {
        HashMap<Integer,Character> hm = new HashMap<>();
        hm.put(97,'a');
        hm.put(98,'b');
        hm.put(99,'c');
        hm.put(65,'A');
        hm.put(66,'B');
        hm.put(67,'C');

        System.out.println(hm.keySet());
        System.out.println(hm.values());

        hm.put(68,'D');
        System.out.println(hm.size());
        System.out.println(hm.get(99));

        hm.remove(97);
        System.out.println(hm.containsKey(100));

        hm.clear();
     */

    /*
    public static void main(String... args) {
        ArrayList<String> fruitsA = new ArrayList<String>();
        fruitsA.add("Apple");
        fruitsA.add("Avocado");
        fruitsA.add("Blueberry");
        fruitsA.add("Durian");
        fruitsA.add("Lychee");

        ArrayList<String> fruitsB = new ArrayList<String>();
        fruitsB.addAll(fruitsA);

        System.out.println(fruitsA.contains("Durian"));
        fruitsA.add(4,"Kiwifruit");
        System.out.println("A size is: " + fruitsA.size() + " / B size is: " + fruitsB.size());
        System.out.println(fruitsA.indexOf("Avocado"));
        System.out.println(fruitsB.indexOf("Durian"));
        Collections.addAll(fruitsB, "Passion Fruit", "Pomelo");
        for (String mnam : fruitsB) {
            System.out.println(mnam);
        }
        System.out.println();
        System.out.println(fruitsA.get(2));
        */

    /*
    public static void main(String... args) {
        HashMap<String,String> hm2 = new HashMap<>();
        hm2.put("978-1-60309-452-8","A Letter to Jo");
        hm2.put("978-1-60309-459-7","Lupus");
        hm2.put("978-1-60309-444-3","Red Panda and Moon Bear");
        hm2.put("978-1-60309-461-0","The Lab");

        for(Map.Entry<String,String> entry : hm2.entrySet() ){
            System.out.println(entry.getValue() + " (ISBN: ) " + entry.getKey() + ")");
        }
    */

    /*
    public static void main(String... args) {
        ArrayList<Integer> expenses = new ArrayList<Integer>();
        expenses.add(500);
        expenses.add(1000);
        expenses.add(1250);
        expenses.add(175);
        expenses.add(800);
        expenses.add(120);

        int sum = 0;
        for (int i = 0; i < expenses.size(); i++) {
            sum += expenses.get(i);
        }
        System.out.println("Catastrophe total: " + sum);

        System.out.println("The worst catastrophe: " + Collections.max(expenses));
        System.out.println("The smallest catastrophe: " + Collections.min(expenses));
        double average;
        average = sum / expenses.size();
        System.out.println("Average catastrophe: " + average);
        */

    /*
    public static void main(String... args) {
        HashMap<String, String> phonebook = new HashMap<>();
        phonebook.put("William A. Lathan", "405-709-1865");
        phonebook.put("John K. Miller", "402-247-8568");
        phonebook.put("Hortensia E. Foster", "606-481-6467");
        phonebook.put("Amanda D. Newland", "319-243-5613");
        phonebook.put("Brooke P. Askew", "307-687-2982");

        System.out.println(phonebook.get("John K. Miller"));

        String value = "307-687-2982";
        for (Map.Entry entry : phonebook.entrySet()) {
            if (value.equals(entry.getValue())) {
                System.out.println(entry.getKey());
            }
        }
        // But just because this phonebook and with key:value 1:1

    */

    /*
    public static void main(String... args) {
        ArrayList<String> shoplist = new ArrayList<String>();
        shoplist.add("eggs");
        shoplist.add("milk");
        shoplist.add("fish");
        shoplist.add("apples");
        shoplist.add("bread");
        shoplist.add("chicken");

        System.out.println("milk on the list: " + shoplist.contains("milk"));
        System.out.println("bananas on the list: " + shoplist.contains("bananas"));
    */

    /*
    public static void main(String... args) {
        HashMap<String, Integer> shop = new HashMap<>();
        shop.put("Eggs", 200);
        shop.put("Milk", 200);
        shop.put("Fish", 400);
        shop.put("Apples", 150);
        shop.put("Bread", 50);
        shop.put("Chicken", 550);

        //How much is the fish?
        System.out.println(shop.get("Fish"));

        //What is the most expensive product?
        //As with the collection of cheapest ones
        int max = 0;
        List<String> maxKeys = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : shop.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                maxKeys.clear();
            }
            if (entry.getValue() == max) {
                maxKeys.add(entry.getKey());
            }
        }
        for (String expensiveItem : maxKeys) {
            System.out.println(expensiveItem);
        }

        //What is the average price?
        int sum = 0;
        double average = 0.0;
        for (Integer price : shop.values()) {
            sum += price;
            average = sum / shop.size();
        }
        System.out.println(average);

        //How many products' price is below 300?
        int counter = 0;
        for(Map.Entry<String, Integer> entry : shop.entrySet()) {
            if (entry.getValue() < 300) {
                counter += 1;
            }
        }
        System.out.println(counter);

        //Is there anything we can buy for exactly 125?
        System.out.println(shop.containsValue(125));

        //What is the cheapest product?
        // ELLEGANT! CREATE NEW COLLECTION OF KEYS WITH PERFECT LOOP FOR PICKING MIN VALUES
        //AND THEIR KEYS (IF FINDS SMALLER VALUE, CLEARS CURRENT COLLECTION OF KEYS...)
        int min = Integer.MAX_VALUE;
        List<String> minKeys = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : shop.entrySet()) {
            if (entry.getValue() < min) {
                min = entry.getValue();
                minKeys.clear();
            }
            if (entry.getValue() == min) {
                minKeys.add(entry.getKey());
            }
        }
        for (String cheapItem : minKeys) {
            System.out.println(cheapItem);
        }

    public static void main(String... args) {
        HashMap<String, Integer> shop = new HashMap<>();
        shop.put("Eggs", 200);
        shop.put("Milk", 200);
        shop.put("Fish", 400);
        shop.put("Apples", 150);
        shop.put("Bread", 50);
        shop.put("Chicken", 550);

    //Which products cost less than 201? (just the name)
        for(Map.Entry<String, Integer> entry : shop.entrySet()) {
            if (entry.getValue() < 201) {
                System.out.println(entry.getKey());
            }
        }

    //Which products cost more than 150? (name + price)
        for(Map.Entry<String, Integer> entry : shop.entrySet()) {
            if (entry.getValue() > 150) {
                System.out.println(entry.getKey());
            }
        }
     */

    public static void main(String... args) {
        HashMap<String, Double> shop = new HashMap<>();
        shop.put("Milk", 1.07);
        shop.put("Rice", 1.59);
        shop.put("Eggs", 3.14);
        shop.put("Cheese", 12.60);
        shop.put("Chicken Breasts", 9.40);
        shop.put("Apples", 2.31);
        shop.put("Tomato", 2.58);
        shop.put("Potato", 1.75);
        shop.put("Onion", 1.10);

        HashMap<String, Integer> bob = new HashMap<>();
        bob.put("Milk", 3);
        bob.put("Rice", 2);
        bob.put("Eggs", 2);
        bob.put("Cheese", 1);
        bob.put("Chicken Breasts", 4);
        bob.put("Apples", 1);
        bob.put("Tomato", 2);
        bob.put("Potato", 1);

        HashMap<String, Integer> alice = new HashMap<>();
        alice.put("Rice", 1);
        alice.put("Eggs", 5);
        alice.put("Chicken Breasts", 2);
        alice.put("Apples", 1);
        alice.put("Tomato", 10);

        //How much does Bob pay?
        double total = 0;
        for(Map.Entry<String, Integer> entry : bob.entrySet()) {
                total = total + entry.getValue() * shop.get(entry.getKey());
        }
        System.out.println(total);

        //How much does Alice pay?
        double total2 = 0;
        for(Map.Entry<String, Integer> entry2 : alice.entrySet()) {
            total2 = total2 + entry2.getValue() * shop.get(entry2.getKey());
        }
        System.out.println(total2);

        //Who buys more Rice?
        if (bob.containsKey("Rice") && alice.containsKey("Rice")) {
            if (bob.get("Rice") > alice.get("Rice")) {
                System.out.println("Bob");
            } else if (bob.get("Rice") < alice.get("Rice")) {
                System.out.println("Alice");
            } else {
                System.out.println("Equally");
            }
        } else if (bob.containsKey("Rice") && alice.containsKey("Rice") == false) {
            System.out.println("Bob");
        } else if (bob.containsKey("Rice") == false && alice.containsKey("Rice")) {
            System.out.println("Alice");
        } else {
            System.out.println("Both of them forgot to buy Rice");
        }

        //Who buys more Potato?
        if (bob.containsKey("Potato") && alice.containsKey("Potato")) {
            if (bob.get("Potato") > alice.get("Potato")) {
                System.out.println("Bob");
            } else if (bob.get("Potato") < alice.get("Potato")) {
                System.out.println("Alice");
            } else {
                System.out.println("Equally");
            }
        } else if (bob.containsKey("Potato") && !alice.containsKey("Potato")) {
            System.out.println("Bob");
        } else if (!bob.containsKey("Potato") && alice.containsKey("Potato")) {
            System.out.println("Alice");
        } else {
            System.out.println("Both of them forgot to buy Potato");
        }
        //Who buys more different products?
        if (bob.size() > alice.size()) {
            System.out.println("Bob");
        } else if (bob.size() < alice.size()) {
            System.out.println("Alice");
        } else {
            System.out.println("Equally");
        }
        //Who buys more products? (piece)
        int counterBob = 0;
        int counterAlice = 0;
        for(Map.Entry<String, Integer> entry : bob.entrySet()) {
            counterBob = counterBob + entry.getValue();
        }
        for(Map.Entry<String, Integer> entry : alice.entrySet()) {
            counterAlice = counterAlice + entry.getValue();
        }
        if (counterBob > counterAlice) {
            System.out.println("Bob");
        } else if (counterBob < counterAlice) {
            System.out.println("Alice");
        } else {
            System.out.println("Equally");
        }
    }
}