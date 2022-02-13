package com.project.lockedme;

import java.io.IOException;
import java.util.Scanner;

public class Menus {

	Scanner scan = new Scanner(System.in);
	OperationsDAO dao = new OperationsDAO();
	
	public void introScreen() {
		System.out.println();
		System.out.println("*************************************************");
		System.out.println("*       DEVELOPED BY KOMAL PATIL                *");
		System.out.println("*************************************************");
		System.out.println("*         LOCKEDME.COM                          *");
		System.out.println("*************************************************");
		System.out.println("*     Directory: " + Main.path +"       *");
		System.out.println("*************************************************");
		System.out.println("\n\n");
	}
	
	public void exitScreen() {
		System.out.println("*************************************************");
		System.out.println("*************************************************");
		System.out.println("*                                               *");
		System.out.println("*   THANK YOU FOR VISITING LOCKEDME.COM         *");
		System.out.println("*                                               *");
		System.out.println("*************************************************");
		System.out.println("*************************************************");
		System.out.println("\n\n");
		
		}
	public void mainMenuOptions() {
		System.out.println("===========================================");
		System.out.println("|             MAIN MENU                   |");
		System.out.println("===========================================");
		System.out.println("|     Select any one of the following:     |");
		System.out.println("|           1 - List All Files             |");
		System.out.println("|           2 - More Options               |");
		System.out.println("|           3 -  Exit                   |");
		System.out.println("===========================================");
		System.out.println("Enter your choice :");
		
	}
	public  void subMenuOptions() {
		
		System.out.println("===========================================");
		System.out.println("|            SUB MENU                     |");
		System.out.println("===========================================");
		System.out.println("|  Select any one of the following:       |");
		System.out.println("|   1 - Add a file                |");
		System.out.println("|   2 - Delete a file             |");
		System.out.println("|   3 - Search a file             |");
		System.out.println("|   4 - Go Back                   |");
		System.out.println("===========================================");
		System.out.println("Enter your choice :");
	}
	
	public void mainMenu() {
		
		int choice = 0;
		char decision = 0;
		do {
			mainMenuOptions();
			
			try {
				choice = Integer.parseInt(scan.nextLine());
			}catch(NumberFormatException e) {
				System.out.println("\n Invalid Input \nValid Input Integers:(1-3)\n");
				mainMenuOptions();
				}
			switch(choice) {
			case 1:
				System.out.println();
				try {
					dao.listAllFiles(Main.path);
				}catch(NullPointerException e) {
					System.out.println(e.getMessage());
				}catch(IllegalArgumentException e) {
					System.out.println(e.getMessage());
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
				System.out.println("\n*************************************\n");
				break;
				
			case 2:
				System.out.println();
				subMenu();
				break;
			case 3:
				System.out.println("\n Are you sure you want to exit ? ");
				System.out.println(" (Y) ==> Yes   (N)==> No    ");
				decision = scan.nextLine().toUpperCase().charAt(0);
				if(decision == 'Y') {
					System.out.println("\n");
					exitScreen();
					System.exit(1);
				}else if(decision =='N') {
					System.out.println("\n Invalid Input \n Valid Inputs (Y/N)\n");
					mainMenuOptions();
				}
			default:
				System.out.println("\nInvalid Input \nValid Input Integers: (1-3)\n");
				mainMenuOptions();
			}
			
			}while(true);
	}
	
	public void subMenu() {
		String file = null;
		String fileName = null;
		int choice = 0;
		
		do {
			subMenuOptions();
			 try {
				 choice = Integer.parseInt(scan.nextLine());
			 }catch (NumberFormatException e) {
				 System.out.println("Invalid Inpput \n valid Input Integer: (1-4)");
				 subMenu();
			 }
			 
			 switch(choice) {
			 case 1:
				 System.out.println("\n==>  Adding a File...");
				 System.out.println("Please enter a file name : ");
				 file = scan.nextLine();
				 fileName = file.trim();
				 try {
					 dao.createNewFile(Main.path, fileName);
				 }catch(NullPointerException e) {
					 System.out.println(e.getMessage());
				 }catch(IOException e) {
					 System.out.println("Error occurred while adding file...");
					 System.out.println("please try again...");
				 }catch(Exception e) {
					 System.out.println("Error occurred while adding file...");
					 System.out.println("please try again...");
				 }
				 System.out.println("\n***************************************\n");
				 break;
				 
			 case 2:
				 System.out.println("\n==>  Deleting a File...");
				 System.out.println("Please enter a file name to Delete : ");
				 file = scan.nextLine();
				 fileName = file.trim();
				 try {
					 dao.deleteFile(Main.path, fileName);
				 }catch(NullPointerException e) {
					 System.out.println(e.getMessage());
				 }catch(IOException e) {
					 System.out.println("Error occurreed while Deleting File..");
					 System.out.println("Please try again");
				 }catch(Exception e) {
					 System.out.println("Error occurreed while Deleting File..");
					 System.out.println("Please try again");
					 
				 }
				 System.out.println("\n***************************************\n");
				 break;
				 
			 case 3:
				 
				 System.out.println("\n==>  Searching a File...");
				 System.out.println("Please enter a file name to Search : ");
				 file = scan.nextLine(); 
				 fileName = file.trim();
				 try {
					 dao.deleteFile(Main.path, fileName);
				 }catch(NullPointerException e) {
					 System.out.println(e.getMessage());
				 }catch(IllegalArgumentException e) {
					 System.out.println(e.getMessage());
				 }catch(Exception e) {
					 System.out.println(e.getMessage());
				 
				 }
				 System.out.println("\n***************************************\n");
				 break;
				 
			 case 4: mainMenuOptions();
			 break;
			 
			 default:
				  
				 System.out.println("Invalid Input \n valid Input Integers:(1-4)");
				 subMenu();
		}
			 file = null;
			 fileName = null;
	}while(true);
		
	}

	private void nextLine() {
		// TODO Auto-generated method stub
		
	}
	
}