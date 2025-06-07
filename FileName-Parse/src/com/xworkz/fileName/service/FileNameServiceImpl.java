package com.xworkz.fileName.service;

import com.xworkz.fileName.dto.FileNameDto;

public class FileNameServiceImpl implements FileNameService{
    @Override
    public void extractExtension(FileNameDto fileNameDto) {
        try{
            if(fileNameDto == null || fileNameDto.getFileName()== null){
                throw new NullPointerException("File Name is null");
            }
            String filename = fileNameDto.getFileName();
            int fileNameDtoIndex = filename.lastIndexOf(".");
            String extension = filename.substring(fileNameDtoIndex +1);
            System.out.println("File Extension:" +extension);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Error:The file doesn't contain a valid extension" );
        }catch (NullPointerException e){
            System.out.println("Error:" +e.getMessage());
        }
    }
}
