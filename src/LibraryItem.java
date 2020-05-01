public class LibraryItem {
 private int callNumber;
 private String title;
 boolean available;

 public LibraryItem(int callNumber) {

 }

 public LibraryItem(int callNumber, String title, boolean available) {
  this.callNumber = callNumber;
  this.title = title;
  this.available = available;

 }




 @Override
 public String toString() {
  return "LibraryItem [callNumber=" + callNumber + ", title=" + title + ", available=" + available + "]";
 }




 public int getCallNumber() {
  return callNumber;
 }
 public void setCallNumber(int callNumber) {
  this.callNumber = callNumber;
 }
 public String getTitle() {
  return title;
 }
 public void setTitle(String title) {
  this.title = title;
 }
 public boolean isAvailable() {
  return available;
 }
 public void setAvailable(boolean available) {
  this.available = available;
 }




}