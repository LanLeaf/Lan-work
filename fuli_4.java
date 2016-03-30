package fuli_4;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;

//VS4E -- DO NOT REMOVE THIS LINE!
public class fuli_4 extends JFrame {

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
    private static final MouseEvent event2 = null;
    private JComboBox jComboBox0;
    private JComboBox jComboBox1;
    private JButton jButton1;
    private JLabel jLabel4;
    private JLabel jLabel6;
	private JTextField jTextField4;
	private JLabel jLabel5;
	private JLabel jLabel7;
	private JLabel jLabel8;
	private static final String PREFERRED_LOOK_AND_FEEL = "javax.swing.plaf.metal.MetalLookAndFeel";
	public fuli_4() {
        initComponents();
    }

    private void initComponents() {
        setLayout(new GroupLayout());
        add(getJPanel0(), new Constraints(new Leading(9, 304, 10, 10), new Leading(80, 361, 10, 10)));
        add(getJComboBox1(), new Constraints(new Leading(23, 10, 10), new Leading(19, 10, 10)));
        setSize(320, 449);
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
                fuli_4 frame = new fuli_4();
                frame.setDefaultCloseOperation(fuli_4.EXIT_ON_CLOSE);
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
				f = 0.0;
			} else {
				NumberFormat currencyformatter = NumberFormat.getCurrencyInstance(); // 字符串转化为数字
				float p = Float.parseFloat(jTextField0.getText());
				float r = Float.parseFloat(jTextField2.getText());
				float n = Float.parseFloat(jTextField1.getText());
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
			}
			DecimalFormat df = new DecimalFormat("0.00");
			String db = df.format(f);
			jTextField3.setText(String.valueOf(db));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

    private void jButton4MouseMouseClicked(MouseEvent event) {
    	run();
    }   	
}
