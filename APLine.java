

	public class APLine {
		
		public double xcoeff, ycoeff;
		public double constant;
		
		
		public APLine () {
			
			
		}
		
		public APLine(int a, int b, int c) {
			this.xcoeff = a;
			this.ycoeff = b;
			this.constant = c;
			
		}
		
		public double getSlope () {
			double a = -(this.xcoeff)/(this.ycoeff);
			return a;
		}
		
		public boolean isOnLine(int x, int y) {
			
			boolean	b;
			
			double j = (this.xcoeff * (x)) + (this.ycoeff * (y)) + this.constant;
			
			
			if (j == 0) 
			{
				b = true;
			}
			else {
			    b = false;
			}
			
			return b;
			
		}
		
		
		
		public static void main(String[] args) {
			
			APLine Line1 = new APLine(5, 4, -17);
			double slope1 = Line1.getSlope();
			boolean onLine1 = Line1.isOnLine(5, -2);
			
			APLine Line2 = new APLine(-25, 40, 30);
			double slope2 = Line2.getSlope();
			boolean onLine2 = Line2.isOnLine(5, -2);
			
			
	
		}
	
	}
