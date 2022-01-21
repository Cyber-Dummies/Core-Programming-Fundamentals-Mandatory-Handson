import java.util.Scanner;
public class Associate{
    private int associateId;
    private String associateName;
    private String workStatus;
    
    public void Associate()
    {
    }
    public int getAssociateId()
    {
        return associateId;
    }
    
    public void setAssociateId(int id)
    {
        associateId=id; 
    }
    
    public String getAssociateName()
    {
        return associateName;
    }
    
    public void setAssociateName(String name)
    {
        associateName=name; 
    }
    
    public String getWorkStatus()
    {
        return workStatus;
    }
    
    public void setWorkStatus(String work)
    {
        workStatus=work; 
    }
    
    public void trackAssociateStatus(int days)
    {   
        
        if(days>=1&&days<=20)
        {
            this.setWorkStatus("Core skills");
        }
        
        else if(days>=21 && days<=40)
        {
            this.setWorkStatus("Advanced modules");
        }
        
        else if(days>=41 && days<=60)
        {
            this.setWorkStatus("Project phase");
        }
        
        else
        {
            this.setWorkStatus("Deployed in project");
        }
    }
}
