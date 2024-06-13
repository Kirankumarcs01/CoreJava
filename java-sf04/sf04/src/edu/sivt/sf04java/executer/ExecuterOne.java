package edu.sivt.sf04java.executer;

import edu.sivt.sf04java.base.Base;

public class ExecuterOne extends Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Base bone = new Base();
		//bone.varprivate;
		
		//default variable are not accessible outside the package
		//System.out.println(bone.variableDefault);
		
		ExecuterOne ex = new ExecuterOne();
		System.out.println(ex.variableProtected);
		
		System.out.println(bone.variablePublic);
		

	}

}
