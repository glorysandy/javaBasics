package firstpratice;

public class polymorphism {
public void gangDetails(String name) {
	System.out.println(name);}
public void gangDetails(int age) {
	System.out.println(age);
}
public void gangDetails(char id) {
	System.out.println(id);
}
	public static void main(String[]args) {
		polymorphism objectname =new polymorphism();
		objectname.gangDetails("sandy");
		objectname.gangDetails(21);
		objectname.gangDetails("glory");
	}

}
