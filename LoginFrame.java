package view;
import javax.swing.*;
import java.awt.event.*;
public class LoginFrame extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	JLabel lTitle, lUser,lPassword,lRole;
	JTextField tUser,tRole;
	JPasswordField tPassword;
	JButton bLogin;
	JButton bregister;
	public LoginFrame() {
		lTitle=new JLabel("Login Here");
		lTitle.setBounds(180, 20, 150, 25);
		lUser=new JLabel("User Id");
		lUser.setBounds(50, 80, 150, 25);
		lPassword=new JLabel("Password");
		lPassword.setBounds(50, 140, 150, 25);
		lRole=new JLabel("Role");
		lRole.setBounds(50, 200, 150, 25);
		tUser=new JTextField();
		tUser.setBounds(200, 80, 150, 25);
		tPassword=new JPasswordField();
		tPassword.setBounds(200, 140, 150, 25);
		tPassword.setEchoChar('*');
		tRole=new JTextField();
		tRole.setBounds(200, 200, 150, 25);
		bLogin=new JButton("Login");
		bLogin.setBounds(180, 250,150, 25);
		bLogin.addActionListener(this);
		bregister=new JButton("register");
		bregister.setBounds(180, 300,150, 25);
		bregister.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				RegistrationFrame register=new RegistrationFrame();
				register.setVisible(true);
				
			}
			
		});
	
		add(lTitle);
		add(lUser);
		add(lPassword);
		add(lRole);
		add(tUser);
		add(tPassword);
		add(tRole);
		add(bLogin);
		add(bregister);
		
		setSize(500,500);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e) {
		try {
			String id=tUser.getText();
			String password=tPassword.getText();
			
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}
