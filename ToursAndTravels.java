import java.util.Scanner;

public class ToursAndTravels {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tourChoice, packageChoice, numberOfPeople;
        double totalCost;

        System.out.println("====================================================");
        System.out.println("     Welcome to Tours and Travels Management System");
        System.out.println("====================================================");

        // Tour Destinations
        System.out.println("Choose a tour destination:");
        System.out.println("1. Ahmedabad to Goa");
        System.out.println("2. Ahmedabad to Kedarnath");
        System.out.println("3. Ahmedabad to Rishikesh");
        System.out.println("4. Ahmedabad to Shimla");
        System.out.println("5. Ahmedabad to Darjeeling");
        System.out.println("6. Ahmedabad to Spiti Valley");
        System.out.println("7. Manali to Ladakh Bike Tour");

        System.out.print("Enter your tour choice (1-10): ");
        tourChoice = sc.nextInt();

        System.out.print("Enter number of people (max 7): ");
        numberOfPeople = sc.nextInt();
        
        if (numberOfPeople > 5) {
            System.out.println("Maximum 7 people allowed.");
            return;
        }

        // Handle different tour destinations
        switch (tourChoice) {
            
            case 1: 
                totalCost = goaTour(sc, numberOfPeople); 
                break;
            case 2: 
                totalCost = kedarnathTour(sc, numberOfPeople); 
                break;
            case 3: 
                totalCost = rishikeshTour(sc, numberOfPeople); 
                break;
            case 4: 
                totalCost = shimlaTour(sc, numberOfPeople); 
                break;
            case 5: 
                totalCost = darjeelingTour(sc, numberOfPeople); 
                break;
            case 6: 
                totalCost = spitiTour(sc, numberOfPeople); 
                break;
            case 7: 
                totalCost = ladakhBikeTour(sc, numberOfPeople); 
                break;
            default: 
                System.out.println("Invalid tour choice!");
                return;
        }

