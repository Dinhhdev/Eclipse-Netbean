
package GUI;

import DLL.ThiSinhDLL;
import DLL.TinhThanhDLL;
import Entity.ThiSinh;
import Entity.TinhThanh;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.awt.Color;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;





@SuppressWarnings("unused")
public class Main2 extends javax.swing.JFrame {

    
    
   
	
	
	private static final long serialVersionUID = 1L;
	ThiSinhDLL empDLL = new ThiSinhDLL() ;  
    ArrayList<ThiSinh> listEMP = new ArrayList<>() ;
     ArrayList<ThiSinh> listEMP2 = new ArrayList<>() ;
    
    
    TinhThanhDLL depDLL = new TinhThanhDLL() ;
    ArrayList<TinhThanh> listDep = new ArrayList<>() ;
    
   
    
    public Main2() {
    	getContentPane().setBackground(Color.LIGHT_GRAY);
        
        initComponents();
        String laf = "" ;
        laf = "com.sum.java.swing.plaf.windowsLookAndFeel" ;
        try {
            UIManager.setLookAndFeel(laf);
            SwingUtilities.updateComponentTreeUI(this);
            
        } catch (Exception e) {
        }
        this.setLocation(450, 50);
       
        Biding() ;
        BidingDep() ;
      
    }
    
    
     public void BidingDep() {
        listDep = depDLL.getAll();
        for (TinhThanh d : listDep) {
            cbxDep.addItem(d.getTenTinh());
        }
    }
    
   
	@SuppressWarnings("unchecked")
	public void Biding()
    {
        listEMP = empDLL.getAll() ;
        @SuppressWarnings("rawtypes")
		Vector clums = new Vector() ;
        clums.add("MSSV") ;
        clums.add("Tên") ;
        clums.add("Mã Môn") ;
        clums.add("Ngày Sinh") ;
        clums.add("Giới Tính") ;
        clums.add("DiemQuaTrinh") ;
        clums.add("DiemThucHanh") ;
        clums.add("DiemThi") ;
        clums.add("Tên Môn") ;
        
        @SuppressWarnings("rawtypes")
		Vector data = new Vector() ;
        
        for( ThiSinh emp : listEMP)
        {
            @SuppressWarnings("rawtypes")
			Vector row = new Vector() ;
            row.add(emp.getMaTS()) ;
            row.add(emp.getName()) ;
            row.add(emp.getMaTinh()) ;
            row.add(emp.getNgaySinh()) ;
            row.add(emp.getGioiTinh()) ;
            row.add(emp.getDiemToan()) ;
            row.add(emp.getDiemHoa()) ;
            row.add(emp.getDiemLi()) ;
            
            listDep  = depDLL.getByID(emp.getMaTinh()) ;
            if( listDep.size() > 0)
            {
                row.add(listDep.get(0).getTenTinh()) ;
            }
            else
            {
                row.add(" Empty ") ;
            
            }
            
            
            data.add(row) ;
        
        }
        
    
       DefaultTableModel dtm = new DefaultTableModel(data,clums) ;
       tblThiSinh.setModel(dtm) ;
        
    
    
    }

    
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setBackground(Color.YELLOW);
        jScrollPane1 = new javax.swing.JScrollPane();
        tblThiSinh = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setForeground(Color.RED);
        jLabel2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel6.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
        jLabel7 = new javax.swing.JLabel();
        jLabel7.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        cbxDep = new javax.swing.JComboBox<>();
        cbxDep.setBackground(Color.CYAN);
        jLabel9 = new javax.swing.JLabel();
        jLabel9.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
        jTextField7 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel10.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
        jLabel11 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel12.setBackground(Color.ORANGE);
        jPanel1 = new javax.swing.JPanel();
        jPanel1.setBackground(Color.GRAY);
        jLabel13 = new javax.swing.JLabel();
        jLabel13.setBackground(Color.ORANGE);
        jLabel13.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
        JTxtAddress = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel14.setForeground(Color.RED);
        jLabel14.setBackground(Color.ORANGE);
        jLabel14.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
        jTextField9 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel17.setBackground(Color.ORANGE);
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem2.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
        jMenuItem2.setBackground(Color.ORANGE);
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem5.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
        jMenuItem5.setBackground(Color.ORANGE);
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem4.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
        jMenuItem4.setBackground(Color.ORANGE);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(Color.RED);
        jLabel1.setText("CHƯƠNG TRÌNH QUẢN LÍ ĐIỂM SINH VIÊN  ");

