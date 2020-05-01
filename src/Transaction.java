//You will need to create a new class called Transaction ... changing this name will not do
public class Transaction implements addable, removable {

 /*Just like you defined for Catalog ...an array of LibraryItems, 
  * You will define for this class , an array of checkOutItem
  * An array list makes its a bit easy than an array ... 
  */



 //or you could do this:

 CheckoutItem[] checkOutList1;
    private int pos;
 public Transaction() {
      pos=0;
  checkOutList1 = new CheckoutItem[5];
 }
 @Override
 public CheckoutItem[] removeCheckOutItem1(int index) {
  checkOutList1[index].setAvailable(false);
  if (checkOutList1 == null || index < 0 || index >= checkOutList1.length) {
   return checkOutList1;
  }


  // Create another array of size one less 
  CheckoutItem[] anotherArray = new CheckoutItem[checkOutList1.length - 1];

  // Copy the elements except the index 
  // from original array to the other array 
  for (int i = 0, k = 0; i < checkOutList1.length; i++) {

   // if the index is 
   // the removal element index 
   if (i == index) {
    continue;
   }

   // if the index is not 
   // the removal element index 
   anotherArray[k++] = checkOutList1[i];
  }
this.pos=this.pos-1;
  // return the resultant array
  checkOutList1=anotherArray;
  return anotherArray;
 }



 @Override
 public CheckoutItem[] addCheckOutItem1(CheckoutItem item) {
  // TODO Auto-generated method stub
  checkOutList1[pos]=item;
  pos++;
  return checkOutList1;
 }

 public CheckoutItem[] getTransaction() {
  return checkOutList1;
 }

 public void printCatalog(Transaction[] checkOutList1) {

     for (Transaction checkOutList11 : checkOutList1) {
         System.out.println(checkOutList11.toString());
     }



 }
}