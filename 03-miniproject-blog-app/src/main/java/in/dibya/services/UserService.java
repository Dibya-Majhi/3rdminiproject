package in.dibya.services;

import in.dibya.binding.Login;
import in.dibya.binding.Register;

public interface UserService {
	
	public Boolean register(Register register);
	
	public String login(Login login);
}
