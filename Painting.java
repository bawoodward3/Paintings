public class Painting{
	protected String title;
	protected String name;
	protected String value;

	public Painting(){
		this.title = "";
		this.name = "";
		this.value = "";
	}

	public Painting(String t, String n){
		this.title = t;
		this.name = n;
		this.value = "400";
	}

	public void display(){
		System.out.println("Painting Title: " + title);
		System.out.println("Artist's Name: " + name);
		System.out.println("Total Value: $" + value);
	}

	
}