        // Output the total cost
        System.out.println("Total cost for your tour: Rs." + totalCost);
    }

    // Goa Tour
    public static double goaTour(Scanner sc, int numberOfPeople) {
        System.out.println("\nChoose a package for Ahmedabad to Goa:");
        System.out.println("1. Rs.6000 for 3 nights, 4 days (Stay + Breakfast)");
        System.out.println("2. Rs.9000 for 4 nights, 5 days (Stay + Meals + Sightseeing)");
        System.out.println("3. Rs.12000 for 5 nights, 6 days (Stay + Meals + Sightseeing + Beach Visit)");
        System.out.print("Enter your package choice (1-3): ");
        int packageChoice = sc.nextInt();

        double costPerPerson = 0;
        if (packageChoice == 1) {
            costPerPerson = 6000;
            itineraryGoaPackage1();
        } else if (packageChoice == 2) {
            costPerPerson = 9000;
            itineraryGoaPackage2();
        } else if (packageChoice == 3) {
            costPerPerson = 12000;
            itineraryGoaPackage3();
        } else {
            System.out.println("Invalid package choice.");
            return 0;
        }

        return costPerPerson * numberOfPeople;
    }

    public static void itineraryGoaPackage1() {
        System.out.println("\nItinerary for 3 nights, 4 days (Stay + Breakfast):");
        System.out.println("Day 1: Arrival at Goa, hotel check-in.");
        System.out.println("Day 2: Visit Calangute Beach and Anjuna Beach.");
        System.out.println("Day 3: Visit Baga Beach and Fort Aguada.");
        System.out.println("Day 4: Check-out and return home.");
        System.out.println("\nInclusions: Stay, Breakfast.");
        System.out.println("Exclusions: Sightseeing, Personal expenses.");
        System.out.println("Things to carry: Beachwear, sunscreen.");
    }

    public static void itineraryGoaPackage2() {
        System.out.println("\nItinerary for 4 nights, 5 days (Stay + Meals + Sightseeing):");
        System.out.println("Day 1: Arrival at Goa, hotel check-in.");
        System.out.println("Day 2: Visit Calangute, Baga Beach, and Fort Aguada.");
        System.out.println("Day 3: Visit Dudhsagar Waterfalls and Spice Plantation.");
        System.out.println("Day 4: Explore South Goa Beaches and Churches.");
        System.out.println("Day 5: Check-out and return home.");
        System.out.println("\nInclusions: Stay, Meals, Sightseeing.");
        System.out.println("Exclusions: Personal expenses.");
        System.out.println("Things to carry: Comfortable clothing, sunscreen.");
    }

    public static void itineraryGoaPackage3() {
        System.out.println("\nItinerary for 5 nights, 6 days (Stay + Meals + Sightseeing + Beach Visit):");
        System.out.println("Day 1: Arrival at Goa, hotel check-in.");
        System.out.println("Day 2: Visit Calangute, Baga Beach, and Dolphin Watching.");
        System.out.println("Day 3: Visit Dudhsagar Waterfalls and Spice Plantation.");
        System.out.println("Day 4: Explore Old Goa Churches and Chapora Fort.");
        System.out.println("Day 5: South Goa Beaches and boat cruise.");
        System.out.println("Day 6: Check-out and return home.");
        System.out.println("\nInclusions: Stay, Meals, Sightseeing, Beach Visit.");
        System.out.println("Exclusions: Personal expenses.");
        System.out.println("Things to carry: Beachwear, sunscreen, camera.");
    }

    // Kedarnath Tour
    public static double kedarnathTour(Scanner sc, int numberOfPeople) {
        System.out.println("\nChoose a package for Ahmedabad to Kedarnath:");
        System.out.println("1. Rs.15000 for 4 nights, 5 days (Stay + Meals + Sightseeing)");
        System.out.println("2. Rs.20000 for 5 nights, 6 days (Stay + Meals + Trekking)");
        System.out.print("Enter your package choice (1-2): ");
        int packageChoice = sc.nextInt();

        double costPerPerson = 0;
        if (packageChoice == 1) {
            costPerPerson = 15000;
            itineraryKedarnathPackage1();
        } else if (packageChoice == 2) {
            costPerPerson = 20000;
            itineraryKedarnathPackage2();
        } else {
            System.out.println("Invalid package choice.");
            return 0;
        }

        return costPerPerson * numberOfPeople;
    }

    public static void itineraryKedarnathPackage1() {
        System.out.println("\nItinerary for 4 nights, 5 days (Stay + Meals + Sightseeing):");
        System.out.println("Day 1: Arrive in Haridwar, drive to Rudraprayag.");
        System.out.println("Day 2: Drive to Gaurikund, begin trek to Kedarnath.");
        System.out.println("Day 3: Visit Kedarnath Temple, relax in the surroundings.");
        System.out.println("Day 4: Trek back to Gaurikund, then drive to Rudraprayag.");
        System.out.println("Day 5: Drive back to Haridwar and return home.");
        System.out.println("\nInclusions: Stay, Meals, Sightseeing.");
        System.out.println("Exclusions: Personal expenses, trekking gear.");
        System.out.println("Things to carry: Trekking shoes, warm clothes, camera.");
    }

    public static void itineraryKedarnathPackage2() {
        System.out.println("\nItinerary for 5 nights, 6 days (Stay + Meals + Trekking):");
        System.out.println("Day 1: Arrive in Haridwar, drive to Rudraprayag.");
        System.out.println("Day 2: Drive to Gaurikund, start trekking to Kedarnath.");
        System.out.println("Day 3: Visit Kedarnath Temple and explore.");
        System.out.println("Day 4: Rest day, relax and explore the serene atmosphere.");
        System.out.println("Day 5: Return trek to Gaurikund, drive back to Rudraprayag.");
        System.out.println("Day 6: Drive to Haridwar, return home.");
        System.out.println("\nInclusions: Stay, Meals, Trekking.");
        System.out.println("Exclusions: Personal expenses, trek gear.");
        System.out.println("Things to carry: Trekking gear, water bottle, warm clothes.");
    }


// Rishikesh Tour
public static double rishikeshTour(Scanner sc, int numberOfPeople) {
    System.out.println("\nChoose a package for Ahmedabad to Rishikesh:");
    System.out.println("1. Rs.8000 for 3 nights, 4 days (Stay + Breakfast)");
    System.out.println("2. Rs.10000 for 4 nights, 5 days (Stay + Meals + Sightseeing)");
    System.out.println("3. Rs.12000 for 5 nights, 6 days (Stay + Meals + Sightseeing + Adventure Sports)");
    System.out.print("Enter your package choice (1-3): ");
    int packageChoice = sc.nextInt();

    double costPerPerson = 0;
    if (packageChoice == 1) {
        costPerPerson = 8000;
        itineraryRishikeshPackage1();
    } else if (packageChoice == 2) {
        costPerPerson = 10000;
        itineraryRishikeshPackage2();
    } else if (packageChoice == 3) {
        costPerPerson = 12000;
        itineraryRishikeshPackage3();
    } else {
        System.out.println("Invalid package choice.");
        return 0;
    }

    return costPerPerson * numberOfPeople;
}

