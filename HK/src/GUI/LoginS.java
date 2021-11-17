
package GUI;

import DLL.ThiSinhDLL;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JCheckBox;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.ImageIcon;


@SuppressWarnings("unused")
public class LoginS extends javax.swing.JFrame {

    
  
	
	
	private static final long serialVersionUID = 1;
	ThiSinhDLL dll = new ThiSinhDLL() ;
    public LoginS() {
    	getContentPane().setBackground(Color.LIGHT_GRAY);
        initComponents();
        this.setTitle(" CHƯƠNG TRÌNH QUẢN LÍ ĐIỂM SINH VIÊN HUTECH  - NHÓM 12");
    }

              
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel1.setBackground(Color.LIGHT_GRAY);
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setBackground(Color.DARK_GRAY);
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setBackground(Color.DARK_GRAY);
        jLabel4.setForeground(Color.BLACK);
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new Color(0, 0, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\2.jpg")); 
        
        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\g12.icon")); 

        jLabel3.setFont(new Font("Tahoma", Font.BOLD, 14)); 
       
        jLabel3.setText("NHẬP HỌ TÊN  :   ");

        jLabel4.setFont(new Font("Tahoma", Font.BOLD, 14));
        jLabel4.setText(" NHẬP MẬT KHẨU  :  ");

        jButton1.setBackground(Color.RED);
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); 
        jButton1.setForeground(Color.BLACK);
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        

        jCheckBox1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
        jCheckBox1.setText("Mật Khẩu Tự Động  ?  \r\n \r\n");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
       

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 11)); 
        jLabel8.setForeground(new java.awt.Color(255, 0, 102));
        jLabel8.setIcon(new javax.swing.ImageIcon("D:\\fi.icon"));

        jLabel7.setIcon(new javax.swing.ImageIcon("D:\\ss.png"));
        
        JLabel lblNewLabel = new JLabel("CHƯƠNG TRÌNH QUẢN LÍ ĐIỂM SINH VIÊN   ");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
        lblNewLabel.setForeground(new Color(0, 0, 153));
        lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
        lblNewLabel.setBackground(UIManager.getColor("Button.foreground"));
        
        JLabel lblNewLabel_1 = new JLabel("SINH VIÊN HUTECH-NHÓM 12    ");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
        lblNewLabel_1.setForeground(Color.BLUE);
        
        label = new JLabel();
        label.setIcon(new ImageIcon("D:\\3.jpg"));
        label.setBackground(Color.LIGHT_GRAY);
        
        JLabel lblEditByVinh = new JLabel("EDIT BY VINH SÌ LÊ  ^_^ ");
        lblEditByVinh.setForeground(Color.BLUE);
        lblEditByVinh.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
        
        label_1 = new JLabel();
        label_1.setBackground(Color.LIGHT_GRAY);
        
        label_2 = new JLabel();
        label_2.setIcon(new ImageIcon("D:\\ke-sach-hinh-cay-9-tang-3-510x510.jpg"));
        label_2.setBackground(Color.LIGHT_GRAY);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(jLabel2))
        				.addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(30)
        					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 272, GroupLayout.PREFERRED_SIZE))
        				.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 261, GroupLayout.PREFERRED_SIZE))
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 572, GroupLayout.PREFERRED_SIZE)
        								.addComponent(label)
        								.addGroup(layout.createSequentialGroup()
        									.addGroup(layout.createParallelGroup(Alignment.LEADING)
        										.addGroup(layout.createSequentialGroup()
        											.addComponent(jLabel4, GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
        											.addGap(36))
        										.addGroup(layout.createSequentialGroup()
        											.addGap(21)
        											.addComponent(jLabel3)
        											.addPreferredGap(ComponentPlacement.RELATED)))
        									.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        										.addComponent(jTextField1, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
        										.addComponent(jPasswordField1))))
        							.addGap(154)
        							.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 329, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 261, GroupLayout.PREFERRED_SIZE)
        							.addGap(110))
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
        							.addGap(297)
        							.addComponent(lblEditByVinh, GroupLayout.PREFERRED_SIZE, 272, GroupLayout.PREFERRED_SIZE)
        							.addGap(330)))
        					.addComponent(jLabel5))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(245)
        					.addComponent(jCheckBox1, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
        					.addContainerGap())))
        		.addGroup(layout.createSequentialGroup()
        			.addGap(20)
        			.addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(1574, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
        			.addGap(5)
        			.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jLabel8)
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        					.addGap(18)
        					.addComponent(jLabel7)
        					.addContainerGap())
        				.addGroup(layout.createParallelGroup(Alignment.LEADING)
        					.addComponent(lblEditByVinh, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
        					.addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE))))
        		.addGroup(layout.createSequentialGroup()
        			.addGap(48)
        			.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 396, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(label)
        					.addGap(18)
        					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)))
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(15)
        					.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)))
        			.addGap(36)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel4)
        				.addComponent(jPasswordField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(38)
        			.addComponent(jCheckBox1)
        			.addGap(32)
        			.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
        			.addGap(44))
        );
        getContentPane().setLayout(layout);

        pack();
    }                     

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       
        String name = jTextField1.getText() ;
        String m = new String(jPasswordField1.getPassword()) ;
        int mts =  Integer.parseInt(new String(jPasswordField1.getPassword()) ) ;
        boolean check = true ;
        if( check & name .isEmpty())
        {
            check = false ;
        }
        if( check & m .isEmpty())
        {
            check = false ;
        }
        if( check)
        {
            if(dll.getLogin(mts, name))
            {
                this.setVisible(false);
                JOptionPane.showMessageDialog(rootPane, " ĐĂNG NHẬP THÀNH CÔNG RỒI !");
                Main2 main = new Main2() ;
                main.setVisible(true);
                    
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "VUI LÒNG KIỂM TRA LẠI TÀI KHOẢN HOẶC MẬT KHẨU !");
            }
            
 
        }
        
        
    }                                        

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
    	 jTextField1.setText("vinh") ;
         jPasswordField1.setText("1711061001");
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
            java.util.logging.Logger.getLogger(LoginS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginS().setVisible(true);
            }
        });
    }

                    
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private JLabel label;
    private JLabel label_1;
    private JLabel label_2;
}
