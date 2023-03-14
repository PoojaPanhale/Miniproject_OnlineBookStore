package book;

public class bookinfo {
	        private String title;
	        private String author;
	        private int  quantity;
	        private String booktype;
	        private double price;
	        
	        public bookinfo()
	        {
	        	
	        }

			public bookinfo(String title, String author,int  quantity, String booktype, double price) {
				super();
				this.title = title;
				this.author = author;
				this.quantity =  quantity;
				this.booktype = booktype;
				this.price = price;
			}

			public String getTitle() {
				return title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public String getAuthor() {
				return author;
			}

			public void setAuthor(String author) {
				this.author = author;
			}
            
			public int getQuantity() {
				return quantity;
			}

			public void setQuantity(int quantity) {
				this.quantity = quantity;
			}

			public String getBooktype() {
				return booktype;
			}

			public void setBooktype(String booktype) {
				this.booktype = booktype;
			}

			public double getPrice() {
				return price;
			}

			public void setPrice(double price) {
				this.price = price;
			}

			@Override
			public String toString() {
				return "bookinfo"
						+ "\ntitle=" + title + "\n author=" + author +" \n quantity = "+ quantity + "\n booktype=" + booktype + "\n price=" + price;
			}
	        
	        

}
