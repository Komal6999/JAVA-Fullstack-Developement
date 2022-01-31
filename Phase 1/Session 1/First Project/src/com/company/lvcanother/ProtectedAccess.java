package com.company.lvcanother;

import com.company.lvc.AccessSpecifier;

public class ProtectedAccess extends AccessSpecifier {

	public static void main(String[] args) {
		
		ProtectedAccess p=new ProtectedAccess();
		p.display();
		
		//p.test();
		//child can access protected property but not private

	}

}
