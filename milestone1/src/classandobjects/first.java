package classandobjects;
class box
{ int l,b,w;
	box(int le,int br,int wi)
	{
		l=le;
		b=br;
		w=wi;
	}
	int volume()
	{
		return(l*b*w);
	}
}
public class first {
	public static void main(String[] args) {
		box sc=new box(1,1,1);
		int v;
		v=sc.volume();
		System.out.println(v);
		
		
	}

}
