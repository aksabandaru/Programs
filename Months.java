package addition; 
public enum Months {

	
		JANUARY(0),FEBRUARY(1),MARCH(2),APRIL(3),MAY(4),JUNE(5),JULY(6),AUGUST(7),SEPTEMPER(8),OCTOBER(9),NOVEMBER(10),DECEMBER(11);
	private  int MontsIndex;
	Months(int name){
		this.MonthsIndex=name;
	}

	public static void main(String[] args) {
		System.out.println(Months.MARCH.getMonthsIndex());
		System.out.println(Months.APRIL);
	}
	
		public int getMonthsIndex() 
		{
			return MonthsIndex;
		}
	}




