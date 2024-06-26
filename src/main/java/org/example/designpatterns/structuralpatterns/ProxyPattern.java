package org.example.designpatterns.structuralpatterns;

public class  ProxyPattern {
  public static void main(String[] args) {

	SecurityProxy securityProxy = new SecurityProxy(new ResourceImpl());
//	securityProxy.access("admin", "password");
	securityProxy.access("admin", "admin");
  }
}

interface Resource {
  void access();
  void close();
}

class ResourceImpl implements Resource {

  @Override
  public void access() {
	System.out.println("access is allowed");
  }

  @Override
  public void close() {
	System.out.println("Access is denied");
  }
}

class SecurityProxy {
  private Resource resource;

  public SecurityProxy(Resource resource) {
	this.resource = resource;
  }

  private boolean authenticate(String username, String password) {
	return username.equals("admin") && password.equals("admin");
  }

  public void access(String username, String password) {

	if (authenticate(username, password)) {
	  resource.access();
	} else {
	  resource.close();
	}
  }

}
