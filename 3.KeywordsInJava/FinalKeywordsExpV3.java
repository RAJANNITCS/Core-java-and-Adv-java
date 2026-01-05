// WAP to explain final keyword with Classes

// This class cannot be extended
final class SecretRecipe { 
    void prepareDrink() {
        System.out.println("Preparing the famous secret drink.");
    }
}

// ❌ ERROR! Cannot inherit from a final class.
// class MyNewDrink extends SecretRecipe {

//     void addFlavor() {
//         System.out.println("Adding my own flavor.");
//     }

// }

public class FinalKeywordsExpV3 {
    public static void main(String[] args) {
        // MyNewDrink obj = new MyNewDrink();
        // obj.addFlavor();
    }
}
