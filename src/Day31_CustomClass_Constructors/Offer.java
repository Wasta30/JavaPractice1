package Day31_CustomClass_Constructors;

public class Offer {
// instance : multiple copies created
    // each obj has sep copies
    public String location;
    public String companyName;
    public String JobTitle;
    public double salary;
    public boolean hasBenefit;
    public boolean hasPTO;
    public boolean isWFH;
    public boolean isFullTime;


    public void setInfo(String location, String companyName, String jobTitle, double salary, boolean hasBenefit, boolean hasPTO, boolean isWFH, boolean isFullTime) {
        this.location = location;
        this.companyName = companyName;
        JobTitle = jobTitle;
        this.salary = salary;
        this.hasBenefit = hasBenefit;
        this.hasPTO = hasPTO;
        this.isWFH = isWFH;
        this.isFullTime = isFullTime;
    }

    public String toString() {
        return "Offer{" +
                "location='" + location + '\'' +
                ", companyName='" + companyName + '\'' +
                ", JobTitle='" + JobTitle + '\'' +
                ", salary=$" + salary +
                ", hasBenefit=" + hasBenefit +
                ", hasPTO=" + hasPTO +
                ", isWFH=" + isWFH +
                ", isFullTime=" + isFullTime +
                '}';
    }
}
/*
Offer Task:
		1. Create a custom class named Offer
				Attributes:
						location, companyName, jobTitle, salary, hasBenefit, hasPTO, isWFH, isFullTime
// WFH : work from home
				Actions:
					setInfo(): sets all the instance variables
					toString(): returns the full info of the Offer Object








 */