/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Extentions;

/**
 *
 * @author DuyNguyen
 */
public class Check {

    public Check() {
        
    }
    public boolean isDigit(String str){
        // Nếu chuỗi null hoặc rỗng hoặc chuỗi toàn ký tự trắng 
        if(str == null || str.isBlank()){ 
            return false;
        }
        
        // Bỏ ký tự trắng 2 bên
        str = str.trim();
        if(str.startsWith("-")){
            return str.substring(1).matches("[0-9]*");
        }else{
            return str.matches("[0-9]*");
        }
    }
    
    public boolean isNullOrEmpty(String str){
        // Nếu chuỗi null hoặc rỗng hoặc chuỗi toàn ký tự trắng 
        if(str == null || str.isBlank()){ 
            return true;
        }
        return false; 
    }
}
