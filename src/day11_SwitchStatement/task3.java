package day11_SwitchStatement;

public class task3 {

    public static void main(String[] args) {

        String browserName = "Safari";
        String result = "";

        switch (browserName) {
            case "Safari":
                result = "Safari";
                break;
            case "Chrome":
                result = "Chrome";
                break;

            case "Firefox":
                result = "Firefox";
                break;
            case "Opera":
                result = "opera";
                break;
            case "Edge":
                result = "Edge";
                break;
            default:
                result = "Invalid browser";


        }

        System.out.println(result);
    }
// askkk

}
/*
3.  write a program that can display the selected browser
            3.1  declare a String variable called browserName
            3.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            3.3 if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser

        	Do Not use if statement or ternary

 */