public static void itineraryRishikeshPackage1() {
    System.out.println("\nItinerary for 3 nights, 4 days (Stay + Breakfast):");
    System.out.println("Day 1: Arrival at Rishikesh, hotel check-in.");
    System.out.println("Day 2: Visit Triveni Ghat, Laxman Jhula, and Ram Jhula.");
    System.out.println("Day 3: Visit Beatles Ashram and Neelkanth Mahadev Temple.");
    System.out.println("Day 4: Check-out and return home.");
    System.out.println("\nInclusions: Stay, Breakfast.");
    System.out.println("Exclusions: Sightseeing, Personal expenses.");
    System.out.println("Things to carry: Comfortable shoes, camera.");
}

public static void itineraryRishikeshPackage2() {
    System.out.println("\nItinerary for 4 nights, 5 days (Stay + Meals + Sightseeing):");
    System.out.println("Day 1: Arrival at Rishikesh, hotel check-in.");
    System.out.println("Day 2: Visit Triveni Ghat, Ram Jhula, and Laxman Jhula.");
    System.out.println("Day 3: Visit Beatles Ashram and Neelkanth Mahadev Temple.");
    System.out.println("Day 4: Explore nearby ashrams, attend Ganga Aarti.");
    System.out.println("Day 5: Check-out and return home.");
    System.out.println("\nInclusions: Stay, Meals, Sightseeing.");
    System.out.println("Exclusions: Personal expenses.");
    System.out.println("Things to carry: Comfortable clothing, camera.");
}

public static void itineraryRishikeshPackage3() {
    System.out.println("\nItinerary for 5 nights, 6 days (Stay + Meals + Sightseeing + Adventure Sports):");
    System.out.println("Day 1: Arrival at Rishikesh, hotel check-in.");
    System.out.println("Day 2: Visit Triveni Ghat, Laxman Jhula, and Ram Jhula.");
    System.out.println("Day 3: Visit Beatles Ashram, Neelkanth Mahadev Temple.");
    System.out.println("Day 4: White water rafting and camping.");
    System.out.println("Day 5: Visit nearby ashrams and explore Ganga Aarti.");
    System.out.println("Day 6: Check-out and return home.");
    System.out.println("\nInclusions: Stay, Meals, Sightseeing, Adventure Sports.");
    System.out.println("Exclusions: Personal expenses.");
    System.out.println("Things to carry: Comfortable shoes, camera, rafting gear.");
}

// Shimla Tour
public static double shimlaTour(Scanner sc, int numberOfPeople) {
    System.out.println("\nChoose a package for Shimla Tour:");
    System.out.println("1. Rs.10000 for 3 nights, 4 days (Stay + Breakfast)");
    System.out.println("2. Rs.13000 for 4 nights, 5 days (Stay + Meals + Sightseeing)");
    System.out.println("3. Rs.15000 for 5 nights, 6 days (Stay + Meals + Sightseeing + Local Tour Guide)");
    System.out.print("Enter your package choice (1-3): ");
    int packageChoice = sc.nextInt();

    double costPerPerson = 0;
    if (packageChoice == 1) {
        costPerPerson = 10000;
        itineraryShimlaPackage1();
    } else if (packageChoice == 2) {
        costPerPerson = 13000;
        itineraryShimlaPackage2();
    } else if (packageChoice == 3) {
        costPerPerson = 15000;
        itineraryShimlaPackage3();
    } else {
        System.out.println("Invalid package choice.");
        return 0;
    }

    return costPerPerson * numberOfPeople;
}

public static void itineraryShimlaPackage1() {
    System.out.println("\nItinerary for 3 nights, 4 days (Stay + Breakfast):");
    System.out.println("Day 1: Arrival at Shimla, hotel check-in.");
    System.out.println("Day 2: Visit Mall Road, Jakhoo Temple, Ridge.");
    System.out.println("Day 3: Visit Kufri and Christ Church.");
    System.out.println("Day 4: Check-out and return home.");
    System.out.println("\nInclusions: Stay, Breakfast.");
    System.out.println("Exclusions: Sightseeing, Personal expenses.");
    System.out.println("Things to carry: Comfortable shoes, camera.");
}

