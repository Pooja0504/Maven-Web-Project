import org.springframework.boot.SpringApplication;
@ComponentScan(exclude=pooja.class,scanBasePackages={"net.javabeat"})
@SpringBootApplication
public class javaChecks {
private int x ,y ,z,apiCount;
	boolean b;
		
	 public static void main(String args[]) {  
	     //SpringApplication.run(javaChecks.class, args);
	     System.out.println("Hello");  
	    }  
	private boolean active;
	
	 
	public void setX(int val) {
		//this is for test
		this.y = val;
	}
	
	public int getAPISize()
	{
	return apiCount;
	
	}

	
	public int getY() {
		return this.x;
	}

	
	  public boolean isActive()
		  {
		    return b;
		  }

	  		
		  public void setActive(boolean b)
		  {
		    this.b = b;
		  }
		  
		  
		  public int getName() {	
			  System.out.println(" ");
			  return this.x;
			}
	

  
		  
			
		  	public void setName(int val) {
			    System.out.println(" ");
				this.y = val;
			}
		  	
		
			public void setZ(int val) {
				this.z = val;
			}
			
			public int getZ(int val) {
				
				return x;
			}
			
}
