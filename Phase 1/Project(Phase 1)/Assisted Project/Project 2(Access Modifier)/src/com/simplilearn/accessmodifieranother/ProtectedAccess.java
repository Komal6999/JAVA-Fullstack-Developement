package com.simplilearn.accessmodifieranother;

import com.simplilearn.accessmodifier.AccessSpecifier;

public class ProtectedAccess extends AccessSpecifier{
	
public static void main(String[] args) {
		
		ProtectedAccess p=new ProtectedAccess();
		p.display();
		
		//p.test();
		//child can access protected property but not private
     }
}