public static void itineraryShimlaPackage2() {
    System.out.println("\nItinerary for 4 nights, 5 days (Stay + Meals + Sightseeing):");
    System.out.println("Day 1: Arrival at Shimla, hotel check-in.");
    System.out.println("Day 2: Visit Mall Road, Jakhoo Temple.");
    System.out.println("Day 3: Visit Kufri and Christ Church.");
    System.out.println("Day 4: Visit Tattapani Hot Springs and Fagu.");
    System.out.println("Day 5: Check-out and return home.");
    System.out.println("\nInclusions: Stay, Meals, Sightseeing.");
    System.out.println("Exclusions: Personal expenses.");
    System.out.println("Things to carry: Comfortable clothing, camera.");
}

public static void itineraryShimlaPackage3() {
    System.out.println("\nItinerary for 5 nights, 6 days (Stay + Meals + Sightseeing + Local Tour Guide):");
    System.out.println("Day 1: Arrival at Shimla, hotel check-in.");
    System.out.println("Day 2: Visit Mall Road, Ridge, Jakhoo Temple.");
    System.out.println("Day 3: Visit Kufri and Christ Church.");
    System.out.println("Day 4: Visit Tattapani and Fagu.");
    System.out.println("Day 5: Full-day city tour with local guide.");
    System.out.println("Day 6: Check-out and return home.");
    System.out.println("\nInclusions: Stay, Meals, Sightseeing, Local Tour Guide.");
    System.out.println("Exclusions: Personal expenses.");
    System.out.println("Things to carry: Comfortable shoes, camera, water bottle.");
}

public static double darjeelingTour(Scanner sc, int numberOfPeople) {
    System.out.println("\nChoose a package for Darjeeling:");
    System.out.println("1. Rs.9000 for 3 nights, 4 days (Stay + Breakfast)");
    System.out.println("2. Rs.12000 for 4 nights, 5 days (Stay + Meals + Sightseeing)");
    System.out.println("3. Rs.15000 for 5 nights, 6 days (Stay + Meals + Sightseeing + Local Tour Guide)");
    System.out.print("Enter your package choice (1-3): ");
    int packageChoice = sc.nextInt();

    double costPerPerson = 0;
    if (packageChoice == 1) {
        costPerPerson = 9000;
        itineraryDarjeelingPackage1();
    } else if (packageChoice == 2) {
        costPerPerson = 12000;
        itineraryDarjeelingPackage2();
    } else if (packageChoice == 3) {
        costPerPerson = 15000;
        itineraryDarjeelingPackage3();
    } else {
        System.out.println("Invalid package choice.");
        return 0;
    }

    return costPerPerson * numberOfPeople;
}

public static void itineraryDarjeelingPackage1() {
    System.out.println("\nItinerary for 3 nights, 4 days (Stay + Breakfast):");
    System.out.println("Day 1: Arrival at Darjeeling, hotel check-in.");
    System.out.println("Day 2: Visit Tiger Hill, Batasia Loop, Peace Pagoda.");
    System.out.println("Day 3: Visit Himalayan Mountaineering Institute, Zoo.");
    System.out.println("Day 4: Check-out and return home.");
    System.out.println("\nInclusions: Stay, Breakfast.");
    System.out.println("Exclusions: Sightseeing, Personal expenses.");
    System.out.println("Things to carry: Comfortable shoes, camera.");
}

public static void itineraryDarjeelingPackage2() {
    System.out.println("\nItinerary for 4 nights, 5 days (Stay + Meals + Sightseeing):");
    System.out.println("Day 1: Arrival at Darjeeling, hotel check-in.");
    System.out.println("Day 2: Visit Tiger Hill, Batasia Loop, Peace Pagoda.");
    System.out.println("Day 3: Visit Himalayan Mountaineering Institute, Zoo.");
    System.out.println("Day 4: Visit Dali Monastery and Botanical Garden.");
    System.out.println("Day 5: Check-out and return home.");
    System.out.println("\nInclusions: Stay, Meals, Sightseeing.");
    System.out.println("Exclusions: Personal expenses.");
    System.out.println("Things to carry: Comfortable clothing, camera.");
}

