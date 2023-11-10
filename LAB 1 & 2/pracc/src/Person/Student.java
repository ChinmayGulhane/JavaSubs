package Person;

public class Student {
	private int id;
	private String name;
	private String mobile;
	private int M1;
	private int M2;
	private int M3;
	static int count;
	
	
	static {
		count=0;
	}
	
	private int autoGenId()
	{
	count ++;	
//	if(this.name!=null)
//		return this.name.substring(0,3)+count;
//
//	else
//	return "AAA"+count;
	return count;
	}
	
	
	public Student() {
		count++;
		id=0;
		name=null;
		mobile=null;
		M1=0;
		M2=0;
		M3=0;
	}
	
	public Student( String name, String mobile, int M1,int M2,int M3) {
//		count++;					//using count
//		this.id=count;
		
		this.id=autoGenId();		//using method autoGenId()
		this.name=name;
		this.mobile=mobile;
		this.M1=M1;
		this.M2=M2;
		this.M3=M3;
	}
	
//	public void displayStudent() {
//		System.out.println("ID     : "+this.id);
//		System.out.println("NAME   : "+this.name);
//		System.out.println("MOBILE : "+this.mobile);
//		System.out.println("M1     : "+this.M1);
//		System.out.println("M2     : "+this.M2);
//		System.out.println("M3     : "+this.M3);
//	}
//	
	public String toString() {
		return "ID: "+this.id +"\n name:"+ this.name +"\n mobile : "+this.mobile  +"\n m1"+ this.M1 +"\nm2 : "+this.M2 +"\n m3:"+ this.M3;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public int getM1() {
		return M1;
	}


	public void setM1(int m1) {
		M1 = m1;
	}


	public int getM2() {
		return M2;
	}


	public void setM2(int m2) {
		M2 = m2;
	}


	public int getM3() {
		return M3;
	}


	public void setM3(int m3) {
		M3 = m3;
	}


	public static int getCount() {
		return count;
	}


	public static void setCount(int count) {
		Student.count = count;
	}
	
//	public int setid(int id) {
//		return this.id;
//	}
	
}
