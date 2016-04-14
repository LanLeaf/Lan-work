package fuli_6;
import java.awt.Color;
import java.sql.Statement;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;

//VS4E -- DO NOT REMOVE THIS LINE!
public class fuli_6 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JLabel jLabel0;
    private JLabel jLabel1;
    private JPanel jPanel1;
    private JPanel jPanel0;
    private JLabel jLabel2;
    private JButton jButton4;
    private JLabel jLabel3;
    JTextField jTextField0;
    JTextField jTextField1;
    JTextField jTextField2;
    JTextField jTextField3;
    protected JComboBox jComboBox0;
    protected JComboBox jComboBox1;
    private JButton jButton1;
    private JLabel jLabel4;
    private JLabel jLabel6;
	protected JLabel jLabel5;
	protected JLabel jLabel7;
	protected JLabel jLabel8;
	JLabel jLabel9;
	private JButton jButton0;
	private JComboBox jComboBox2;
	private JLabel jLabel10;
	private JLabel jLabel11;
	private JLabel jLabel12;
	private JTextField jTextField5;
	private JTextField jTextField6;
	private JTextField jTextField7;
	private JButton jButton2;
	public fuli_6() {
        initComponents();
    }

	private boolean dot = false;//true:已经有小数点  0:还没有小数点
	
    private void initComponents() {
		setLayout(new GroupLayout());
		add(getJScrollPane1(), new Constraints(new Leading(414, 426, 10, 10), new Leading(357, 255, 10, 10)));
		add(getJLabel11(), new Constraints(new Leading(421, 10, 10), new Leading(175, 10, 10)));
		add(getJLabel12(), new Constraints(new Leading(421, 10, 10), new Leading(221, 10, 10)));
		add(getJTextField7(), new Constraints(new Leading(493, 160, 10, 10), new Leading(223, 12, 12)));
		add(getJTextField6(), new Constraints(new Leading(493, 160, 10, 10), new Leading(177, 12, 12)));
		add(getJButton2(), new Constraints(new Leading(569, 12, 12), new Leading(280, 10, 10)));
		add(getJComboBox2(), new Constraints(new Leading(422, 10, 10), new Leading(72, 10, 10)));
		add(getJLabel10(), new Constraints(new Leading(422, 10, 10), new Leading(134, 10, 10)));
		add(getJLabel14(), new Constraints(new Leading(464, 10, 10), new Leading(19, 12, 12)));
		add(getJTextField5(), new Constraints(new Leading(493, 158, 10, 10), new Leading(132, 10, 10)));
		add(getJLabel13(), new Constraints(new Leading(414, 12, 12), new Leading(326, 12, 12)));
		add(getJButton0(), new Constraints(new Leading(422, 12, 12), new Leading(280, 12, 12)));
		add(getJLabel15(), new Constraints(new Leading(493, 158, 12, 12), new Leading(156, 10, 10)));
		add(getJLabel16(), new Constraints(new Leading(495, 158, 12, 12), new Leading(202, 10, 10)));
		add(getJLabel17(), new Constraints(new Leading(493, 158, 12, 12), new Leading(250, 12, 12)));
		add(getJPanel0(), new Constraints(new Leading(19, 304, 12, 12), new Leading(130, 381, 10, 10)));
		add(getJComboBox1(), new Constraints(new Leading(28, 10, 10), new Leading(69, 12, 12)));
		add(getJLabel18(), new Constraints(new Leading(68, 10, 10), new Leading(19, 12, 12)));
		setSize(850, 622);
	}

	private JLabel getJLabel18() {
		if (jLabel18 == null) {
			jLabel18 = new JLabel();
			jLabel18.setFont(new   java.awt.Font("Dialog",   0,   24));   
			jLabel18.setForeground(Color.red);
			jLabel18.setText("复利、单利计算");
		}
		return jLabel18;
	}

	private JLabel getJLabel17() {
		if (jLabel17 == null) {
			jLabel17 = new JLabel();
			jLabel17.setText(null);
			jLabel17.setFont(new   java.awt.Font("Dialog",   0,   11));   
			jLabel17.setForeground(Color.red);
		}
		return jLabel17;
	}

	private JLabel getJLabel16() {
		if (jLabel16 == null) {
			jLabel16 = new JLabel();
			jLabel16.setText(null);
			jLabel16.setFont(new   java.awt.Font("Dialog",   0,   11));   
			jLabel16.setForeground(Color.red);
		}
		return jLabel16;
	}

	private JLabel getJLabel15() {
		if (jLabel15 == null) {
			jLabel15 = new JLabel();
			jLabel15.setText(null);
			jLabel15.setFont(new   java.awt.Font("Dialog",   0,   11));   
			jLabel15.setForeground(Color.red);
		}
		return jLabel15;
	}

	private JLabel getJLabel14() {
		if (jLabel14 == null) {
			jLabel14 = new JLabel();
			jLabel14.setText(null);
			jLabel14.setFont(new   java.awt.Font("Dialog",   0,   24));   
			jLabel14.setForeground(Color.red);
			jLabel14.setText("项目投资分项");
		}
		return jLabel14;
	}

	private JLabel getJLabel13() {
		if (jLabel13 == null) {
			jLabel13 = new JLabel();
			jLabel13.setText("投资项目及盈利状况");
		}
		return jLabel13;
	}

	private JScrollPane getJScrollPane1() {
		if (jScrollPane1 == null) {
			jScrollPane1 = new JScrollPane();
			jScrollPane1.setViewportView(getJTextArea0());
		}
		return jScrollPane1;
	}

	private JTextArea getJTextArea0() {
		if (jTextArea0 == null) {
			jTextArea0 = new JTextArea();
		}
		return jTextArea0;
	}

	private JButton getJButton2() {
		if (jButton2 == null) {
			jButton2 = new JButton();
			jButton2.setText("查看已投资项目");
			jButton2.addMouseListener(new MouseAdapter() {
	
				public void mouseClicked(MouseEvent event) {
					jButton2MouseMouseClicked(event);
				}
			});
		}
		return jButton2;
	}

	private JTextField getJTextField7() {
		if (jTextField7 == null) {
			jTextField7 = new JTextField();
			jTextField7.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
			jLabel17.setText(null);
			int keyChar = e.getKeyChar();
			if (keyChar >= KeyEvent.VK_0 && keyChar <= KeyEvent.VK_9||(keyChar == '.')) {
			}
			else {
					e.consume(); // 关键，屏蔽掉非法输入
					jLabel17.setText("请输入>0的数字");
				}
			}
		});	
	}
		return jTextField7;
	}

	private JTextField getJTextField6() {
		if (jTextField6 == null) {
			jTextField6 = new JTextField();
			jTextField6.addKeyListener(new KeyAdapter() {
				public void keyTyped(KeyEvent e) {
					jLabel16.setText(null);
					int keyChar = e.getKeyChar();
					if (keyChar >= KeyEvent.VK_0 && keyChar <= KeyEvent.VK_9||keyChar == '.') {

					} else {
						e.consume(); // 关键，屏蔽掉非法输入
						jLabel16.setText("请输入>0的数字");
					}
				}
			});	
		}
		return jTextField6;
	}

	private JTextField getJTextField5() {
		if (jTextField5 == null) {
			jTextField5 = new JTextField();
			jTextField5.setText(null);
			jTextField5.addKeyListener(new KeyAdapter() {
				public void keyTyped(KeyEvent e) {
					jLabel15.setText(null);
					int keyChar = e.getKeyChar();
					if (keyChar >= KeyEvent.VK_0 && keyChar <= KeyEvent.VK_9||keyChar == '.') {

					} else {
						e.consume(); // 关键，屏蔽掉非法输入
						jLabel15.setText("请输入>0的数字");
					}
				}
			});	
		}
		return jTextField5;
	}

	private JLabel getJLabel12() {
		if (jLabel12 == null) {
			jLabel12 = new JLabel();
			jLabel12.setText("年限");
		}
		return jLabel12;
	}

	private JLabel getJLabel11() {
		if (jLabel11 == null) {
			jLabel11 = new JLabel();
			jLabel11.setText("利息");
		}
		return jLabel11;
	}

	private JLabel getJLabel10() {
		if (jLabel10 == null) {
			jLabel10 = new JLabel();
			jLabel10.setText("本金");
		}
		return jLabel10;
	}

	private JComboBox getJComboBox2() {
		if (jComboBox2 == null) {
			jComboBox2 = new JComboBox();
			jComboBox2.setModel(new DefaultComboBoxModel(new Object[] { "A项目","B项目","C项目" }));
			jComboBox2.setDoubleBuffered(false);
			jComboBox2.setBorder(null);
		}
		return jComboBox2;
	}

	private JButton getJButton0() {
		if (jButton0 == null) {
			jButton0 = new JButton();
			jButton0.setText("投资运算");
			jButton0.addMouseListener(new MouseAdapter() {
	
				public void mouseClicked(MouseEvent event) {
					jButton0MouseMouseClicked(event);
				}
			});
		}
		return jButton0;
	}

	private JLabel getJLabel9() {
		if (jLabel9 == null) {
			jLabel9 = new JLabel();
			jLabel9.setText(null);
			jLabel9.setFont(new   java.awt.Font("Dialog",   0,   11));   
			jLabel9.setForeground(Color.red);
		}
		return jLabel9;
	}

	private JLabel getJLabel8() {
		if (jLabel8 == null) {
			jLabel8 = new JLabel();
			jLabel8.setText(null);
			//设置字体大小，1是粗体，0是正常
			jLabel8.setFont(new   java.awt.Font("Dialog",   0,   11));   
			//设置字体颜色
			jLabel8.setForeground(Color.red);
		}	
		return jLabel8;
	}

	private JLabel getJLabel7() {
		if (jLabel7 == null) {
			jLabel7 = new JLabel();
			jLabel7.setText(null);	
			jLabel7.setFont(new   java.awt.Font("Dialog",   0,   11));   
			jLabel7.setForeground(Color.red);
		}
		return jLabel7;
	}

	private JLabel getJLabel5() {
		if (jLabel5 == null) {
			jLabel5 = new JLabel();
			jLabel5.setText(null);
			jLabel5.setFont(new   java.awt.Font("Dialog",   0,   11));   
			jLabel5.setForeground(Color.red);
		}
		return jLabel5;
	}

	private JLabel getJLabel6() {
		if (jLabel6 == null) {
			jLabel6 = new JLabel();
			jLabel6.setText(null);
		}
		return jLabel6;
	}

	private JLabel getJLabel4() {
        if (jLabel4 == null) {
            jLabel4 = new JLabel();
            jLabel4.setText("%");
        }
        return jLabel4;
    }

    private JButton getJButton1() {
        if (jButton1 == null) {
            jButton1 = new JButton();
            jButton1.setText("确定");
            jButton1.addMouseListener(new MouseAdapter() {
    
                public void mouseClicked(MouseEvent event) {
                    jButton1MouseMouseClicked(event);
                }
            });
        }
        return jButton1;
    }

    private JComboBox getJComboBox1() {
        if (jComboBox1 == null) {
            jComboBox1 = new JComboBox();
            jComboBox1.setModel(new DefaultComboBoxModel(new Object[] { "复利计算", "单利计算" }));
            jComboBox1.setDoubleBuffered(false);
            jComboBox1.setBorder(null);
            jComboBox1.addMouseListener(new MouseAdapter() {
            });
        }
        return jComboBox1;
    }

    private JComboBox getJComboBox0() {
        if (jComboBox0 == null) {
            jComboBox0 = new JComboBox();
            jComboBox0.setModel(new DefaultComboBoxModel(new Object[] { "终值计算", "本金计算" ,"年限计算","利率计算","基金定投","等额本息还款"}));
            jComboBox0.setDoubleBuffered(false);
            jComboBox0.setBorder(null);
            jComboBox0.addMouseListener(new MouseAdapter() {
        });
        }
        return jComboBox0;
    }

    private JTextField getJTextField3() {
        if (jTextField3 == null) {
            jTextField3 = new JTextField(10);
        }
        return jTextField3;
    }

    private JTextField getJTextField2() {
        if (jTextField2 == null) {
            jTextField2 = new JTextField();
            jTextField2.addKeyListener(new  KeyAdapter(){
				public void keyTyped(KeyEvent e) {
					jLabel7.setText(null);
					int keyChar = e.getKeyChar();
					if (keyChar >= KeyEvent.VK_0 && keyChar <= KeyEvent.VK_9||keyChar == '.') {

					} else {
						e.consume(); // 关键，屏蔽掉非法输入
						jLabel7.setText("输入有误，请输入数字");
					}
				}
			});
		}
        return jTextField2;
    }

    private JTextField getJTextField1() {
        if (jTextField1 == null) {
            jTextField1 = new JTextField(10);
           // 限制只能输入数字
			jTextField1.addKeyListener(new KeyAdapter() {
				public void keyTyped(KeyEvent e) {
					jLabel8.setText(null);
					int keyChar = e.getKeyChar();
					if (keyChar >= KeyEvent.VK_0 && keyChar <= KeyEvent.VK_9||keyChar == '.') {

					} else {
						e.consume(); // 关键，屏蔽掉非法输入
						jLabel8.setText("输入有误，请输入数字");
					}
				}
			});	
		}
        return jTextField1;
    }

    private JTextField getJTextField0() {
		if (jTextField0 == null) {
			jTextField0 = new JTextField(10);
			// 限制只能输入数字
			jTextField0.addKeyListener(new KeyAdapter() {
				public void keyTyped(KeyEvent e) {
					jLabel5.setText(null);
					int keyChar = e.getKeyChar();
					if (keyChar >= KeyEvent.VK_0 && keyChar <= KeyEvent.VK_9||keyChar == '.') {

					} else {
						e.consume(); // 关键，屏蔽掉非法输入
						jLabel5.setText("输入有误，请输入数字");
					}
				}
			});	
		}
		return jTextField0;
	}

    private JLabel getJLabel3() {
        if (jLabel3 == null) {
            jLabel3 = new JLabel();
            jLabel3.setText("终值");
        }
        return jLabel3;
    }

    private JButton getJButton4() {
        if (jButton4 == null) {
            jButton4 = new JButton();
            jButton4.setText("确定");
            jButton4.addMouseListener(new MouseAdapter() {
    
                public void mouseClicked(MouseEvent event) {
                    jButton4MouseMouseClicked(event);
                }
            });
        }
        return jButton4;
    }

    private JLabel getJLabel2() {
        if (jLabel2 == null) {
            jLabel2 = new JLabel();
            jLabel2.setText("年利率");
        }
        return jLabel2;
    }
    
    private JPanel getJPanel0() {
		if (jPanel0 == null) {
			jPanel0 = new JPanel();
			jPanel0.setBorder(new LineBorder(Color.red, 1, false));
			jPanel0.setLayout(new GroupLayout());
			jPanel0.add(getJComboBox0(), new Constraints(new Leading(14, 10, 10), new Leading(20, 10, 10)));
			jPanel0.add(getJPanel1(), new Constraints(new Leading(22, 261, 10, 10), new Leading(74, 264, 10, 10)));
			jPanel0.add(getJButton1(), new Constraints(new Leading(155, 10, 10), new Leading(20, 12, 12)));
		}
		return jPanel0;
	}

	private JPanel getJPanel1() {
		if (jPanel1 == null) {
			jPanel1 = new JPanel();
			jPanel1.setBorder(new LineBorder(Color.black, 1, false));
			jPanel1.setLayout(new GroupLayout());
			jPanel1.add(getJLabel0(), new Constraints(new Leading(14, 10, 10), new Leading(26, 10, 10)));
			jPanel1.add(getJLabel1(), new Constraints(new Leading(14, 12, 12), new Leading(113, 10, 10)));
			jPanel1.add(getJLabel3(), new Constraints(new Leading(14, 12, 12), new Leading(215, 10, 10)));
			jPanel1.add(getJLabel6(), new Constraints(new Leading(56, 12, 12), new Leading(215, 12, 12)));
			jPanel1.add(getJTextField0(), new Constraints(new Leading(86, 168, 10, 10), new Leading(26, 12, 12)));
			jPanel1.add(getJTextField2(), new Constraints(new Leading(86, 168, 12, 12), new Leading(68, 12, 12)));
			jPanel1.add(getJTextField1(), new Constraints(new Leading(86, 168, 12, 12), new Leading(111, 12, 12)));
			jPanel1.add(getJTextField3(), new Constraints(new Leading(90, 164, 12, 12), new Leading(215, 12, 12)));
			jPanel1.add(getJLabel4(), new Constraints(new Leading(64, 26, 10, 10), new Leading(70, 12, 12)));
			jPanel1.add(getJButton4(), new Constraints(new Leading(140, 12, 12), new Leading(162, 10, 10)));
			jPanel1.add(getJLabel5(), new Constraints(new Leading(86, 168, 12, 12), new Leading(48, 10, 10)));
			jPanel1.add(getJLabel7(), new Constraints(new Leading(86, 168, 12, 12), new Leading(92, 10, 10)));
			jPanel1.add(getJLabel8(), new Constraints(new Leading(86, 168, 12, 12), new Leading(137, 12, 12)));
			jPanel1.add(getJLabel2(), new Constraints(new Leading(11, 12, 12), new Leading(70, 12, 12)));
			jPanel1.add(getJLabel9(), new Constraints(new Leading(90, 160, 12, 12), new Leading(239, 12, 12)));
		}
		return jPanel1;
	}

	private JLabel getJLabel1() {
        if (jLabel1 == null) {
            jLabel1 = new JLabel();
            jLabel1.setText("年限");
        }
        return jLabel1;
    }

    private JLabel getJLabel0() {
        if (jLabel0 == null) {
            jLabel0 = new JLabel();
            jLabel0.setText("本金");
        }
        return jLabel0;
    }

    private static void installLnF() {
        try {
            String lnfClassname = PREFERRED_LOOK_AND_FEEL;
            if (lnfClassname == null)
                lnfClassname = UIManager.getCrossPlatformLookAndFeelClassName();
            UIManager.setLookAndFeel(lnfClassname);
        } catch (Exception e) {
            System.err.println("Cannot install " + PREFERRED_LOOK_AND_FEEL + " on this platform:" + e.getMessage());
        }
    }

    /**
    * Main entry of the class.
    * Note: This class is only created so that you can easily preview the result at runtime.
    * It is not expected to be managed by the designer.
    * You can modify it as you like.
    */
    public static void main(String[] args) {
        installLnF();
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                fuli_6 frame = new fuli_6();
                frame.setDefaultCloseOperation(fuli_6.EXIT_ON_CLOSE);
                frame.setTitle("复利、单利计算 ");
                frame.getContentPane().setPreferredSize(frame.getSize());
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
    
    //终值，本金
    private void jButton1MouseMouseClicked(MouseEvent event) {
        if (jComboBox0.getSelectedItem() == "终值计算") {  
            jLabel6.setText(null);
            jLabel4.setText("%");
            this.jLabel0.setText("本金");
            this.jLabel2.setText("年利率");
            this.jLabel3.setText("终值");
            this.jLabel1.setText("年限");
        }
        else if (jComboBox0.getSelectedItem() == "本金计算") {
            jLabel6.setText(null);
            jLabel4.setText("%");
            this.jLabel0.setText("终值");
            this.jLabel3.setText("本金"); 
            this.jLabel2.setText("年利率");
            this.jLabel1.setText("年限");
        } 
        else if (jComboBox0.getSelectedItem() == "年限计算") {
            jLabel6.setText(null);
            jLabel4.setText("%");
            this.jLabel0.setText("本金");
            this.jLabel1.setText("终值");
            this.jLabel2.setText("年利率");
            this.jLabel3.setText("年限");
        } 
        else if (jComboBox0.getSelectedItem() == "利率计算") {
            jLabel4.setText(null);
            jLabel6.setText("%");
            this.jLabel0.setText("本金");
            this.jLabel3.setText("年利率");
            this.jLabel2.setText("终值");
            this.jLabel1.setText("年限");
        } 
        else if (jComboBox0.getSelectedItem() == "基金定投") {
            jLabel6.setText(null);
            jLabel4.setText("%");
            this.jLabel0.setText("每期定投");
            this.jLabel2.setText(" 收益率");
            this.jLabel3.setText("预期收益");
            this.jLabel1.setText("定投期数(年)");
        }
        else if (jComboBox0.getSelectedItem() == "等额本息还款") {
            jLabel6.setText(null);
            jLabel4.setText("%");
            this.jLabel0.setText("贷款");
            this.jLabel2.setText("年利率");
            this.jLabel3.setText("每月还款");
            this.jLabel1.setText("期限(月)");
        }
    }
   
    //计算
    public void run(){
		try {
			double f = 0;
			// 当输入值为空时，计算结果返回0
			if (jTextField0.getText().equals("") || jTextField1.getText().equals("")|| jTextField2.getText().equals("")) {
				jLabel5.setText("请输入>0的数字");
				jLabel7.setText("请输入>0的数字");
				jLabel8.setText("请输入>0的数字");
				jLabel9.setText("请正确输入数据在执行运算");
			} else {
				NumberFormat currencyformatter = NumberFormat.getCurrencyInstance(); // 字符串转化为数字
				float p = Float.parseFloat(jTextField0.getText());
				float r = Float.parseFloat(jTextField2.getText());
				float n = Float.parseFloat(jTextField1.getText());
				if (p <= 0) 
				{
					jLabel5.setText("请输入>0的数字");
					jLabel9.setText("请正确输入数据在执行运算");
				} 
				if (n <= 0)
				{
					jLabel8.setText("请输入>0的数字");
					jLabel9.setText("请正确输入数据在执行运算");
				}
				if (r <= 0) 
				{
					jLabel7.setText("请输入>0的数字");
					jLabel9.setText("请正确输入数据在执行运算");
				} 
				if(p>0&&n>0&&r>0){
					if (jComboBox1.getSelectedItem() == "复利计算") {
						if (jComboBox0.getSelectedItem() == "终值计算") {
							f = p * Math.pow((1 + 0.01 * r), n);
						}
						if (jComboBox0.getSelectedItem() == "本金计算") {
							f = p / Math.pow((1 + 0.01 * r), n);
						} else if (jComboBox0.getSelectedItem() == "年限计算") {
							f = (Math.log(n / p)) / (Math.log(1 + 0.01 * r));
						} else if (jComboBox0.getSelectedItem() == "利率计算") {
							f = 100 * (Math.pow(r / p, 1d / n) - 1);
						} else if (jComboBox0.getSelectedItem() == "基金定投") {
							f = p * (1 + 0.01 * r) * (-1 + Math.pow(1 + 0.01 * r, n)) / (0.01 * r);
						} else if (jComboBox0.getSelectedItem() == "等额本息还款") {
							f = p * ((0.01 * r / 12) * Math.pow((1 + 0.01 * r / 12), n))
									/ (Math.pow((1 + 0.01 * r / 12), n) - 1);
						}
					} else {
						if (jComboBox0.getSelectedItem() == "终值计算") {
							f = p * (1 + 0.01 * r * n);
						} else if (jComboBox0.getSelectedItem() == "本金计算") {
							f = p / (1 + 0.01 * r * n);
						} else if (jComboBox0.getSelectedItem() == "年限计算") {
							f = ((n / p) - 1) / (0.01 * r);
						} else if (jComboBox0.getSelectedItem() == "利率计算") {
							f = 100 * (((r / p) - 1) / n);
						}
					}

					DecimalFormat df = new DecimalFormat("0.00");
					String db = df.format(f);
					jTextField3.setText(String.valueOf(db));
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

    //复利计算
    private void jButton4MouseMouseClicked(MouseEvent event) {
    	run();
    }

    
    String[][] num= new String[10][10];
    String db;
    int i=0,j,t;
	private JTextArea jTextArea0;
	private JScrollPane jScrollPane1;
	private JLabel jLabel13;
	private JLabel jLabel14;
	private JLabel jLabel15;
	private JLabel jLabel16;
	private JLabel jLabel17;
	private JLabel jLabel18;
	private static final String PREFERRED_LOOK_AND_FEEL = "javax.swing.plaf.metal.MetalLookAndFeel";
	//投资运算
	private void jButton0MouseMouseClicked(MouseEvent event) { 
		
		double f = 0;
		i = t;
		if (jTextField5.getText().equals("") || jTextField6.getText().equals("") || jTextField7.getText().equals("")) {
			jLabel15.setText("请输入>0的数字");
			jLabel16.setText("请输入>0的数字");
			jLabel17.setText("请输入>0的数字");
			jTextArea0.setText(null);
		}
		else {
			NumberFormat currencyformatter = NumberFormat.getCurrencyInstance(); // 字符串转化为数字
			float p = Float.parseFloat(jTextField5.getText());
			float r = Float.parseFloat(jTextField6.getText());
			float n = Float.parseFloat(jTextField7.getText());
			if (p <= 0) {
				jLabel15.setText("请输入>0的数字");
				
			}
			if (n <= 0) {
				jLabel16.setText("请输入>0的数字");
				jTextArea0.setText(null);
			}
			if (r <= 0) {                                                                            
				jLabel17.setText("请输入>0的数字");
				jTextArea0.setText(null);
			}
			if (p > 0 && n > 0 && r > 0) {
				if (jComboBox2.getSelectedItem() == "A项目") {
					jTextArea0.setText("投资A项目:\n");
					num[0][0] = "A项目";
					for (int t = 1; t <= n; t++) {
						f = p / Math.pow((1 + r), t);
						DecimalFormat df = new DecimalFormat("0.00");
						db = df.format(f);
						jTextArea0.append("第" + t + "年\t现值为 ：" + db + "\n");
					}

				}
				else if (jComboBox2.getSelectedItem() == "B项目") {
					jTextArea0.setText("投资B项目:\n");
					num[1][0] = "B项目";
					for (int t = 1; t <= n; t++) {
						f = p * (1 + r * t);
						DecimalFormat df = new DecimalFormat("0.00");
						db = df.format(f);
						jTextArea0.append("第" + t + "年\t现值为 ：" + db + "\n");
					}
				} 
				else if (jComboBox2.getSelectedItem() == "C项目") {
					jTextArea0.setText("投资C项目:\n");
					num[2][0] = "C项目";
					for (int t = 1; t <= n; t++) {
						f = p * (1 + r * t) + p * r;
						DecimalFormat df = new DecimalFormat("0.00");
						db = df.format(f);
						jTextArea0.append("第" + t + "年\t现值为 ：" + db + "\n");
					}
				}
				num[i][1] = jTextField5.getText();
				num[i][2] = jTextField6.getText();
				num[i][3] = jTextField7.getText();
				num[i][4] = String.valueOf(db);
				i++;
				t = i;
			}
			WriteFile();
		}
	}

    
    public void WriteFile(){
        File newfile=new File("recoad.txt");
        FileOutputStream fos;
        try {
            fos = new FileOutputStream(newfile);
            OutputStreamWriter osw=new OutputStreamWriter(fos,"UTF-8");
            BufferedWriter bw=new BufferedWriter(osw);
    		for(i=0;i<3;i++)
    		{
    			for(j=0;j<6;j++)
    			{
    				if(num[i][j]==null)
    					bw.write(" "+"\t");
    				else
    					bw.write(num[i][j]+"\t");
    			}
    		}
            bw.close();
            osw.close();
            fos.close();
        } catch (FileNotFoundException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        } catch (IOException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }
        
    }
    
	public void ReadFile(){
        File file1=new File("recoad.txt");
        if(file1.exists()){
            
            try {
                FileInputStream fis=new FileInputStream(file1);
                InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
                BufferedReader br=new BufferedReader(isr);
                
                String line;
                String output="项目名\t投入本金\t利息\t年限\t现值\n";
                while((line=br.readLine())!=null){
                	 output=output+line+"\r\n";
                }
                jTextArea0.setText(output);
                              //先创建的后关闭，后创建的先关闭
                br.close();
                isr.close();
                fis.close();
            } catch (UnsupportedEncodingException e) {
                // TODO 自动生成的 catch 块
                e.printStackTrace();
            } catch (FileNotFoundException e) {
                // TODO 自动生成的 catch 块
                e.printStackTrace();
            } catch (IOException e) {
                // TODO 自动生成的 catch 块
                e.printStackTrace();
            }
        }
    } 
	
	private String SQLinsert(){
	    String line = "";
	    Connection conn=null;
	    ResultSet rs=null;
	    try {
	        Class.forName("com.mysql.jdbc.Driver");
	        conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/fuli","root","0000");
	        String sql="SELECT * FROM fuli"+"insert fuli values('1','2','3','4','5')";
	        Statement st=conn.createStatement();
	        rs=st.executeQuery(sql);
	        st.close();
	        rs.close();
	        conn.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return line;
	}
	
	//投资项目及盈利状况
	private void jButton2MouseMouseClicked(MouseEvent event) {
		ReadFile();
	}
}