public static void itineraryDarjeelingPackage3() {
    System.out.println("\nItinerary for 5 nights, 6 days (Stay + Meals + Sightseeing + Local Tour Guide):");
    System.out.println("Day 1: Arrival at Darjeeling, hotel check-in.");
    System.out.println("Day 2: Visit Tiger Hill, Batasia Loop, Peace Pagoda.");
    System.out.println("Day 3: Visit Himalayan Mountaineering Institute, Zoo.");
    System.out.println("Day 4: Visit Dali Monastery and Botanical Garden.");
    System.out.println("Day 5: Full-day city tour with local guide.");
    System.out.println("Day 6: Check-out and return home.");
    System.out.println("\nInclusions: Stay, Meals, Sightseeing, Local Tour Guide.");
    System.out.println("Exclusions: Personal expenses.");
    System.out.println("Things to carry: Comfortable shoes, camera, water bottle.");
}

// Spiti Tour
public static double spitiTour(Scanner sc, int numberOfPeople) {
    System.out.println("\nChoose a package for Spiti:");
    System.out.println("1. Rs.11000 for 4 nights, 5 days (Stay + Breakfast)");
    System.out.println("2. Rs.14000 for 5 nights, 6 days (Stay + Meals + Sightseeing)");
    System.out.println("3. Rs.17000 for 6 nights, 7 days (Stay + Meals + Sightseeing + Local Tour Guide)");
    System.out.print("Enter your package choice (1-3): ");
    int packageChoice = sc.nextInt();

    double costPerPerson = 0;
    if (packageChoice == 1) {
        costPerPerson = 11000;
        itinerarySpitiPackage1();
    } else if (packageChoice == 2) {
        costPerPerson = 14000;
        itinerarySpitiPackage2();
    } else if (packageChoice == 3) {
        costPerPerson = 17000;
        itinerarySpitiPackage3();
    } else {
        System.out.println("Invalid package choice.");
        return 0;
    }

    return costPerPerson * numberOfPeople;
}

public static void itinerarySpitiPackage1() {
    System.out.println("\nItinerary for 4 nights, 5 days (Stay + Breakfast):");
    System.out.println("Day 1: Arrival at Spiti, hotel check-in.");
    System.out.println("Day 2: Visit Key Monastery and Kibber Village.");
    System.out.println("Day 3: Visit Chandratal Lake.");
    System.out.println("Day 4: Visit Tabo Monastery.");
    System.out.println("Day 5: Check-out and return home.");
    System.out.println("\nInclusions: Stay, Breakfast.");
    System.out.println("Exclusions: Sightseeing, Personal expenses.");
    System.out.println("Things to carry: Warm clothing, camera.");
}

public static void itinerarySpitiPackage2() {
    System.out.println("\nItinerary for 5 nights, 6 days (Stay + Meals + Sightseeing):");
    System.out.println("Day 1: Arrival at Spiti, hotel check-in.");
    System.out.println("Day 2: Visit Key Monastery and Kibber Village.");
    System.out.println("Day 3: Visit Chandratal Lake.");
    System.out.println("Day 4: Visit Tabo Monastery and Dhankar Monastery.");
    System.out.println("Day 5: Explore local villages.");
    System.out.println("Day 6: Check-out and return home.");
    System.out.println("\nInclusions: Stay, Meals, Sightseeing.");
    System.out.println("Exclusions: Personal expenses.");
    System.out.println("Things to carry: Comfortable shoes, camera.");
}

public static void itinerarySpitiPackage3() {
    System.out.println("\nItinerary for 6 nights, 7 days (Stay + Meals + Sightseeing + Local Tour Guide):");
    System.out.println("Day 1: Arrival at Spiti, hotel check-in.");
    System.out.println("Day 2: Visit Key Monastery and Kibber Village.");
    System.out.println("Day 3: Visit Chandratal Lake.");
    System.out.println("Day 4: Visit Tabo Monastery and Dhankar Monastery.");
    System.out.println("Day 5: Explore local villages and monasteries.");
    System.out.println("Day 6: Full-day city tour with local guide.");
    System.out.println("Day 7: Check-out and return home.");
    System.out.println("\nInclusions: Stay, Meals, Sightseeing, Local Tour Guide.");
    System.out.println("Exclusions: Personal expenses.");
    System.out.println("Things to carry: Comfortable shoes, camera, water bottle.");
}

