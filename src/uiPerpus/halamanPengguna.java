/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uiPerpus;

import akun.member;
import akun.user;
//import buku.DaoBuku;
//import buku.buku;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.swing.JOptionPane;
//import javax.swing.JTable;
//import javax.swing.table.DefaultTableModel;
//import koneksi.koneksi;
//import peminjamanBuku.DAOpeminjaman;
//import peminjamanBuku.peminjaman;

/**
 *
 * @author revan
 */
public class halamanPengguna extends javax.swing.JFrame {
    Connection conn;
    user pengguna;
    /**
     * Creates new form halamanPengguna
     */
    public halamanPengguna() {
        initComponents();
        
    }
    
    public halamanPengguna(Connection con, user pengguna) {
        this.conn = con;
        this.pengguna = pengguna;
         initComponents();
         this.labelNama.setText(this.pengguna.getNama());
         this.labelID.setText(this.pengguna.getID());
         this.labelNama1.setText(this.pengguna.getNama());
         this.labelID1.setText(this.pengguna.getID());

         this.panelAdmin.setVisible(false);
        this.panelMember.setVisible(false);
        
               
        
        if("2".equals(this.pengguna.getkode())){
            this.panelMember.setVisible(true);
            this.panelCariBuku1.setVisible(false);
            this.labelProdi.setText(((member)pengguna).getProdi());
           
        }else{
            this.panelAdmin.setVisible(true);
            this.panelHapusBuku1.setVisible(false);
            this.panelTambahBuku1.setVisible(false);
            this.panelPengembalian1.setVisible(false);
            
            
        }
       
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        panelMember = new javax.swing.JPanel();
        panelNavigasi = new javax.swing.JPanel();
        labelID = new javax.swing.JLabel();
        labelNama = new javax.swing.JLabel();
        menuUtama = new javax.swing.JButton();
        cariBuku = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        labelProdi = new javax.swing.JLabel();
        panelUtama = new javax.swing.JPanel();
        panelCariBuku1 = new uiPerpus.panelCariBuku(this.conn);
        panelInfo1 = new uiPerpus.panelInfo(this.conn, this.pengguna);
        panelAdmin = new javax.swing.JPanel();
        panelNavigasi1 = new javax.swing.JPanel();
        labelID1 = new javax.swing.JLabel();
        labelNama1 = new javax.swing.JLabel();
        peminjaman = new javax.swing.JButton();
        pengembalian = new javax.swing.JButton();
        bukubaru = new javax.swing.JButton();
        hapusbuku = new javax.swing.JButton();
        logout2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        panelUtama1 = new javax.swing.JPanel();
        panelTambahBuku1 = new uiPerpus.panelTambahBuku(this.conn);
        panelPinjam2 = new uiPerpus.panelPinjam(this.conn);
        panelHapusBuku1 = new uiPerpus.panelHapusBuku(this.conn);
        panelPengembalian1 = new uiPerpus.PanelPengembalian(this.conn);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelMember.setBackground(new java.awt.Color(204, 204, 255));
        panelMember.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        panelNavigasi.setBackground(new java.awt.Color(41, 54, 63));
        panelNavigasi.setForeground(new java.awt.Color(255, 255, 255));

        labelID.setBackground(new java.awt.Color(255, 255, 255));
        labelID.setFont(new java.awt.Font("Gadugi", 0, 11)); // NOI18N
        labelID.setForeground(new java.awt.Color(255, 255, 255));
        labelID.setText("ID      :");

        labelNama.setBackground(new java.awt.Color(255, 255, 255));
        labelNama.setFont(new java.awt.Font("Gadugi", 0, 11)); // NOI18N
        labelNama.setForeground(new java.awt.Color(255, 255, 255));
        labelNama.setText("Nama : ");

        menuUtama.setBackground(new java.awt.Color(110, 217, 161));
        menuUtama.setFont(new java.awt.Font("Gadugi", 1, 11)); // NOI18N
        menuUtama.setForeground(new java.awt.Color(102, 102, 102));
        menuUtama.setText("Cari Buku");
        menuUtama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUtamaActionPerformed(evt);
            }
        });

        cariBuku.setBackground(new java.awt.Color(110, 217, 161));
        cariBuku.setFont(new java.awt.Font("Gadugi", 1, 11)); // NOI18N
        cariBuku.setForeground(new java.awt.Color(102, 102, 102));
        cariBuku.setText("Menu Utama");
        cariBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariBukuActionPerformed(evt);
            }
        });

        logout.setBackground(new java.awt.Color(204, 51, 0));
        logout.setFont(new java.awt.Font("Gadugi", 1, 11)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("LogOut");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uiPerpus/photo profile.png"))); // NOI18N

        labelProdi.setBackground(new java.awt.Color(255, 255, 255));
        labelProdi.setFont(new java.awt.Font("Gadugi", 0, 11)); // NOI18N
        labelProdi.setForeground(new java.awt.Color(255, 255, 255));
        labelProdi.setText("Prodi :");

        javax.swing.GroupLayout panelNavigasiLayout = new javax.swing.GroupLayout(panelNavigasi);
        panelNavigasi.setLayout(panelNavigasiLayout);
        panelNavigasiLayout.setHorizontalGroup(
            panelNavigasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNavigasiLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(panelNavigasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelProdi)
                    .addComponent(jLabel2)
                    .addComponent(labelID)
                    .addComponent(labelNama)
                    .addGroup(panelNavigasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cariBuku, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(menuUtama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        panelNavigasiLayout.setVerticalGroup(
            panelNavigasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNavigasiLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addComponent(labelNama)
                .addGap(13, 13, 13)
                .addComponent(labelID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelProdi)
                .addGap(20, 20, 20)
                .addComponent(cariBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(menuUtama, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(391, Short.MAX_VALUE))
        );

        panelUtama.setBackground(new java.awt.Color(204, 204, 255));

        panelCariBuku1.setBackground(new java.awt.Color(204, 204, 255));
        panelCariBuku1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        panelInfo1.setBackground(new java.awt.Color(204, 204, 255));
        panelInfo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        javax.swing.GroupLayout panelUtamaLayout = new javax.swing.GroupLayout(panelUtama);
        panelUtama.setLayout(panelUtamaLayout);
        panelUtamaLayout.setHorizontalGroup(
            panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUtamaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelInfo1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(panelCariBuku1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        panelUtamaLayout.setVerticalGroup(
            panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUtamaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelUtamaLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(panelCariBuku1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(panelInfo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(320, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelMemberLayout = new javax.swing.GroupLayout(panelMember);
        panelMember.setLayout(panelMemberLayout);
        panelMemberLayout.setHorizontalGroup(
            panelMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMemberLayout.createSequentialGroup()
                .addComponent(panelNavigasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelUtama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelMemberLayout.setVerticalGroup(
            panelMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelNavigasi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelUtama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelAdmin.setBackground(new java.awt.Color(204, 204, 255));
        panelAdmin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        panelNavigasi1.setBackground(new java.awt.Color(41, 54, 63));
        panelNavigasi1.setPreferredSize(new java.awt.Dimension(255, 730));

        labelID1.setFont(new java.awt.Font("Gadugi", 1, 11)); // NOI18N
        labelID1.setForeground(new java.awt.Color(204, 204, 204));
        labelID1.setText("ID        :");

        labelNama1.setFont(new java.awt.Font("Gadugi", 1, 11)); // NOI18N
        labelNama1.setForeground(new java.awt.Color(204, 204, 204));
        labelNama1.setText("Nama  :");

        peminjaman.setBackground(new java.awt.Color(110, 217, 161));
        peminjaman.setFont(new java.awt.Font("Gadugi", 1, 11)); // NOI18N
        peminjaman.setForeground(new java.awt.Color(102, 102, 102));
        peminjaman.setText("Peminjaman");
        peminjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peminjamanActionPerformed(evt);
            }
        });

        pengembalian.setBackground(new java.awt.Color(110, 217, 161));
        pengembalian.setFont(new java.awt.Font("Gadugi", 1, 11)); // NOI18N
        pengembalian.setForeground(new java.awt.Color(102, 102, 102));
        pengembalian.setText("Pengembalian");
        pengembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pengembalianActionPerformed(evt);
            }
        });

        bukubaru.setBackground(new java.awt.Color(110, 217, 161));
        bukubaru.setFont(new java.awt.Font("Gadugi", 1, 11)); // NOI18N
        bukubaru.setForeground(new java.awt.Color(102, 102, 102));
        bukubaru.setText("Tambah Buku Baru");
        bukubaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bukubaruActionPerformed(evt);
            }
        });

        hapusbuku.setBackground(new java.awt.Color(110, 217, 161));
        hapusbuku.setFont(new java.awt.Font("Gadugi", 1, 11)); // NOI18N
        hapusbuku.setForeground(new java.awt.Color(102, 102, 102));
        hapusbuku.setText("Hapus Buku");
        hapusbuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusbukuActionPerformed(evt);
            }
        });

        logout2.setBackground(new java.awt.Color(204, 51, 0));
        logout2.setFont(new java.awt.Font("Gadugi", 1, 11)); // NOI18N
        logout2.setForeground(new java.awt.Color(255, 255, 255));
        logout2.setText("LogOut");
        logout2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout2ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uiPerpus/photo profile.png"))); // NOI18N

        javax.swing.GroupLayout panelNavigasi1Layout = new javax.swing.GroupLayout(panelNavigasi1);
        panelNavigasi1.setLayout(panelNavigasi1Layout);
        panelNavigasi1Layout.setHorizontalGroup(
            panelNavigasi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNavigasi1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(panelNavigasi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelID1)
                    .addComponent(labelNama1)
                    .addComponent(jLabel1)
                    .addGroup(panelNavigasi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(peminjaman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pengembalian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bukubaru, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hapusbuku, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logout2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        panelNavigasi1Layout.setVerticalGroup(
            panelNavigasi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNavigasi1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addComponent(labelNama1)
                .addGap(18, 18, 18)
                .addComponent(labelID1)
                .addGap(34, 34, 34)
                .addComponent(peminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bukubaru, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(hapusbuku, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logout2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
        );

        panelUtama1.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout panelUtama1Layout = new javax.swing.GroupLayout(panelUtama1);
        panelUtama1.setLayout(panelUtama1Layout);
        panelUtama1Layout.setHorizontalGroup(
            panelUtama1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUtama1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTambahBuku1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPinjam2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelUtama1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelUtama1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelHapusBuku1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(panelUtama1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelUtama1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelPengembalian1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panelUtama1Layout.setVerticalGroup(
            panelUtama1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUtama1Layout.createSequentialGroup()
                .addGroup(panelUtama1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelUtama1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(panelTambahBuku1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelUtama1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(panelPinjam2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelUtama1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelUtama1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelHapusBuku1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(panelUtama1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelUtama1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelPengembalian1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout panelAdminLayout = new javax.swing.GroupLayout(panelAdmin);
        panelAdmin.setLayout(panelAdminLayout);
        panelAdminLayout.setHorizontalGroup(
            panelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdminLayout.createSequentialGroup()
                .addComponent(panelNavigasi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(panelUtama1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelAdminLayout.setVerticalGroup(
            panelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelNavigasi1, javax.swing.GroupLayout.DEFAULT_SIZE, 879, Short.MAX_VALUE)
            .addComponent(panelUtama1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1.setLayer(panelMember, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(panelAdmin, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuUtamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUtamaActionPerformed
        // TODO add your handling code here:
        this.panelInfo1.setVisible(false);
        this.panelCariBuku1.setVisible(true);
    }//GEN-LAST:event_menuUtamaActionPerformed

    private void cariBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariBukuActionPerformed
        // TODO add your handling code here:
        
        this.panelCariBuku1.setVisible(false);
        this.panelInfo1.setVisible(true);
        
    }//GEN-LAST:event_cariBukuActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
         try {
            // TODO add your handling code here:
            this.conn.close();
            dispose();
            uiLoginPage login = new uiLoginPage();
            login.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(halamanPengguna.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_logoutActionPerformed

    private void bukubaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bukubaruActionPerformed
        // TODO add your handling code here:
        this.panelPinjam2.setVisible(false);
        this.panelHapusBuku1.setVisible(false);
        this.panelTambahBuku1.setVisible(true);
        this.panelPengembalian1.setVisible(false);
    }//GEN-LAST:event_bukubaruActionPerformed

    private void hapusbukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusbukuActionPerformed
        // TODO add your handling code here:
        this.panelPinjam2.setVisible(false);
        this.panelHapusBuku1.setVisible(true);
        this.panelTambahBuku1.setVisible(false);
        this.panelPengembalian1.setVisible(false);
    }//GEN-LAST:event_hapusbukuActionPerformed

    private void peminjamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peminjamanActionPerformed
        // TODO add your handling code here:
        this.panelHapusBuku1.setVisible(false);
        this.panelPinjam2.setVisible(true);
        this.panelTambahBuku1.setVisible(false);
        this.panelPengembalian1.setVisible(false);
    }//GEN-LAST:event_peminjamanActionPerformed

    private void pengembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pengembalianActionPerformed
        // TODO add your handling code here:
        this.panelPengembalian1.setVisible(true);
        this.panelPinjam2.setVisible(false);
        this.panelHapusBuku1.setVisible(false);
        this.panelTambahBuku1.setVisible(false);
    }//GEN-LAST:event_pengembalianActionPerformed

    private void logout2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout2ActionPerformed
        try {
            // TODO add your handling code here:
            this.conn.close();
            dispose();
            uiLoginPage login = new uiLoginPage();
            login.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(halamanPengguna.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_logout2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(halamanPengguna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(halamanPengguna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(halamanPengguna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(halamanPengguna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new halamanPengguna().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bukubaru;
    private javax.swing.JButton cariBuku;
    private javax.swing.JButton hapusbuku;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel labelID;
    private javax.swing.JLabel labelID1;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelNama1;
    private javax.swing.JLabel labelProdi;
    private javax.swing.JButton logout;
    private javax.swing.JButton logout2;
    private javax.swing.JButton menuUtama;
    private javax.swing.JPanel panelAdmin;
    private uiPerpus.panelCariBuku panelCariBuku1;
    private uiPerpus.panelHapusBuku panelHapusBuku1;
    private uiPerpus.panelInfo panelInfo1;
    private javax.swing.JPanel panelMember;
    private javax.swing.JPanel panelNavigasi;
    private javax.swing.JPanel panelNavigasi1;
    private uiPerpus.PanelPengembalian panelPengembalian1;
    private uiPerpus.panelPinjam panelPinjam2;
    private uiPerpus.panelTambahBuku panelTambahBuku1;
    private javax.swing.JPanel panelUtama;
    private javax.swing.JPanel panelUtama1;
    private javax.swing.JButton peminjaman;
    private javax.swing.JButton pengembalian;
    // End of variables declaration//GEN-END:variables
}
