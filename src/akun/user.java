/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akun;

/**
 *
 * @author revan
 */
public class user {
    private String id;
    private String nama;
    private String email;
    private String kode;
    
    public void setkode(String kode){
        this.kode = kode;
    }
    
    public String getkode(){
        return this.kode;
    }
    
    public void setID(String id){
        this.id = id;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
//    public void setProdi(String prodi){
//        
//    };
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getID(){
        return this.id;
    }
    
    public String getNama(){
        return nama;
    }
    
//    public String getProdi(){
//        return "prodi";
//    };
    
    public String getEmail(){
        return email;
    }
}
