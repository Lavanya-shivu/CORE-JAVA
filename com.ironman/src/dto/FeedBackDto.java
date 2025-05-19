package dto;

public class FeedBackDto {
    public String name;
    public String contactNumber;
    public String email;
    public String feedBack;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getContactNumber(){
        return contactNumber;
    }
    public void setContactNumber(String contactNumber){
        this.contactNumber=contactNumber;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getFeedBack(){
        return feedBack;
    }
    public void setFeedBack(String feedBack){
        this.feedBack=feedBack;
    }
}
