import java.util.Scanner;

public class TestLibrary {

 public static void main(String[] args) {
  String username = "Jhon Doe";
  Scanner console = new Scanner(System.in);
  catalog cat1 = new catalog();
  Transaction trans1 = new Transaction();
  System.out.println("Here is the current catalog:");




  LibraryItem[] catalogList = cat1.getCatalog();
  for (LibraryItem catalogList1: catalogList) {
   System.out.println(catalogList1.toString());
  }
  int choice = 0;
  do {
   System.out.println("Would you like to view the catalog, or search for an item?");
   System.out.println("Press 1 to VIEW, press 2 to SEARCH");

   choice = console.nextInt();
   if (choice == 1) {


    cat1.printCatalog(catalogList);
   }

   if (choice == 2) {
    //i need to search the catalog using these variables. I need it to loop until the user presses 3 to checkout. up to 5 elements in checkout array
    int decision = 0;
    System.out.println("How would you like to add to the catalog?");
    System.out.println("Press 1 for CallNumber");
    System.out.println("Press 2 for Artist Name");
    System.out.println("Press 3 for Title");
    System.out.println("Press 4 for Author");
    decision = console.nextInt();
    switch (decision) {
     case 1:
      {
       System.out.println("Enter the CallNumber");
       int callNum = console.nextInt();
       LibraryItem temp = cat1.searchCatalog(callNum);
       System.out.println("The item found is");
       System.out.print(temp.toString());
       // i need to add items to checkout array
       System.out.println("Do you want to add this item in your cart(Y/N)");
       String de = console.nextLine();
       if ("Y".equals(de) || "y".equals(de)) {
        CheckoutItem chkout = new CheckoutItem(temp, username, "29/12/2020");
        trans1.addCheckOutItem1(chkout);
       } else
        break;
      }
     case 2:
      {
       System.out.println("Enter the ArtistName");
       String artist = console.nextLine();
       LibraryItem temp = cat1.searchCatalog2(artist);
       System.out.println("The item found is");
       System.out.print(temp.toString());
       // i need to add items to checkout array
       System.out.println("Do you want to add this item in your cart(Y/N)");
       String de = console.nextLine();
       if ("Y".equals(de) || "y".equals(de)) {
        CheckoutItem chkout = new CheckoutItem(temp, username, "29/12/2020");
        trans1.addCheckOutItem1(chkout);
       } else
        // i need to add items to checkout array

        break;
      }
     case 3:
      {
       System.out.println("Enter the Title");
       String title = console.nextLine();
       LibraryItem temp = cat1.searchCatalog(title);
       // i need to add items to checkout array
       System.out.println("Do you want to add this item in your cart(Y/N)");
       String de = console.nextLine();
       if ("Y".equals(de) || "y".equals(de)) {
        CheckoutItem chkout = new CheckoutItem(temp, username, "29/12/2020");
        trans1.addCheckOutItem1(chkout);
       } else
        break;
      }
     case 4:
      {
       System.out.println("Enter the Author");
       String author = console.nextLine();
       LibraryItem temp = cat1.searchCatalog1(author);
       // i need to add items to checkout array
       System.out.println("Do you want to add this item in your cart(Y/N)");
       String de = console.nextLine();
       if ("Y".equals(de) || "y".equals(de)) {
        CheckoutItem chkout = new CheckoutItem(temp, username, "29/12/2020");
        trans1.addCheckOutItem1(chkout);
       } else
        break;
      }
     default:
      break;
    }


   }

   break;

  } while (choice < 3);

 }

}