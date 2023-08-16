
import java.io.*;

class GetSet {
private String name;
private int id;
	public int getID(){return id;}
 	public String getName(){return name; }

	public void setID(int n){
		this.id = n;
	}
 	public void setName(String i){
	this.name = i;
 }
}
class GFG {
// Main driver method 
	public static void main(String[] args)
	{
		GetSet obj = new GetSet();

		obj.setName("aadi");
		obj.setID(43);
		System.out.println(obj.getID());
		System.out.println(obj.getName());
	}
}
