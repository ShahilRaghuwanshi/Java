package objectCreation;

public class MovieApp {
public static void main(String[] args) {
	//next two lines creating Movie Object
	Movie m1=new Movie();
	Movie m2=new Movie();
	
	//accessing member function of Object
	m1.make();
	m1.watch();
	m2.make();
	m2.watch();
	
	//next few lines will give value to the data member
	m1.name="shole";
	m1.id=123;
	m1.hero="dharam";
	m1.heroin="hema";
	m1.no_of_actor=4;
	
	m2.name="shole";
	m2.id=321;
	m2.hero="amit";
	m2.heroin="hema";
	m2.no_of_actor=4;
	
	System.out.println(m1.name);
	System.out.println(m1.id);
	System.out.println(m1.hero);
	System.out.println(m1.heroin);
	System.out.println(m1.no_of_actor);
	
	System.out.println(m2.name);
	System.out.println(m2.id);
	System.out.println(m2.hero);
	System.out.println(m2.heroin);
	System.out.println(m2.no_of_actor);
}
}
