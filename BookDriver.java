package com.jsp.HasARelationShip;

public class BookDriver {

	public static void main(String[] args) {
		Book b1= new Book("BSNARAS KE RAHASYA", "HISTORIC", 989);
b1.setAuthor(new Author ("Banarasi", "BaransiBabu@gami.com", 5646454545l));
b1.getAuthor().setAddress(new Address("DaswamethGhath","Gadoliya" , "UTTAR PRADESH", "BANARAS"));
	b1.printBookDetails();
	
	}

}
