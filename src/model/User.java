package model;

public class User {
  protected String userId, name;
  public User(String userId, String name) {
	  this.userId = userId;
	  this.name = name;
  }
  public String getUserId() {
	  return userId;
  }
  public String getName() {
	  return name;
  }
  public void setName(String name) {
	  if(name.equals(""))
		  throw new IllegalArgumentException("Invalid name.");
	  this.name = name;
  }
  
}
