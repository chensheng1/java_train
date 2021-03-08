package test3;

import java.util.ArrayList;

public class userdao implements IDAO{
	private static ArrayList<user> listuser=new ArrayList<user>();
	@Override
	public boolean tologin(user user) {
		// TODO Auto-generated method stub
		for(user i:listuser){
			if(i.getLoginuser().equals(user.getLoginuser())&&i.getLoginpwd().equals(user.getLoginpwd())){
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean toregit(user user) {
		// TODO Auto-generated method stub
		for(user u:listuser){
			if(u.getLoginuser().equals(user.getLoginuser())){
				return false;
			}
		}
		listuser.add(user);
		return true;
	}
	
}
