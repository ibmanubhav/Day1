package com.ibm;

class Book {
	private String Title;

	public String getTitle() {
		return this.Title;
	}

	public void setTitle(String title) throws Exception{
		if(title == null) {
			throw new MyException("title is null");
		}
		this.Title = title;
	}

	@Override
	public String toString() {
		return this.Title;
	}
	

}
public class Application{
	public static void main(String[] args) {
		Book book = new Book();
		try {
			book.setTitle(null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println("always");
		}
		System.out.println(book.toString());
	//	Book book1 = new Book();
	//	book1.setTitle("Learning Javascript");
	//	System.out.println(book1);
 	}
}