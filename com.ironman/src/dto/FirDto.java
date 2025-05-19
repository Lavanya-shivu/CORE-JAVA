package dto;

public class FirDto {
    public String name;
    public String date;
    public String contactNumber;
    public  String reason;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getDate(){
        return date;
    }
    public void setDate(String date){
        this.date =date;
    }
    public String getContactNumber(){
        return contactNumber;
    }
    public void setContactNumber(String contactNumber){
        this.contactNumber=contactNumber;
    }
    public String getReason(){
        return reason;
    }
    public void setReason(String reason){
        this.reason=reason;
    }
}
