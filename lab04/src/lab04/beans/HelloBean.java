package lab04.beans;

import javax.ejb.Stateless;

@Stateless
public class HelloBean {
	public String sayHello(String name) {
		return "Hello " + name + " !";
	}
}
