package Hospitalinfo;

public class Test {
	
		public static void main(String[] args) {
			
			Patient p=new Patient();
			p.setName("Apolo");
			p.setAddress("Nagpur");
			p.setDid(11);
			p.setDname("Amit");
			p.setDmobno(9511813791l);
			p.setPid(02);
			p.setPname("sky");
			p.setPcity("Pune");
			
			System.out.println(p.getName());
			System.out.println(p.getAddress());
			System.out.println(p.getDid());
			System.out.println(p.getDname());
			System.out.println(p.getDmobno());
			System.out.println(p.getPid());
			System.out.println(p.getPname());
			System.out.println(p.getPcity());
				
		}

	}

