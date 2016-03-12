package fuli;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
public class fuli_2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel jLabel0;
	private JLabel jLabel1;
	private JPanel jPanel1;
	private JPanel jPanel0;
	private JLabel jLabel2;
	private JButton jButton4;
	private JLabel jLabel3;
	private JTextField jTextField0;
	private JTextField jTextField1;
	private JTextField jTextField2;
	private JTextField jTextField3;
	private static final MouseEvent event2 = null;
	private JComboBox jComboBox0;
	private JComboBox jComboBox1;
	private JButton jButton1;
	private JLabel jLabel4;
	private static final String PREFERRED_LOOK_AND_FEEL = "javax.swing.plaf.metal.MetalLookAndFeel";
	public fuli_2() {
		initComponents();
	}

	private void initComponents() {
		setLayout(new GroupLayout());
		add(getJPanel0(), new Constraints(new Leading(9, 304, 10, 10), new Leading(80, 361, 10, 10)));
		add(getJComboBox1(), new Constraints(new Leading(23, 10, 10), new Leading(19, 10, 10)));
		setSize(320, 449);
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
			jButton1.setText("ȷ��");
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
			jComboBox1.setModel(new DefaultComboBoxModel(new Object[] { "��������", "��������" }));
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
			jComboBox0.setModel(new DefaultComboBoxModel(new Object[] { "��ֵ����", "�������" ,"���޼���","��Ϣ����"}));
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
		}
		return jTextField2;
	}

	private JTextField getJTextField1() {
		if (jTextField1 == null) {
			jTextField1 = new JTextField(10);
		}
		return jTextField1;
	}

	private JTextField getJTextField0() {
		if (jTextField0 == null) {
			jTextField0 = new JTextField(10);
		}
		return jTextField0;
	}

	private JLabel getJLabel3() {
		if (jLabel3 == null) {
			jLabel3 = new JLabel();
			jLabel3.setText("��ֵ");
		}
		return jLabel3;
	}

	private JButton getJButton4() {
		if (jButton4 == null) {
			jButton4 = new JButton();
			jButton4.setText("ȷ��");
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
			jLabel2.setText("����");
		}
		return jLabel2;
	}
	
	private JPanel getJPanel0() {
		if (jPanel0 == null) {
			jPanel0 = new JPanel();
			jPanel0.setBorder(new LineBorder(Color.red, 1, false));
			jPanel0.setLayout(new GroupLayout());
			jPanel0.add(getJPanel1(), new Constraints(new Leading(17, 261, 10, 10), new Leading(74, 264, 10, 10)));
			jPanel0.add(getJComboBox0(), new Constraints(new Leading(14, 10, 10), new Leading(20, 10, 10)));
			jPanel0.add(getJButton1(), new Constraints(new Leading(119, 10, 10), new Leading(19, 12, 12)));
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
			jPanel1.add(getJLabel2(), new Constraints(new Leading(12, 12, 12), new Leading(70, 10, 10)));
			jPanel1.add(getJButton4(), new Constraints(new Leading(74, 10, 10), new Leading(161, 10, 10)));
			jPanel1.add(getJLabel3(), new Constraints(new Leading(14, 12, 12), new Leading(215, 10, 10)));
			jPanel1.add(getJTextField0(), new Constraints(new Leading(60, 182, 10, 10), new Leading(26, 12, 12)));
			jPanel1.add(getJTextField3(), new Constraints(new Leading(60, 178, 12, 12), new Leading(213, 12, 12)));
			jPanel1.add(getJTextField1(), new Constraints(new Leading(60, 182, 12, 12), new Leading(113, 12, 12)));
			jPanel1.add(getJLabel4(), new Constraints(new Leading(56, 26, 12, 12), new Leading(72, 12, 12)));
			jPanel1.add(getJTextField2(), new Constraints(new Leading(74, 158, 12, 12), new Leading(70, 12, 12)));
		}
		return jPanel1;
	}

	private JLabel getJLabel1() {
		if (jLabel1 == null) {
			jLabel1 = new JLabel();
			jLabel1.setText("����");
		}
		return jLabel1;
	}

	private JLabel getJLabel0() {
		if (jLabel0 == null) {
			jLabel0 = new JLabel();
			jLabel0.setText("����");
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
				fuli_2 frame = new fuli_2();
				frame.setDefaultCloseOperation(fuli_2.EXIT_ON_CLOSE);
				frame.setTitle("�������������� ");
				frame.getContentPane().setPreferredSize(frame.getSize());
				frame.pack();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
	}

	//��ֵ������
	private void jButton1MouseMouseClicked(MouseEvent event) {

		if (jComboBox0.getSelectedItem() == "��ֵ����") {
			jPanel1 = new JPanel();
			jTextField0 = new JTextField();
			jTextField1 = new JTextField();
			jTextField2 = new JTextField();
			jTextField3 = new JTextField();

		}
		else if (jComboBox0.getSelectedItem() == "�������") {
			jPanel1 = new JPanel();
			this.jLabel0.setText("��ֵ");
			this.jLabel3.setText("����");
		} 
		else if (jComboBox0.getSelectedItem() == "���޼���") {
			jPanel1 = new JPanel();
			this.jLabel0.setText("����");
			this.jLabel1.setText("��ֵ");
			this.jLabel3.setText("����");
		} 
		else if (jComboBox0.getSelectedItem() == "��Ϣ����") {
			jPanel1 = new JPanel();
			this.jLabel0.setText("����");
			this.jLabel3.setText("��Ϣ");
			this.jLabel1.setText("����");
		}
	}
	
	private void jButton4MouseMouseClicked(MouseEvent event) {
		NumberFormat currencyformatter = NumberFormat.getCurrencyInstance(); // �ַ���ת��Ϊ����
		double p = Double.parseDouble(jTextField0.getText());
		double r = Double.parseDouble(jTextField1.getText());
		double n = Double.parseDouble(jTextField2.getText());
		double f=0;
		if (jComboBox1.getSelectedItem() == "��������") {
			 
			if (jComboBox0.getSelectedItem() == "��ֵ����") {
				f = p * Math.pow((1 + 0.01*r),n);
			} 
			else if (jComboBox0.getSelectedItem() == "�������") {
				f = p/Math.pow((1+0.01*r), n);
			} 
			else if (jComboBox0.getSelectedItem() == "���޼���") {
				f=0;
			}
			else if (jComboBox0.getSelectedItem() == "��Ϣ����") {
				f=p * Math.pow((1 + 0.01*r),n)-1;
			}
		}
		else {
			if (jComboBox0.getSelectedItem() == "��ֵ����") {
				f = p*(1+0.01*r*n);
			}
			else if (jComboBox0.getSelectedItem() == "�������") {
				f = p/(1+0.01*r*n);
			} 
			else if (jComboBox0.getSelectedItem() == "���޼���") {
				f=0;
			}
			else if (jComboBox0.getSelectedItem() == "��Ϣ����") {
				f=p*(1+0.01*r*n)-p;
			}
		}
		jTextField3.setText(String.valueOf(f));
	}
}
