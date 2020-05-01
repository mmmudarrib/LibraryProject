
public class Book extends LibraryItem {
		private String ISBN;
		private String author;
		private String publisher;
		
		//one arg constructor
		public Book (int callNumber) {
			super(callNumber);
		}
		
		//full arg
		public Book(int callNumber, String Title, boolean available, String iSBN, String author, String publisher) {
			super(callNumber, Title, available);
			setISBN(iSBN);
			this.setAuthor(author);
			this.setPublisher(publisher);
		}
	//get and set

		@Override
		public String toString() {
			return "Book [ISBN=" + ISBN + ", author=" + author + ", publisher=" + publisher + "]";
		}

		public String getISBN() {
			return ISBN;
		}

		public void setISBN(String iSBN) {
			ISBN = iSBN;
		}

		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}

		public String getPublisher() {
			return publisher;
		}

		public void setPublisher(String publisher) {
			this.publisher = publisher;
		}

		public int getType() {
			
			return 0;
		}
		
		//toString/print
	
	

}
