/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Controllers.KhachHangController;
import Extentions.Check;
import Models.KhachHang;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KH
 */
public class QLKhachHang extends javax.swing.JFrame {

    /**
     * Creates new form QLNhanVien
     */
    private List<KhachHang> list;
    private DefaultTableModel model;
    private int index;

    public QLKhachHang() {
        initComponents();

        this.setLocationRelativeTo(null);
        model = (DefaultTableModel) tableResult.getModel();
        renderList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGioiTinh = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTenKhachHang = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        radioNam = new javax.swing.JRadioButton();
        radioNu = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        txtNgaySinh = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableResult = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnCheckHoaDon = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý khách hàng");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/rsz_people.png"))); // NOI18N
        jLabel1.setText("QUẢN LÝ KHÁCH HÀNG");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("Tên khách hàng:");

        jLabel3.setText("Ngày sinh:");

        jLabel4.setText("Giới tính");

        jLabel6.setText("Email:");

        jLabel7.setText("Số điện thoại:");

        jLabel8.setText("Địa chỉ:");

        txtTenKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenKhachHangActionPerformed(evt);
            }
        });

        txtDiaChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaChiActionPerformed(evt);
            }
        });

        btnGioiTinh.add(radioNam);
        radioNam.setSelected(true);
        radioNam.setText("Nam");
        radioNam.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        radioNam.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        radioNam.setInheritsPopupMenu(true);

        btnGioiTinh.add(radioNu);
        radioNu.setText("Nữ");
        radioNu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnAdd.setText("Thêm");
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add(evt);
            }
        });

        btnDelete.setText("Xóa");
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete(evt);
            }
        });

        btnEdit.setText("Sửa");
        btnEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit(evt);
            }
        });

        btnRefresh.setText("Refresh");
        btnRefresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refresh(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRefresh)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnEdit)
                    .addComponent(btnRefresh)
                    .addComponent(btnDelete))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        txtNgaySinh.setDateFormatString("dd/MM/y");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtTenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(radioNu, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(60, 60, 60)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioNam)
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtTenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(radioNam)
                    .addComponent(radioNu))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        tableResult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Tên khách hàng", "Ngày sinh", "Giới tính", "Địa chỉ", "Số điện thoại", "Email"
            }
        ));
        tableResult.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableResult.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableResult.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableResultClick(evt);
            }
        });
        jScrollPane1.setViewportView(tableResult);
        if (tableResult.getColumnModel().getColumnCount() > 0) {
            tableResult.getColumnModel().getColumn(0).setResizable(false);
            tableResult.getColumnModel().getColumn(0).setPreferredWidth(25);
            tableResult.getColumnModel().getColumn(3).setPreferredWidth(40);
        }

        btnSearch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Search.png"))); // NOI18N
        btnSearch.setText("Tìm kiếm");
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search(evt);
            }
        });

        txtSearch.setToolTipText("Nhập Họ tên hoặc SĐT cần tìm kiếm!");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Exit.png"))); // NOI18N
        jButton1.setText("THOÁT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnCheckHoaDon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCheckHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Calendar.png"))); // NOI18N
        btnCheckHoaDon.setText("Lịch sử mua hàng");
        btnCheckHoaDon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCheckHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckHoaDonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCheckHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 371, Short.MAX_VALUE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 932, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSearch)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(btnCheckHoaDon))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void renderList() {
        list = new KhachHangController().getList();

        model.setRowCount(0);

        for (KhachHang kh : list) {

            model.addRow(new Object[]{
                tableResult.getRowCount() + 1,
                kh.getTenKhachHang(),
                kh.getNgaySinh(),
                kh.getGioiTinh(),
                kh.getDiaChi(),
                kh.getSDT(),
                kh.getEmail()
            });
        }
    }

    private void reset() {
        txtTenKhachHang.setText("");
        txtNgaySinh.setCalendar(null);
        radioNam.setSelected(true);
        txtDiaChi.setText("");
        txtSDT.setText("");
        txtEmail.setText("");
        txtSearch.setText("");
        renderList();
    }

    private void add(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add
        // TODO add your handling code here:
        var check = new Check();
        if (check.isNullOrEmpty(txtTenKhachHang.getText()) || check.isNullOrEmpty(txtDiaChi.getText()) || check.isNullOrEmpty(txtSDT.getText())) {
            JOptionPane.showMessageDialog(this, "Cần nhập đầy đủ các thông tin cần thiết!", "Lỗi", JOptionPane.WARNING_MESSAGE);
        } else {
            KhachHang kh = new KhachHang();
            String gender = radioNam.isSelected() ? "Nam" : "Nữ";
            String date = null;
            if (txtNgaySinh.getDate() != null) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
                date = simpleDateFormat.format(txtNgaySinh.getDate());
            }
            kh.setTenKhachHang(txtTenKhachHang.getText());
            kh.setNgaySinh(date);
            kh.setGioiTinh(gender);
            kh.setDiaChi(txtDiaChi.getText());
            kh.setEmail(txtEmail.getText());
            if (check.isDigit(txtSDT.getText())) {
                kh.setSDT(txtSDT.getText());
                new KhachHangController().add(kh);
                JOptionPane.showMessageDialog(this, "Thêm mới thành công!", "Thành công", JOptionPane.INFORMATION_MESSAGE);
                reset();
            } else {
                JOptionPane.showMessageDialog(this, "SĐT phải là số!", "Lỗi", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_add

    private void refresh(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresh
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_refresh

    private void delete(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete
        // TODO add your handling code here:
        index = tableResult.getSelectedRow();
        if (list.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Danh sách khách hàng rỗng!", "Lỗi", JOptionPane.INFORMATION_MESSAGE);
        } else if (index == -1) {
            JOptionPane.showMessageDialog(this, "Hãy chọn khách hàng mà bạn cần xóa!", "Lỗi", JOptionPane.INFORMATION_MESSAGE);
        } else {
            KhachHang kh = list.get(index);
            JOptionPane.showMessageDialog(this, "Xóa thành công!", "Thành công", JOptionPane.INFORMATION_MESSAGE);
            new KhachHangController().delete(kh.getID());
            reset();
        }
    }//GEN-LAST:event_delete

    private void edit(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit
        // TODO add your handling code here:
        index = tableResult.getSelectedRow();
        if (list.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Danh sách khách hàng rỗng!", "Lỗi", JOptionPane.INFORMATION_MESSAGE);
        } else if (index == -1) {
            JOptionPane.showMessageDialog(this, "Hãy chọn khách hàng mà bạn cần chỉnh sửa!", "Lỗi", JOptionPane.INFORMATION_MESSAGE);
        } else {
            var check = new Check();
            if (check.isNullOrEmpty(txtTenKhachHang.getText()) || check.isNullOrEmpty(txtDiaChi.getText()) || check.isNullOrEmpty(txtSDT.getText())) {
                JOptionPane.showMessageDialog(this, "Cần nhập đầy đủ các thông tin cần thiết!", "Lỗi", JOptionPane.WARNING_MESSAGE);
            }
            KhachHang kh = list.get(index);

            String gender = radioNam.isSelected() ? "Nam" : "Nữ";
            String date = null;
            if (txtNgaySinh.getDate() != null) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
                date = simpleDateFormat.format(txtNgaySinh.getDate());
            }

            kh.setTenKhachHang(txtTenKhachHang.getText());
            kh.setNgaySinh(date);
            kh.setGioiTinh(gender);
            kh.setDiaChi(txtDiaChi.getText());
            kh.setEmail(txtEmail.getText());
            if (check.isDigit(txtSDT.getText())) {
                kh.setSDT(txtSDT.getText());
                new KhachHangController().update(kh);
                JOptionPane.showMessageDialog(this, "Sửa thành công!", "Thành công", JOptionPane.INFORMATION_MESSAGE);
                reset();
            } else {
                JOptionPane.showMessageDialog(this, "SĐT phải là số!", "Lỗi", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_edit

    private void tableResultClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableResultClick
        // TODO add your handling code here:
        index = tableResult.getSelectedRow();
        KhachHang kh = list.get(index);
        String gender = kh.getGioiTinh();

        txtTenKhachHang.setText(kh.getTenKhachHang());
//        String date = null;
//            if (txtNgaySinh.getDate() != null) {
//                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
//                date = simpleDateFormat.format(txtNgaySinh.getDate());
//            }
//            txtNgaySinh.setDate(date);
        Date date;
        if (!(new Check().isNullOrEmpty(kh.getNgaySinh()))) {
            try {
                date = new SimpleDateFormat("dd/MM/yyyy").parse(kh.getNgaySinh());
                txtNgaySinh.setDate(date);
            } catch (ParseException ex) {
                Logger.getLogger(QLKhachHang.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        txtDiaChi.setText(kh.getDiaChi());
        txtSDT.setText(kh.getSDT());
        txtEmail.setText(kh.getEmail());

        if (gender.equals("Nam")) {
            radioNam.setSelected(true);
        } else {
            radioNu.setSelected(true);
        }
    }//GEN-LAST:event_tableResultClick

    private void search(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search
        // TODO add your handling code here:
        String kyTu = txtSearch.getText();

        if (!(kyTu.isBlank())) {
            list = new KhachHangController().findByChar(kyTu);
            model.setRowCount(0);
            for (KhachHang kh : list) {
                model.addRow(new Object[]{
                    tableResult.getRowCount() + 1,
                    kh.getTenKhachHang(),
                    kh.getNgaySinh(),
                    kh.getGioiTinh(),
                    kh.getDiaChi(),
                    kh.getSDT(),
                    kh.getEmail()
                });
            }
        } else {
            JOptionPane.showMessageDialog(this, "Hãy nhập thông tin cần tìm kiếm!", "Lỗi", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_search

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Home home = new Home();
        home.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnCheckHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckHoaDonActionPerformed
        // TODO add your handling code here:
        index = tableResult.getSelectedRow();
        if (list.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Danh sách khách hàng rỗng!", "Lỗi", JOptionPane.INFORMATION_MESSAGE);
        } else if (index == -1) {
            JOptionPane.showMessageDialog(this, "Hãy chọn khách hàng mà bạn muốn xem lịch sử!", "Lỗi", JOptionPane.INFORMATION_MESSAGE);
        } else {
            KhachHang kh = new KhachHang();
            kh = list.get(index);
            LichSuGiaoDich lsgd = new LichSuGiaoDich(kh);
            this.dispose();
            lsgd.setVisible(true);
        }
    }//GEN-LAST:event_btnCheckHoaDonActionPerformed

    private void txtTenKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenKhachHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenKhachHangActionPerformed

    private void txtDiaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaChiActionPerformed

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
            java.util.logging.Logger.getLogger(QLKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLKhachHang().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCheckHoaDon;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.ButtonGroup btnGioiTinh;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioNam;
    private javax.swing.JRadioButton radioNu;
    private javax.swing.JTable tableResult;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private com.toedter.calendar.JDateChooser txtNgaySinh;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTenKhachHang;
    // End of variables declaration//GEN-END:variables

}
