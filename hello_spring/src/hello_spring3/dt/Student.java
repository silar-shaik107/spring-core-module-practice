package hello_spring3.dt;

public class Student {
          private String stuName;
          private int stuId;
          private double avgOfMarks;
          private short passedOutYear;
          private boolean isSelected;
		public String getStuName() {
			return stuName;
		}
		public void setStuName(String stuName) {
			this.stuName = stuName;
		}
		public int getStuId() {
			return stuId;
		}
		public void setStuId(int stuId) {
			this.stuId = stuId;
		}
		public double getAvgOfMarks() {
			return avgOfMarks;
		}
		public void setAvgOfMarks(double avgOfMarks) {
			this.avgOfMarks = avgOfMarks;
		}
		public short getPassedOutYear() {
			return passedOutYear;
		}
		public void setPassedOutYear(short passedOutYear) {
			this.passedOutYear = passedOutYear;
		}
		public boolean isSelected() {
			return isSelected;
		}
		public void setisSelected(boolean isSelected) {
			this.isSelected = isSelected;
		}
          
}
