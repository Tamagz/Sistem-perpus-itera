/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peminjamanBuku;

import akun.user;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 900056
 */
public class DAOpeminjaman {
    
    LocalDate tanggal_pinjam;
    
    public boolean tambahpinjam(Connection con ,peminjaman pinjam) throws SQLException{
        tanggal_pinjam = LocalDate.now();
        String pjm=tanggal_pinjam.toString();
        
//        String sql="INSERT INTO peminjaman VALUES ('"+pinjam.getNoPeminjaman()+"','"+pinjam.getId()+"','"+pjm+"',default,'"+pinjam.getId_buku()+"');"; 
          String sql="insert into peminjaman values ('"+pinjam.getNoPeminjaman()+"','"+pinjam.getId()+"','"+pjm+"',default,'"+pinjam.getId_buku()+"');";
// (no_peminjaman,id,tanggal_pinjam,tanggal_kembali,id_buku)
        
        
        Statement stmt= con.createStatement();
        Statement stmt2= con.createStatement();
        Statement stmt3= con.createStatement();
       
        String sql2 = "update buku set status='dipinjam' where id_buku = '"+pinjam.getId_buku()+"' ";

        
        String sql3 = "select judul from buku where id_buku = '"+pinjam.getId_buku()+"' and status= 'tersedia' ";
      
        if(stmt.execute(sql3)){
           if(!stmt2.execute(sql2)){
              if(stmt2.execute(sql)){
                
                return true;
                
            } 
           }
            
        }
        return false;
        
    }
    
    public ResultSet lihatPeminjaman(Connection con, user pengguna){
        //String sql = "Select * from buku where id_buku IN (select id_buku from peminjaman where id = '"+pengguna.getID()+"');";
        String sql = "select * from peminjaman where id = '"+pengguna.getID()+"';";
        ResultSet rs = null;
        try {
            Statement stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(DAOpeminjaman.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
        
    }
    
    public String hitungJatuhTempo(String tanggal_pjm){
        LocalDate tanggal_pinjam = LocalDate.parse(tanggal_pjm);
        LocalDate jatuh_tempo = tanggal_pinjam.plusDays(7);
        
        return jatuh_tempo.toString();
    }
    
    public static void main(String[] args) {
        DAOpeminjaman g = new DAOpeminjaman();
        
        g.tanggal_pinjam = LocalDate.now();
        String pjm=g.tanggal_pinjam.toString();
       
        System.out.println(pjm);
        
        
    }
}
