import java.util.Scanner;

public class FamousPainting extends Painting{

	public FamousPainting(){
		super();
	}

	public FamousPainting(String t, String n){
		super.title = t;
		super.name = n;
		value = "25,000";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Painting[] list = new Painting[10];

		for(int i = 0; i < 10; i++){
			System.out.println("");
			System.out.print("Enter Painting Title: ");
			String painting = sc.nextLine();
			System.out.print("Enter Artist's Name: ");
			String artist = sc.nextLine();
			if(artist.equalsIgnoreCase("Degas") || artist.equalsIgnoreCase("Monet") || artist.equalsIgnoreCase("Picasso") || artist.equalsIgnoreCase("Rembrandt")){
				list[i] = new FamousPainting(painting,artist);
			}
			else{
				list[i] = new Painting(painting,artist);
			}
		}

		for(int i = 0; i < 10; i++){
			System.out.println("");
			list[i].display();
		}
	}
}