// Ladakh Bike Tour
public static double ladakhBikeTour(Scanner sc, int numberOfPeople) {
    System.out.println("\nChoose a package for Ladakh Bike Tour:");
    System.out.println("1. Rs.20000 for 7 nights, 8 days (Stay + Bike + Fuel + Meals)");
    System.out.println("2. Rs.25000 for 8 nights, 9 days (Stay + Bike + Fuel + Meals + Sightseeing)");
    System.out.println("3. Rs.30000 for 9 nights, 10 days (Stay + Bike + Fuel + Meals + Sightseeing + Tour Guide)");
    System.out.print("Enter your package choice (1-3): ");
    int packageChoice = sc.nextInt();

    double costPerPerson = 0;
    if (packageChoice == 1) {
        costPerPerson = 20000;
        itineraryLadakhBikePackage1();
    } else if (packageChoice == 2) {
        costPerPerson = 25000;
        itineraryLadakhBikePackage2();
    } else if (packageChoice == 3) {
        costPerPerson = 30000;
        itineraryLadakhBikePackage3();
    } else {
        System.out.println("Invalid package choice.");
        return 0;
    }

    return costPerPerson * numberOfPeople;
}

public static void itineraryLadakhBikePackage1() {
    System.out.println("\nItinerary for 7 nights, 8 days (Stay + Bike + Fuel + Meals):");
    System.out.println("Day 1: Arrival at Leh, bike handover, hotel check-in.");
    System.out.println("Day 2: Bike ride to Nubra Valley.");
    System.out.println("Day 3: Explore Nubra, return to Leh.");
    System.out.println("Day 4: Ride to Pangong Lake.");
    System.out.println("Day 5: Explore Pangong Lake, return to Leh.");
    System.out.println("Day 6: Ride to Khardung La.");
    System.out.println("Day 7: Explore Leh town.");
    System.out.println("Day 8: Check-out and return home.");
    System.out.println("\nInclusions: Stay, Bike, Fuel, Meals.");
    System.out.println("Exclusions: Sightseeing, Personal expenses.");
    System.out.println("Things to carry: Riding gear, warm clothing, camera.");
}

public static void itineraryLadakhBikePackage2() {
    System.out.println("\nItinerary for 8 nights, 9 days (Stay + Bike + Fuel + Meals + Sightseeing):");
    System.out.println("Day 1: Arrival at Leh, bike handover, hotel check-in.");
    System.out.println("Day 2: Bike ride to Nubra Valley.");
    System.out.println("Day 3: Explore Nubra, visit Diskit Monastery.");
    System.out.println("Day 4: Ride to Pangong Lake.");
    System.out.println("Day 5: Explore Pangong Lake, return to Leh.");
    System.out.println("Day 6: Ride to Khardung La.");
    System.out.println("Day 7: Explore Leh town, visit Leh Palace.");
    System.out.println("Day 8: Visit Shanti Stupa and local monasteries.");
    System.out.println("Day 9: Check-out and return home.");
    System.out.println("\nInclusions: Stay, Bike, Fuel, Meals, Sightseeing.");
    System.out.println("Exclusions: Personal expenses.");
    System.out.println("Things to carry: Riding gear, warm clothing, camera.");
}

public static void itineraryLadakhBikePackage3() {
    System.out.println("\nItinerary for 9 nights, 10 days (Stay + Bike + Fuel + Meals + Sightseeing + Tour Guide):");
    System.out.println("Day 1: Arrival at Leh, bike handover, hotel check-in.");
    System.out.println("Day 2: Bike ride to Nubra Valley.");
    System.out.println("Day 3: Explore Nubra, visit Diskit Monastery.");
    System.out.println("Day 4: Ride to Pangong Lake.");
    System.out.println("Day 5: Explore Pangong Lake, return to Leh.");
    System.out.println("Day 6: Ride to Khardung La.");
    System.out.println("Day 7: Explore Leh town, visit Leh Palace.");
    System.out.println("Day 8: Visit Shanti Stupa and local monasteries.");
    System.out.println("Day 9: Full-day city tour with guide.");
    System.out.println("Day 10: Check-out and return home.");
    System.out.println("\nInclusions: Stay, Bike, Fuel, Meals, Sightseeing, Tour Guide.");
    System.out.println("Exclusions: Personal expenses.");
    System.out.println("Things to carry: Riding gear, warm clothing, camera, helmet.");
}

}

