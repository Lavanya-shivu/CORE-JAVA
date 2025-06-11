package service;

import dto.StampedCaseDto;

public class StampedCaseServiceImpl implements StampedCaseService{
    @Override
    public boolean save(StampedCaseDto stampedCaseDto) {
        if(stampedCaseDto != null){
            String event = stampedCaseDto.getEvent();
            if(event.length()>2){
                System.out.println("Valid Event");
            }else {
                System.out.println("Invalid Event");
                return false;
            }
        }
        return true;
    }
}