        tblThiSinh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblThiSinh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblThiSinhMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblThiSinh);

        jLabel2.setText("MSSV  :  \r\n");

        jLabel3.setText("Họ và Tên : ");

        jLabel4.setText("Ngày Sinh  : ");

        jLabel5.setText("Giới Tính   ");

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jLabel6.setText("Điếm Quá Trình (Hệ 10) : ");

        jLabel7.setText("Điểm Thi (Hệ 10) : ");

        jLabel9.setText("Điểm Thực Hành (Hệ 10) :  ");

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jButton1.setBackground(Color.ORANGE);
        jButton1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12)); // NOI18N
        jButton1.setForeground(Color.BLACK);
        jButton1.setText("Thêm Sinh Viên  ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(Color.ORANGE);
        jButton2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12)); // NOI18N
        jButton2.setForeground(Color.BLACK);
        jButton2.setText("Xóa Sinh Viên  \r\n");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(Color.ORANGE);
        jButton3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12)); // NOI18N
        jButton3.setForeground(Color.BLACK);
        jButton3.setText("Cập Nhật Sinh Viên ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel10.setText("Tên Khoa : ");

        jLabel11.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13)); // NOI18N
        jLabel11.setText("Tổng Điểm  : ");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Nữ  ! ");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Nam  ! ");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new Font("Tahoma", Font.BOLD, 14));
        jLabel12.setForeground(Color.RED);
        jLabel12.setText("THÔNG TIN SINH VIÊN CỤ THỂ   : ");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel13.setText("Tên Môn   : ");

        jLabel14.setText("MSSV  : ");

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 153, 255));
        jButton4.setFont(new Font("Tahoma", Font.BOLD, 14)); 
        jButton4.setForeground(Color.RED);
        jButton4.setText("Tìm  ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabel13, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(JTxtAddress, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
        			.addComponent(jLabel14, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jTextField9, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
        			.addGap(47)
        			.addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
        			.addGap(22))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap(13, Short.MAX_VALUE)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(JTxtAddress, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel14)
        				.addComponent(jTextField9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jButton4)
        				.addComponent(jLabel13))
        			.addContainerGap())
        );
        jPanel1.setLayout(jPanel1Layout);

        jButton5.setBackground(Color.ORANGE);
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); 
        jButton5.setForeground(Color.BLACK);
        jButton5.setText("Làm Mới  ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon("D:\\it.png")); 
        jLabel16.setIcon(new javax.swing.ImageIcon("D:\\filter.png")); 

        jLabel17.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
        jLabel17.setForeground(Color.RED);
        jLabel17.setText("DANH SÁCH SINH VIÊN  : ");

        jMenu1.setText("File");

        jMenuItem2.setText("Mở File");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem5.setText("Xuất File");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem4.setText("Thoát  !!!");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 946, Short.MAX_VALUE)
        				.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 946, Short.MAX_VALUE)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(jLabel16)
        							.addPreferredGap(ComponentPlacement.RELATED, 861, Short.MAX_VALUE))
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 460, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)))
        					.addComponent(jLabel15, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(29)
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jLabel4)
        								.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        									.addComponent(jLabel2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        									.addComponent(jLabel3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        								.addComponent(jTextField1)
        								.addComponent(jTextField2, GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
        								.addComponent(jTextField3))
        							.addGap(75)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        								.addComponent(jLabel5)
        								.addComponent(jLabel6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        								.addComponent(jLabel7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
        							.addGap(84)
        							.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)))
        					.addGap(14)
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        								.addGroup(layout.createSequentialGroup()
        									.addComponent(jRadioButton1)
        									.addGap(18)
        									.addComponent(jRadioButton2)
        									.addGap(18))
        								.addGroup(layout.createSequentialGroup()
        									.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        										.addComponent(jTextField5)
        										.addComponent(jTextField6, GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
        									.addPreferredGap(ComponentPlacement.RELATED)
        									.addComponent(jLabel8)
        									.addGap(19)))
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jLabel10)
        								.addComponent(jLabel11)
        								.addComponent(jLabel9)))
        						.addComponent(jButton3))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(layout.createSequentialGroup()
        							.addGap(36)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        								.addComponent(cbxDep, 0, 85, Short.MAX_VALUE)
        								.addComponent(jTextField7)
        								.addComponent(jTextField8))
        							.addPreferredGap(ComponentPlacement.RELATED, 68, Short.MAX_VALUE))
        						.addGroup(layout.createSequentialGroup()
        							.addPreferredGap(ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
        							.addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
        							.addGap(12))))
        				.addComponent(jLabel17, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel12, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 239, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel16, Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(jLabel1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        						.addComponent(jLabel15, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
        					.addGap(29)))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(jLabel17)
        			.addGap(18)
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(jLabel12, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel2)
        						.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel5)
        						.addComponent(cbxDep, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jRadioButton1)
        						.addComponent(jLabel10)
        						.addComponent(jRadioButton2))
        					.addGap(37)
        					.addComponent(jLabel3))
        				.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        					.addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addComponent(jLabel6)
        					.addComponent(jLabel9)
        					.addComponent(jTextField7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        			.addGap(28)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jLabel4)
        				.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        					.addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addComponent(jLabel7)
        					.addComponent(jLabel8)
        					.addComponent(jTextField6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addComponent(jLabel11)
        					.addComponent(jTextField8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        			.addPreferredGap(ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);

        pack();
    }                      

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {                                            
       
    }                                           

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       
        this.listDep = this.depDLL.getAll();
        int MaTS = Integer.parseInt(this.jTextField1.getText());
        String Name = this.jTextField2.getText();
        String NgaySinh = this.jTextField3.getText();
     
        int GioiTinh ;
        if(jRadioButton1.isSelected())
        {
            GioiTinh = 1 ;
        }
        else
        {
            GioiTinh = 0 ;
        
        }
        float DiemToan = Float.parseFloat(this.jTextField5.getText());
        float DiemHoa = Float.parseFloat(this.jTextField6.getText());
        float DiemLi = Float.parseFloat(this.jTextField7.getText());
        int rowDep = this.cbxDep.getSelectedIndex();
        int MaTinh = this.listDep.get(rowDep).getMaTinh();
        ThiSinh emp = new ThiSinh();
        emp.setMaTS(MaTS);
        emp.setName(Name);
        emp.setMaTinh(MaTinh);
        emp.setNgaySinh(NgaySinh);
        emp.setGioiTinh(GioiTinh);
        emp.setDiemToan(DiemToan);
        emp.setDiemHoa(DiemHoa);
        emp.setDiemLi(DiemLi);
        if (this.empDLL.AddData(emp)) {
            JOptionPane.showMessageDialog(this, " Thêm Thành Công Sinh Viên! ");
            this.Biding();
        } else {
            JOptionPane.showMessageDialog(this, "Thêm Sinh Viên Thất Bại ! ");
        }
    }                                        

    private void tblThiSinhMouseClicked(java.awt.event.MouseEvent evt) {                                        
     
        if (this.tblThiSinh.getSelectedRow() != -1) {
            int row = this.tblThiSinh.getSelectedRow();
            this.listEMP = this.empDLL.getAll();
            this.jTextField1.setText(String.valueOf(this.listEMP.get(row).getMaTS()));
            this.jTextField2.setText(this.listEMP.get(row).getName());
            this.jTextField3.setText(this.listEMP.get(row).getNgaySinh());
            
            if(listEMP.get(row).getGioiTinh() == 1 )
            {
                jRadioButton1.setSelected(true);
           
            }
            else
            {
                jRadioButton2.setSelected(true);
            }
            this.jTextField5.setText(String.valueOf(this.listEMP.get(row).getDiemToan()));
            this.jTextField6.setText(String.valueOf(this.listEMP.get(row).getDiemHoa()));
            this.jTextField7.setText(String.valueOf(this.listEMP.get(row).getDiemLi()));
            this.jTextField8.setText(String.valueOf(listEMP.get(row).getDiemToan() + listEMP.get(row).getDiemHoa()+ listEMP.get(row).getDiemLi()));
            
            this.listDep = this.depDLL.getByID(this.listEMP.get(row).getMaTinh());
            if (this.listDep.size() > 0) {
                this.cbxDep.setSelectedItem(this.listDep.get(0).getTenTinh());
            } else {
                this.cbxDep.setSelectedIndex(0);
            }
        }
    }                                       

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
     
        
         if (this.tblThiSinh.getSelectedRow()!= -1) {
            int row = this.tblThiSinh.getSelectedRow();
            this.listEMP = this.empDLL.getAll();
            if (this.empDLL.DeleteData(this.listEMP.get(row).getMaTS())) {
                JOptionPane.showMessageDialog(this, " Xóa Sinh Viên Thành Công ! ");
                this.Biding();
            } else {
                JOptionPane.showMessageDialog(this, "Xóa Sinh Viên Thất Bại ! ");
            }
        }
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       
        this.listDep = this.depDLL.getAll();
        this.listEMP = this.empDLL.getAll();
        int MaTS = Integer.parseInt(this.jTextField1.getText());
        String Name = this.jTextField2.getText();
        String NgaySinh = this.jTextField3.getText();
    
        int GioiTinh ;
        if(jRadioButton1.isSelected())
        {
            GioiTinh = 1 ;
        
        }
        else
        {
            GioiTinh = 0 ;
        }
        float DiemToan = Float.parseFloat(this.jTextField5.getText());
        float DiemHoa = Float.parseFloat(this.jTextField6.getText());
        float DiemLi = Float.parseFloat(this.jTextField7.getText());
        int rowDep = this.cbxDep.getSelectedIndex();
        int row = this.tblThiSinh.getSelectedRow();
        int MaTinh = this.listDep.get(rowDep).getMaTinh();
        ThiSinh emp = new ThiSinh();
        emp.setMaTS(this.listEMP.get(row).getMaTS());
        emp.setName(Name);
        emp.setMaTinh(MaTinh);
        emp.setNgaySinh(NgaySinh);
        emp.setGioiTinh(GioiTinh);
        emp.setDiemToan(DiemToan);
        emp.setDiemHoa(DiemHoa);
        emp.setDiemLi(DiemLi);
        if (this.empDLL.UpdateData(emp)) {
            JOptionPane.showMessageDialog(this, " Cập Nhật Sinh Viên Thành Công ! ");
            this.Biding();
        } else {
            JOptionPane.showMessageDialog(this, "Cập Nhật Sinh Viên Thất Bại ! ");
        }
    }                                        

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {                                            
         
    }                                           

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        
    }                                             

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                              
      
    }                                             

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {                                            
      
    }                                           

    @SuppressWarnings({ "unchecked", "rawtypes" })
	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        String ad = JTxtAddress.getText() ;
        listDep = depDLL.getByName(ad) ;
       
        int MT = listDep.get(0).getMaTinh() ;
        
        int ID = Integer.parseInt(jTextField9.getText() ) ;
        
        listEMP = empDLL.getAll() ;
        Vector clums = new Vector() ;
        clums.add("MaTS") ;
        clums.add("Name") ;
        clums.add("MaTinh") ;
        clums.add("NgaySinh") ;
        clums.add("GioiTinh") ;
        clums.add("DiemToan") ;
        clums.add("DiemHoa") ;
        clums.add("DiemLi") ;
        clums.add("TenTinh") ;
        
        Vector data = new Vector() ;
        
        for( ThiSinh emp : listEMP)
        {
            Vector row = new Vector() ;

                if( emp.getMaTinh() == MT || emp.getMaTS() == ID )
                {
                    row.add(emp.getMaTS()) ;
                    row.add(emp.getName()) ;
                    row.add(emp.getMaTinh()) ;
                    row.add(emp.getNgaySinh()) ;
                    row.add(emp.getGioiTinh()) ;
                    row.add(emp.getDiemToan()) ;
                    row.add(emp.getDiemHoa()) ;
                    row.add(emp.getDiemLi()) ;        
                    listDep  = depDLL.getByID(emp.getMaTinh()) ;
                    if( listDep.size() > 0)
                    {

                        row.add(listDep.get(0).getTenTinh()) ;
                    }
                    else
                    {

                         row.add(" Empty ") ;


                    }
                       
                 data.add(row) ;
                 
                }
                         
                
        }
         
       DefaultTableModel dtm = new DefaultTableModel(data,clums) ;
       tblThiSinh.setModel(dtm) ;
              
     
    }                                        

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        this.jTextField1.setText("");
        this.jTextField2.setText("");
        this.jTextField3.setText("");
        buttonGroup1.clearSelection();
        this.jTextField5.setText("");
        this.jTextField6.setText("");
        this.jTextField7.setText("");
        this.jTextField8.setText("");
    }                                        

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        
        System.exit(0);
    }                                          

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {                                           
       
        
        File file= null;

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Specify a file to save");

        int userSelection = fileChooser.showSaveDialog(null);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
             file = fileChooser.getSelectedFile();

        }

        try {
           
            if( ! file.exists())
            {
                file.createNewFile() ;
            }
            FileWriter fw = new FileWriter(file.getAbsoluteFile()) ;
            BufferedWriter bw = new BufferedWriter(fw) ;
            bw.write("\n\n ===========       DANH SACH Sinh Viên Đã Xuất Ra File      =========== \n\n ");
            bw.write("\n MSSV ||  Họ và Tên  || Mã Khoa || Giới Tính ||  Ngày Sinh || Điểm Quá Trính | Điểmm Thực Hành | Điểm Thi || Tên Khoa \n\n ");
            for(int i = 0 ; i < tblThiSinh.getRowCount() ; i++)
            {
                for( int j = 0 ; j < tblThiSinh.getColumnCount() ; j++)
                {
                    bw.write(tblThiSinh.getModel().getValueAt(i, j) + "  " );
                
                }
                bw.write("\n\n ------------------------------------^^------------------------- \n\n ");
             
            }
            bw.close() ;
            fw.close(); 
            JOptionPane.showMessageDialog(null, "File  Đã Được In và Xuất ! ");
        } catch (Exception e) {
            e.printStackTrace(); 
            
        }
    }                                          

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        JFileChooser fileChooser=new JFileChooser();  
  
  
        int a=fileChooser.showOpenDialog(null);  
        if(a==JFileChooser.APPROVE_OPTION)  
        {  
  
        File fileToOpen=fileChooser.getSelectedFile();  

        try  
        {  

         Desktop.getDesktop().open(fileToOpen);  
        }  
        catch(Exception exception)  
        {  
         System.out.println("Đang mở File ");  
        }  
    }  
    }                                          
  
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main2().setVisible(true);
            }
        });
    }

                     
    private javax.swing.JTextField JTxtAddress;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbxDep;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTable tblThiSinh;
                    
}
