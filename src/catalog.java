import java.util.ArrayList;
public class catalog implements searchable, viewable {

 private final LibraryItem[] libraryCollection;

 public catalog() {

  ArrayList < LibraryItem > cat2;
     cat2 = new ArrayList <  > ();

  cat2.add(new Book(100, "Spartacus", true, "4r5t", "Strauss", "pen"));
  cat2.add(new Video(200, "Avengers", true, "Disney", "Hemsworth"));

  libraryCollection = new LibraryItem[2]; //instantiate array

  libraryCollection[0] = new Book(100, "Spartacus", true, "4r5t", "Strauss", "pen");
  libraryCollection[1] = new Video(200, "Avengers", true, "Disney", "Hemsworth");

  //add more, have client add some
 }

 public LibraryItem getCatalog1(LibraryItem cat2) {
  return cat2;

 }
 public LibraryItem[] getCatalog() {
  return libraryCollection;
 }

    /**
     *
     * @param callNumber
     * @return
     */
    @Override
 public LibraryItem searchCatalog(int callNumber) {
  LibraryItem item = null;

     for (LibraryItem libraryCollection1 : libraryCollection) {
         if (libraryCollection1.getCallNumber() == callNumber) {
             item = libraryCollection1;
         }
     }
  return item;
 }

    /**
     *
     * @param title
     * @return
     */
    @Override
 public LibraryItem searchCatalog(String title) {
  LibraryItem item = null;

     for (LibraryItem libraryCollection1 : libraryCollection) {
         if (libraryCollection1.getTitle().equals(title)) {
             item = libraryCollection1;
         }
     }
  return item;
 }

    /**
     *
     * @param author
     * @return
     */
    @Override
 public LibraryItem searchCatalog1(String author) {
  LibraryItem item = null;

     for (LibraryItem libraryCollection1 : libraryCollection) {
         if ((libraryCollection1).getAuthor().equals(author)) {
             item = libraryCollection1;
         }
     }

  return item;


 }

    /**
     *
     * @param artist
     * @return
     */
    @Override
 public LibraryItem searchCatalog2(String artist) {
  LibraryItem item = null;

     for (LibraryItem libraryCollection1 : libraryCollection) {
         if (((Video) libraryCollection1).getArtist().equals(artist)) {
             item = libraryCollection1;
         }
     }

  return item;


 }

 @Override
 public void printCatalog(LibraryItem[] catalogList) {

     for (LibraryItem catalogList1 : catalogList) {
         System.out.println(catalogList1.toString());
     }


 }

}