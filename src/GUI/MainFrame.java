package GUI;


import Utils.XImage;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import jdk.javadoc.internal.tool.Start;
import sun.java2d.pipe.SpanShapeRenderer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author phuong
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
    }
          void init() {
            setSize(1000, 600);
            setIconImage(ShareHelper.APP_ICON);
            setLocationRelativeTo(null);

            new Timer(1000, new ActionListener() {
            SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss a");
            @Override
            public void actionPerformed(ActionEvent e) {
            lblTime.setText(format.format(new Date()));
            }
            }).start();
            this.openWelcome();
            this.openLogin();
            
 }
          void openLogin()
          {
            new DangNhapJDialog(this, true).setVisible(true);
          }
          void openWelcome()
          {
            new ChaoJDialog(this, true).setVisible(true);
          }
          void openThongKe(boolean index)
          {
            if(ShareHelper.authenticated()){
            new ThongKeJDialog(this,index).setVisible(true);
            }
            else{
            DialogHelper.alert(this, "Vui lòng đăng nhập!");
            }
            
          }
          void openNhanVien(){
            if(ShareHelper.authenticated()){
            new NhanVienJDialog(this,true).setVisible(true);
            }
            else{
            DialogHelper.alert(this, "Vui lòng đăng nhập!");
            }
            
            }
          void openKhoaHoc()
          {
            if(ShareHelper.authenticated()){
            new KhoaHocJDialog(this,true).setVisible(true);
            }
            else{
            DialogHelper.alert(this, "Vui lòng đăng nhập!");
            }
        }
          void openChuyenDe()
          {
        if(ShareHelper.authenticated()){
        new ChuyenDeJDialog(this,true).setVisible(true);
        }
        else{
        DialogHelper.alert(this, "Vui lòng đăng nhập!");
        }
         }
        void openNguoiHoc()
        {
            if(ShareHelper.authenticated()){
            new NguoiHocJDialog(this,true).setVisible(true);
            }
            else{
            DialogHelper.alert(this, "Vui lòng đăng nhập!");
            }
        }
        void openAbout()
        {
            new GioiThieuJDialog(this, true).setVisible(true);
        }
        void openWebsite()
        {
            try {
            Desktop.getDesktop().browse(new File("help/index.html").toURI());
                } 
            catch (IOException ex) {
            DialogHelper.alert(this, "Không tìm thấy file hướng dẫn!");
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

        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblDaoTao = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnDangNhap = new javax.swing.JMenuItem();
        mnDangXuat = new javax.swing.JMenuItem();
        spr = new javax.swing.JPopupMenu.Separator();
        mnDoiMatKhau = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnKetThuc = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnNguoiHoc = new javax.swing.JMenuItem();
        mnChuyenDe = new javax.swing.JMenuItem();
        mnKhoaHoc = new javax.swing.JMenuItem();
        mnNhanVien = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnNguoiHocTungNam = new javax.swing.JMenuItem();
        mnBangDiemKhoaHoc = new javax.swing.JMenuItem();
        mnDiemKhoaHoc = new javax.swing.JMenuItem();
        mnDoanhThu = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mnHuongDan = new javax.swing.JMenuItem();
        mnGioiThieu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/Exit.png"))); // NOI18N
        jButton1.setText("Đăng xuất");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/Stop.png"))); // NOI18N
        jButton2.setText("Kết thúc");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/Lists.png"))); // NOI18N
        jButton3.setText("Chuyên đề");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/Conference.png"))); // NOI18N
        jButton4.setText("Người học");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/Certificate.png"))); // NOI18N
        jButton5.setText("Khóa học");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton5);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/Globe.png"))); // NOI18N
        jButton6.setText("Hướng dẫn");
        jButton6.setFocusable(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton6);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/ongVang.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(279, 279, 279)
                .addComponent(jLabel2)
                .addContainerGap(463, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblDaoTao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/Info.png"))); // NOI18N
        lblDaoTao.setText("Hệ quản lý đào tạo");
        lblDaoTao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDaoTaoMouseClicked(evt);
            }
        });

        lblTime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/Alarm.png"))); // NOI18N
        lblTime.setText("10:12:30 AM");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDaoTao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTime))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDaoTao)
                    .addComponent(lblTime))
                .addContainerGap())
        );

        jMenu1.setText("Hệ thống");

        mnDangNhap.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnDangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/Key.png"))); // NOI18N
        mnDangNhap.setText("Đăng nhập");
        mnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnDangNhapActionPerformed(evt);
            }
        });
        jMenu1.add(mnDangNhap);

        mnDangXuat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_0, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/Exit.png"))); // NOI18N
        mnDangXuat.setText("Đăng xuất");
        mnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnDangXuatActionPerformed(evt);
            }
        });
        jMenu1.add(mnDangXuat);
        jMenu1.add(spr);

        mnDoiMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/Refresh.png"))); // NOI18N
        mnDoiMatKhau.setText("Đổi mật khẩu");
        jMenu1.add(mnDoiMatKhau);
        jMenu1.add(jSeparator2);

        mnKetThuc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F10, 0));
        mnKetThuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/Stop.png"))); // NOI18N
        mnKetThuc.setText("Kết thúc");
        mnKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnKetThucActionPerformed(evt);
            }
        });
        jMenu1.add(mnKetThuc);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Quản lý");

        mnNguoiHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/Conference.png"))); // NOI18N
        mnNguoiHoc.setText("Người học");
        mnNguoiHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnNguoiHocActionPerformed(evt);
            }
        });
        jMenu2.add(mnNguoiHoc);

        mnChuyenDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/Lists.png"))); // NOI18N
        mnChuyenDe.setText("Chuyên đề");
        mnChuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnChuyenDeActionPerformed(evt);
            }
        });
        jMenu2.add(mnChuyenDe);

        mnKhoaHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/Certificate.png"))); // NOI18N
        mnKhoaHoc.setText("Khóa học");
        mnKhoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnKhoaHocActionPerformed(evt);
            }
        });
        jMenu2.add(mnKhoaHoc);

        mnNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/User group.png"))); // NOI18N
        mnNhanVien.setText("Nhân viên");
        mnNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnNhanVienActionPerformed(evt);
            }
        });
        jMenu2.add(mnNhanVien);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Thống kê");

        mnNguoiHocTungNam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/Clien list.png"))); // NOI18N
        mnNguoiHocTungNam.setText("Người học từng năm");
        mnNguoiHocTungNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnNguoiHocTungNamActionPerformed(evt);
            }
        });
        jMenu3.add(mnNguoiHocTungNam);

        mnBangDiemKhoaHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/Card file.png"))); // NOI18N
        mnBangDiemKhoaHoc.setText("Bảng điểm khóa học");
        mnBangDiemKhoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnBangDiemKhoaHocActionPerformed(evt);
            }
        });
        jMenu3.add(mnBangDiemKhoaHoc);

        mnDiemKhoaHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/Bar chart.png"))); // NOI18N
        mnDiemKhoaHoc.setText("Điểm từng khóa học");
        mnDiemKhoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnDiemKhoaHocActionPerformed(evt);
            }
        });
        jMenu3.add(mnDiemKhoaHoc);

        mnDoanhThu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/Dollar.png"))); // NOI18N
        mnDoanhThu.setText("Doanh thu từng chuyên đề");
        mnDoanhThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnDoanhThuActionPerformed(evt);
            }
        });
        jMenu3.add(mnDoanhThu);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Trợ giúp");

        mnHuongDan.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        mnHuongDan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/Globe.png"))); // NOI18N
        mnHuongDan.setText("Hướng dẫn sử dụng");
        mnHuongDan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnHuongDanActionPerformed(evt);
            }
        });
        jMenu4.add(mnHuongDan);

        mnGioiThieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/Brick house.png"))); // NOI18N
        mnGioiThieu.setText("Giới thiệu sản phẩm");
        mnGioiThieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnGioiThieuActionPerformed(evt);
            }
        });
        jMenu4.add(mnGioiThieu);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 998, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void init(){
        this.setLocationRelativeTo(null);
        this.setIconImage(XImage.getAppIcon());
        new ChaoJDialog(this,true).setVisible(true);
        new DangNhapJDialog(this,true).setVisible(true);
        
        Timer t=new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date now=new Date();
                SimpleDateFormat fmFormat = new SimpleDateFormat("hh:mm:ss a");
                lblTime.setText(fmFormat.format(now));
            }   
        });
        t.start();
    }
    private void mnKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnKetThucActionPerformed
        if(DialogHelper.confirm(this, "Bạn thực sự muốn kết thúc?")){
            System.exit(0);
        }
    }//GEN-LAST:event_mnKetThucActionPerformed

    private void mnNguoiHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnNguoiHocActionPerformed
        openNguoiHoc();
    }//GEN-LAST:event_mnNguoiHocActionPerformed

    private void mnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnDangNhapActionPerformed
       openLogin();
    }//GEN-LAST:event_mnDangNhapActionPerformed

    private void mnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnDangXuatActionPerformed
            ShareHelper.logoff();
            this.openLogin();
    }//GEN-LAST:event_mnDangXuatActionPerformed

    private void mnChuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnChuyenDeActionPerformed
        openChuyenDe();
    }//GEN-LAST:event_mnChuyenDeActionPerformed

    private void mnKhoaHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnKhoaHocActionPerformed
            openKhoaHoc();
    }//GEN-LAST:event_mnKhoaHocActionPerformed

    private void mnNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnNhanVienActionPerformed
        openNhanVien();
    }//GEN-LAST:event_mnNhanVienActionPerformed

    private void mnNguoiHocTungNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnNguoiHocTungNamActionPerformed
       
    }//GEN-LAST:event_mnNguoiHocTungNamActionPerformed

    private void mnBangDiemKhoaHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnBangDiemKhoaHocActionPerformed

    }//GEN-LAST:event_mnBangDiemKhoaHocActionPerformed

    private void mnDiemKhoaHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnDiemKhoaHocActionPerformed
        
    }//GEN-LAST:event_mnDiemKhoaHocActionPerformed

    private void mnDoanhThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnDoanhThuActionPerformed
        
    }//GEN-LAST:event_mnDoanhThuActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(DialogHelper.confirm(this, "Bạn thực sự muốn kết thúc?")){
            System.exit(0);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           ShareHelper.logoff();
            this.openLogin();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void lblDaoTaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDaoTaoMouseClicked
        openAbout();
    }//GEN-LAST:event_lblDaoTaoMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        openKhoaHoc();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        openChuyenDe();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void mnGioiThieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnGioiThieuActionPerformed
        openAbout();
    }//GEN-LAST:event_mnGioiThieuActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       openWebsite();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void mnHuongDanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnHuongDanActionPerformed
       openWebsite();
    }//GEN-LAST:event_mnHuongDanActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblDaoTao;
    private javax.swing.JLabel lblTime;
    private javax.swing.JMenuItem mnBangDiemKhoaHoc;
    private javax.swing.JMenuItem mnChuyenDe;
    private javax.swing.JMenuItem mnDangNhap;
    private javax.swing.JMenuItem mnDangXuat;
    private javax.swing.JMenuItem mnDiemKhoaHoc;
    private javax.swing.JMenuItem mnDoanhThu;
    private javax.swing.JMenuItem mnDoiMatKhau;
    private javax.swing.JMenuItem mnGioiThieu;
    private javax.swing.JMenuItem mnHuongDan;
    private javax.swing.JMenuItem mnKetThuc;
    private javax.swing.JMenuItem mnKhoaHoc;
    private javax.swing.JMenuItem mnNguoiHoc;
    private javax.swing.JMenuItem mnNguoiHocTungNam;
    private javax.swing.JMenuItem mnNhanVien;
    private javax.swing.JPopupMenu.Separator spr;
    // End of variables declaration//GEN-END:variables
}
