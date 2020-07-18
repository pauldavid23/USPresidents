package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	System.out.println("Type a number from 1 to 45 to determine the U.S. President");
	if (scanner.hasNextInt()) {
	    int num = scanner.nextInt();
	    scanner.nextLine();

	    switch (num) {
            case 1:
                System.out.println("President number " + num + " is George Washington");
                break;
            case 2:
                System.out.println("President number " + num + " is John Adams");
                break;
            case 3:
                System.out.println("President number " + num + " is Thomas Jefferson");
                break;
            case 4:
                System.out.println("President number " + num + " is James Madison");
                break;
            case 5:
                System.out.println("President number " + num + " is James Monroe");
                break;
            case 6:
                System.out.println("President number " + num + " is John Quincy Adams");
                break;
            case 7:
                System.out.println("President number " + num + " is Andrew Jackson");
                break;
            case 8:
                System.out.println("President number " + num + " is Martin Van Buren");
                break;
            case 9:
                System.out.println("President number " + num + " is William Henry Harrison");
                break;
            case 10:
                System.out.println("President number " + num + " is John Tyler");
                break;
            case 11:
                System.out.println("President number " + num + " is James K. Polk");
                break;
            case 12:
                System.out.println("President number " + num + " is Zachary Taylor");
                break;
            case 13:
                System.out.println("President number " + num + " is Millard Fillmore");
                break;
            case 14:
                System.out.println("President number " + num + " is Franklin Pierce");
                break;
            case 15:
                System.out.println("President number " + num + " is James Buchanan");
                break;
            case 16:
                System.out.println("President number " + num + " is Abraham Lincoln");
                break;
            case 17:
                System.out.println("President number " + num + " is Andrew Johnson");
                break;
            case 18:
                System.out.println("President number " + num + " is Ulysses Grant");
                break;
            case 19:
                System.out.println("President number " + num + " is Rutherford Hayes");
                break;
            case 20:
                System.out.println("President number " + num + " is James Garfield");
                break;
            case 21:
                System.out.println("President number " + num + " is Chester Arthur");
                break;
            case 22:
                System.out.println("President number " + num + " is Grover Cleveland");
                break;
            case 23:
                System.out.println("President number " + num + " is Benjamin Harrison");
                break;
            case 24:
                System.out.println("President number " + num + " is Grover Cleveland");
                break;
            case 25:
                System.out.println("President number " + num + " is William Mckinley");
                break;
            case 26:
                System.out.println("President number " + num + " is Theodore Roosevelt");
                break;
            case 27:
                System.out.println("President number " + num + " is William Howard Taft");
                break;
            case 28:
                System.out.println("President number " + num + " is Woodrow Wilson");
                break;
            case 29:
                System.out.println("President number " + num + " is Warren Harding");
                break;
            case 30:
                System.out.println("President number " + num + " is Calvin Coolidge");
                break;
            case 31:
                System.out.println("President number " + num + " is Herbert Hoover");
                break;
            case 32:
                System.out.println("President number " + num + " is Franklin Roosevelt");
                break;
            case 33:
                System.out.println("President number " + num + " is Harry Truman");
                break;
            case 34:
                System.out.println("President number " + num + " is Dwight Eisenhower");
                break;
            case 35:
                System.out.println("President number " + num + " is John F. Kennedy");
                break;
            case 36:
                System.out.println("President number " + num + " is Lyndon Johnson");
                break;
            case 37:
                System.out.println("President number " + num + " is Richard Nixon");
                break;
            case 38:
                System.out.println("President number " + num + " is Gerald Ford");
                break;
            case 39:
                System.out.println("President number " + num + " is Jimmy Carter");
                break;
            case 40:
                System.out.println("President number " + num + " is Ronald Reagan");
                break;
            case 41:
                System.out.println("President number " + num + " is George H.W. Bush");
                break;
            case 42:
                System.out.println("President number " + num + " is Bill Clinton");
                break;
            case 43:
                System.out.println("President number " + num + " is George W. Bush");
                break;
            case 44:
                System.out.println("President number " + num + " is Barack Obama");
                break;
            case 45:
                System.out.println("President number " + num + " is Donald Trump");
                break;
            default:
                System.out.println("Invalid Input!");
                break;


        }









    } else {
        System.out.println("Invalid input!");
    }
    }
}
