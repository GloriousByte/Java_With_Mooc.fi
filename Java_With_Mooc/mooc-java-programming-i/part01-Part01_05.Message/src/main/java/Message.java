
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class Message {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LicensePlate li1 = new LicensePlate("FI", "ABC-123");
        LicensePlate li2 = new LicensePlate("FI", "UXE-465");
        LicensePlate li3 = new LicensePlate("D", "B WQ-431");

        ArrayList<LicensePlate> finnishPlates = new ArrayList<>();
        finnishPlates.add(li1);
        finnishPlates.add(li2);

        LicensePlate newLi = new LicensePlate("FI", "ABC-123");
        if (!finnishPlates.contains(newLi)) {
            finnishPlates.add(newLi);
        }
        System.out.println("finnish: " + finnishPlates);
        // if the equals-method hasn't been overwritten, the same license number will be added to the list againg

        HashMap<LicensePlate, String> owners = new HashMap<>();
        owners.put(li1, "Arto");
        owners.put(li3, "Jürgen");

        System.out.println("owners:");
        System.out.println(owners.get(new LicensePlate("FI", "ABC-123")));
        System.out.println(owners.get(new LicensePlate("D", "B WQ-431")));
        // if the hasCode-method hasn't been overwritten, the owners won't be found
        
        VehicleRegistry first = new VehicleRegistry();
        first.add(li2,"kwame");
        first.add(li1,"ama");
        
        first.printLicensePlates();
        first.printLicensePlatesAndOwners();
        
        DictionaryOfManyTranslations dictionary = new DictionaryOfManyTranslations();
        dictionary.add("lie", "maata");
        dictionary.add("lie", "valehdella");

        dictionary.add("bow", "jousi");
        dictionary.add("bow", "kumartaa");

        System.out.println(dictionary.translate("lie"));
        dictionary.remove("bow");
        System.out.println(dictionary.translate("bow"));
        
        StorageFacility facility = new StorageFacility();
        facility.add("a14", "ice skates");
        facility.add("a14", "ice hockey stick");
        facility.add("a14", "ice skates");

        facility.add("f156", "rollerblades");
        facility.add("f156", "rollerblades");

        facility.add("g63", "six");
        facility.add("g63", "pi");

        System.out.println(facility.contents("a14"));
        System.out.println(facility.contents("f156"));
        System.out.println(" ");
        System.out.println(" ");
        
        StorageFacility facilityy = new StorageFacility();
        facilityy.add("a14", "ice skates");
        facilityy.add("a14", "ice hockey stick");
        facilityy.add("a14", "ice skates");

        facilityy.add("f156", "rollerblades");
        facilityy.add("f156", "rollerblades");

        facilityy.add("g63", "six");
        facilityy.add("g63", "pi");

        facilityy.remove("f156", "rollerblades");

        System.out.println(facilityy.contents("f156"));

        facilityy.remove("f156", "rollerblades");

        System.out.println(facilityy.storageUnits());
 }

}

