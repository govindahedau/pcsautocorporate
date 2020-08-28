package view;
import javax.swing.*;

import controller.EmployeeController;
import model.Employee;

import java.awt.event.*;
public class RegistrationFrame extends JFrame{
	private static final long serialVersionUID = 1L;
	JLabel lFirstName,lLastName,lUserId,lPassword,lGender,lRole;
	JTextField tFirstName,tLastName,tUserId,tPassword,tGender,tRole;
	JButton bRegister,bReset;
	EmployeeController controller=new EmployeeController();
	public RegistrationFrame() {
		lFirstName=new JLabel("First Name");
		lFirstName.setBounds(50, 20, 150, 25);
		lLastName=new JLabel("Last Name");
		lLastName.setBounds(50, 60, 150, 25);
		lUserId=new JLabel("User Id");
		lUserId.setBounds(50, 100, 150, 25);
		lPassword=new JLabel("Password");
		lPassword.setBounds(50, 140, 150, 25);
		lGender=new JLabel("Gender");
		lGender.setBounds(50, 180, 150, 25);
		lRole=new JLabel("Role");
		lRole.setBounds(50, 220, 400, 25);
		tFirstName=new JTextField();
		tFirstName.setBounds(120, 20, 150, 25);
		tLastName=new JTextField();
		tLastName.setBounds(120, 60, 150, 25);
		tUserId=new JTextField();
		tUserId.setBounds(120, 100, 150, 25);
		tPassword=new JTextField();
		tPassword.setBounds(120, 140, 150, 25);
		tGender=new JTextField();
		tGender.setBounds(120, 180, 150, 25);
		tRole=new JTextField();
		tRole.setBounds(120, 220, 150, 25);
		bRegister=new JButton("Confirm Register");
		bRegister.setBounds(20,260,150, 25);
		bRegister.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Employee emp=new Employee(tFirstName.getText(),tLastName.getText(),tUserId.getText(),tPassword.getText(),tRole.getText(),tGender.getText());
				controller.addEmployee(emp);
				
			}
			
		});
		bReset=new JButton("Reset");
		bReset.setBounds(150, 260,150, 25);
		bReset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tFirstName.setText(null);
				tLastName.setText(null);
				tUserId.setText(null);
				tPassword.setText(null);
				tGender.setText(null);
				tGender.setText(null);
				tRole.setText(null);
			}
			
		});
		add(lFirstName);
		
		add(lLastName);
		add(lUserId);
		add(lPassword);
		add(lGender);
		add(lRole);
		add(tFirstName);
		
		add(tLastName);
		add(tUserId);
		add(tPassword);
		add(tGender);
		add(tRole);
		add(bRegister);
		add(bReset);
		
		setSize(500,500);
		setLayout(null);
		//setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}