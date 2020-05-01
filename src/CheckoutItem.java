public class CheckoutItem extends LibraryItem {
 String dueDate, accountHolderID;


 public CheckoutItem(LibraryItem temp, String dueDate, String accountHolderID) {
  super(temp.getCallNumber(), temp.getTitle(), temp.isAvailable());
  this.dueDate = dueDate;
  this.accountHolderID = accountHolderID;


 }


 public String getDueDate() {
  return dueDate;
 }


 public void setDueDate(String dueDate) {
  this.dueDate = dueDate;
 }


 public String getAccountHolderID() {
  return accountHolderID;
 }


 public void setAccountHolderID(String accountHolderID) {
  this.accountHolderID = accountHolderID;
 }


 public CheckoutItem(int callNumber, String title, boolean available) {
  super(callNumber, title, available);

  // TODO Auto-generated constructor stub
 }


}